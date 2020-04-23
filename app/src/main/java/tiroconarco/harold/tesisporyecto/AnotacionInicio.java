package tiroconarco.harold.tesisporyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AnotacionInicio extends AppCompatActivity {

    private ListView listView;
    private TextView textListView;
    ActionMode actionMode;
    //array informacion q se va mostrar
    ArrayList<String> listaInformacion;
    //array de lista usuario
    ArrayList<DatosRonda> listaRonda;
    AdminSQLiteOpenHelper con;

    DatosRonda ronda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotacion_inicio);

        listView = (ListView) findViewById(R.id.listView);
        textListView=(TextView) findViewById(R.id.textListView);

        //conexion con la base de datos
         con= new AdminSQLiteOpenHelper(getApplicationContext(),Utilidades.NOMBRE_BD,null,1);


        //consulatr los datos 
        consultarListaDatos();
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listaInformacion);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String obtenido=listaRonda.get(position).getTipoRonda().toString();
                Integer idRonda=listaRonda.get(position).getId();
                Long idRondaLong = Long.valueOf(idRonda);

                if (obtenido.equals("0")){
                    Intent intent=new Intent(AnotacionInicio.this,TableroPuntos.class);
                    startActivity(intent);
                }
                if (obtenido.equals("1")){
                    Intent intent=new Intent(AnotacionInicio.this,TableroPuntos2.class);
                    startActivity(intent);
                }
                if (obtenido.equals("2")){
                    Intent intent=new Intent(AnotacionInicio.this,TableroPuntos3.class);
                    intent.putExtra("idRonda",idRondaLong );
                    intent.putExtra("idTablero", idRondaLong);
                    intent.putExtra("deLista", true);
                    startActivity(intent);
                }
            }
        });


        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                //SQLiteDatabase db=con.getWritableDatabase();
                if(actionMode !=null){
                    return false;
                }
                actionMode=startSupportActionMode(mActionModeCallback);
                ronda=listaRonda.get(i);
                return true;
            }
        });

    }

    //consulta a la base de datos que te devuelve el registro de los datos
    private void consultarListaDatos() {
        SQLiteDatabase db = con.getReadableDatabase();
        listaRonda=new ArrayList<>();
        // sentencia select * from datos ronda
        Cursor cursor=  db.rawQuery("SELECT * FROM "+Utilidades.TABLA_RONDA+";",null);
        while(cursor.moveToNext()){
            DatosRonda datos=new DatosRonda();
            datos.setId(cursor.getInt(0));
            datos.setNombreArquero(cursor.getString(1));
            datos.setNombreClub(cursor.getString(2));
            datos.setNombreRonda(cursor.getString(3));
            datos.setFecha(cursor.getString(4));
            datos.setTipoRonda(cursor.getInt(5));
            listaRonda.add(datos);
        }
        obtenerLista();
    }


    private void obtenerLista() {

        listaInformacion= new ArrayList<String>();
            for(int i=0;i<listaRonda.size();i++){
                //se muestra -- aqui se obtiene ya los datos en este caso lo almacenado en nombre ronda listaInformacion.add(listaRonda.get(i).getNombreRonda()+"--"+listaRonda.get(i).getNombreClub());

                listaInformacion.add(listaRonda.get(i).getNombreRonda()+" "+" "+listaRonda.get(i).getFecha());
                //listaInformacion.add(listaRonda.get(i).getFecha());

            }
        if(listaInformacion.size()==0){
            listView.setVisibility(View.GONE);
            textListView.setVisibility(View.VISIBLE);
        }else{
            listView.setVisibility(View.VISIBLE);
            textListView.setVisibility(View.GONE);
        }

    }

    //metodo para el action mode o actionbar oculto

    private ActionMode.Callback mActionModeCallback=new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu me) {
            mode.getMenuInflater().inflate(R.menu.menuoculto,me);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem itemMe) {
            switch (itemMe.getItemId()){
                case R.id.editar:
                    Intent intent=new Intent(AnotacionInicio.this,EditarAnotacion.class);
                    Bundle bundle=new Bundle();
                    bundle.putSerializable("ronda",ronda);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    mode.finish();
                    return true;
                case R.id.eliminar:
                    AlertDialog.Builder builder=new AlertDialog.Builder(AnotacionInicio.this);
                    builder.setIcon(R.drawable.ic_delete_black);
                    builder.setTitle("Eliminar");
                    builder.setMessage("Desea eliminar la ronda");
                    builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            SQLiteDatabase db=con.getWritableDatabase();
                            String[] parametro={ronda.getId().toString()};
                            db.delete(Utilidades.TABLA_RONDA,Utilidades.CAMPO_ID_RONDA +"=?",parametro);
                            Toast.makeText(AnotacionInicio.this,"Se elimino correctamente",Toast.LENGTH_LONG).show();
                            db.close();
                            startActivity(getIntent());

                        }
                    }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();

                    mode.finish();

                    return true;
                default:
                    return false;
            }
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            actionMode=null;
        }
    };


    //metodo para el boton de crear
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.crearventana,menu);
        return true;
    }
    //metodo para agragar acciones de los botones
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id== R.id.nuevo){
            Intent intent=new Intent(AnotacionInicio.this,DatosObtener.class);
            startActivity(intent);
            return true;
        } return super.onOptionsItemSelected(item);
    }
}
