package tiroconarco.harold.tesisporyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DatosObtener extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private EditText campoArquero, campoClub, campoRonda;
    private View btncrear;
    private TextView fecha;
    protected ArrayAdapter<CharSequence> adapter;
    int valor, valor2;
    AdminSQLiteOpenHelper con;
    Long idResultanteRonda, idResultanteTablero;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_obtener);
        // flecha ir atras
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        con = new AdminSQLiteOpenHelper(DatosObtener.this, Utilidades.NOMBRE_BD, null, 1);


        campoArquero = (EditText) findViewById(R.id.textArquero);
        campoClub = (EditText) findViewById(R.id.textClub);
        campoRonda = (EditText) findViewById(R.id.textRonda);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        btncrear = (Button) findViewById(R.id.buttonCrear);
        fecha = (TextView) findViewById(R.id.textFechaVer);


        adapter = ArrayAdapter.createFromResource(this, R.array.Ronda, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        adapter = ArrayAdapter.createFromResource(this, R.array.Arco, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                valor = position;
                //selection=adapterView.getItemAtPosition(position).toString();
                //Toast.makeText(DatosObtener.this,"Selección actual: "+position,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                valor2 = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //boton crear al siguiente activity
        btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (valor == 0) {
                    Intent intent = new Intent(DatosObtener.this, TableroPuntos.class);
                    registrarRonda();
                    crearTablero();
                    intent.putExtra("idRonda", idResultanteRonda);
                    intent.putExtra("idTablero", idResultanteTablero);
                    startActivity(intent);
                } else if (valor == 1) {
                    Intent intent1 = new Intent(DatosObtener.this, TableroPuntos2.class);
                    registrarRonda();
                    crearTablero();
                    intent1.putExtra("idRonda", idResultanteRonda);
                    intent1.putExtra("idTablero", idResultanteTablero);
                    startActivity(intent1);
                } else if (valor == 2) {
                    Intent intent2 = new Intent(DatosObtener.this, TableroPuntos3.class);
                    registrarRonda();
                    crearTablero();
                    intent2.putExtra("idRonda", idResultanteRonda);
                    intent2.putExtra("idTablero", idResultanteTablero);
                    intent2.putExtra("deLista", false);

                    startActivity(intent2);
                }
            }

            private void registrarRonda() {
                //conexion a la base de datos

                SQLiteDatabase db = con.getWritableDatabase();

                ContentValues values = new ContentValues();

                values.put(Utilidades.CAMPO_ARQUERO, campoArquero.getText().toString());// mandamos de utilidades el campo y de aqui lo q se relaciona con el editext
                values.put(Utilidades.CAMPO_CLUB, campoClub.getText().toString());
                values.put(Utilidades.CAMPO_RONDA, campoRonda.getText().toString());
                values.put(Utilidades.CAMPO_FECHA, fecha.getText().toString());
                values.put(Utilidades.CAMPO_TIPORONDA, valor);
                values.put(Utilidades.CAMPO_TIPOARCO, valor2);

                try {
                    idResultanteRonda = db.insert(Utilidades.TABLA_RONDA, Utilidades.CAMPO_ID_RONDA, values);
                    db.close();
                    //Toast.makeText(getApplicationContext(),idResultanteRonda+" ronda creada",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
                }




            }

        });


        //mostrar fecha
        Time today = new Time(Time.getCurrentTimezone());
        today.setToNow();
        int dia = today.monthDay;
        int mes = today.month;
        int año = today.year;
        mes = mes + 1;
        fecha.setText(dia + "" + "/  " + mes + "" + "/ " + año);
    }

    private void crearTablero() {
        //conexion a la base de datos
        SQLiteDatabase db = con.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Utilidades.CAMPO_ID_RONDA, idResultanteRonda);

        try {
            idResultanteTablero = db.insert(Utilidades.TABLA_PUNTAJE, Utilidades.CAMPO_IDPUNTO, values);
            db.close();
           // Toast.makeText(getApplicationContext(),idResultanteTablero+" tablero creado",Toast.LENGTH_LONG).show();
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
        }


    }


}
