package tiroconarco.harold.tesisporyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PracticaInicio extends AppCompatActivity {

    private GridView gridView;
    TextView v;
    //String[] number={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    private ArrayList<CheckDia> number;
    AdminSQLiteOpenHelper conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_inicio);

        //flecha para ir hacia atras
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        gridView=(GridView)findViewById(R.id.gridViewPractica);
        conn = new AdminSQLiteOpenHelper(getApplicationContext(),"bd_practica", null,1);
        llenarListaDeDias();

        MyAdapter adapter=new MyAdapter(this,R.layout.grid_item,number);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                TextView v=(TextView)view.findViewById(R.id.txtViewGrid);
                if(position==0){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    Toast.makeText(PracticaInicio.this,""+view,Toast.LENGTH_LONG).show();
                    intent.putExtra("1",position);
                    // iniciamoa
                   startActivity(intent);


                }else if(position==1){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    Toast.makeText(PracticaInicio.this,""+view,Toast.LENGTH_LONG).show();
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==2){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==3){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==4){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==5){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==6){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==7){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==8){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==9){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==10){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==11){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==12){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==13){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==14){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==15){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==16){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==17){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==18){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==19){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==20){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==21){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==22){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==23){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==24){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==25){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==26){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==27){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==28){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }else if(position==29){
                    v.setText("");
                    v.setBackgroundResource(R.drawable.ic_check_circle);
                    Intent intent=new Intent(PracticaInicio.this,Calentamiento.class);
                    intent.putExtra("1",position);
                    // iniciamoa
                    startActivity(intent);
                }

            }
        });


    }

    private void llenarListaDeDias() {
        SQLiteDatabase db = conn.getReadableDatabase();
        number = new ArrayList<CheckDia>();
        Cursor cursor = db.rawQuery("SELECT * FROM "+Utilidades.TABLA_PRACTICA,null);

        while (cursor.moveToNext()){
            CheckDia dia = new CheckDia();
            dia.setId(cursor.getInt(0));
            dia.setNumeroDia(cursor.getString(1));
            dia.setCheckDia(cursor.getString(2));
            number.add(dia);
        }
    }

    //para que el boton de ir asia atraz del celular no funcione
    @Override
    public void onBackPressed(){

    }
}
