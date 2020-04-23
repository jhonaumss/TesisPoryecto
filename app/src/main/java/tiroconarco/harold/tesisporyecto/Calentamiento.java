package tiroconarco.harold.tesisporyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class Calentamiento extends AppCompatActivity {

    private Button btnca;
    private TextView txtTitulo;
    private GifImageView gifImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calentamiento);

        btnca=(Button)findViewById(R.id.calentamientoSiguiente);
        txtTitulo=(TextView)findViewById(R.id.tituloCalentamiento);
        gifImageView=(GifImageView)findViewById(R.id.gifCalentamiento);


        final int dato1=getIntent().getIntExtra("1",1);
        final int dato2=getIntent().getIntExtra("1",2);
        final int dato3=getIntent().getIntExtra("1",3);
        final int dato4=getIntent().getIntExtra("1",4);
        final int dato5=getIntent().getIntExtra("1",5);
        final int dato6=getIntent().getIntExtra("1",6);
        final int dato7=getIntent().getIntExtra("1",7);
        final int dato8=getIntent().getIntExtra("1",8);
        final int dato9=getIntent().getIntExtra("1",9);
        final int dato10=getIntent().getIntExtra("1",10);
        final int dato11=getIntent().getIntExtra("1",11);
        final int dato12=getIntent().getIntExtra("1",12);
        final int dato13=getIntent().getIntExtra("1",13);
        final int dato14=getIntent().getIntExtra("1",14);
        final int dato15=getIntent().getIntExtra("1",15);
        final int dato16=getIntent().getIntExtra("1",16);
        final int dato17=getIntent().getIntExtra("1",17);
        final int dato18=getIntent().getIntExtra("1",18);
        final int dato19=getIntent().getIntExtra("1",19);
        final int dato20=getIntent().getIntExtra("1",20);
        final int dato21=getIntent().getIntExtra("1",21);
        final int dato22=getIntent().getIntExtra("1",22);
        final int dato23=getIntent().getIntExtra("1",23);
        final int dato24=getIntent().getIntExtra("1",24);
        final int dato25=getIntent().getIntExtra("1",25);
        final int dato26=getIntent().getIntExtra("1",26);
        final int dato27=getIntent().getIntExtra("1",27);
        final int dato28=getIntent().getIntExtra("1",28);
        final int dato29=getIntent().getIntExtra("1",29);
        final int dato30=getIntent().getIntExtra("1",30);

        txtTitulo.setText(R.string.calentamiento);
        gifImageView.setImageResource(R.drawable.calemtamiento);


       if(dato1==0){
           btnca.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                   intent.putExtra("b",dato1);
                   startActivity(intent);
               }
           });
       }
        if(dato2==1){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato2);
                    startActivity(intent);
                }
            });
        }
        if(dato3==2){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato3);
                    startActivity(intent);
                }
            });
        }
        if(dato4==3){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato4);
                    startActivity(intent);
                }
            });
        }
        if(dato5==4){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato5);
                    startActivity(intent);
                }
            });
        }
        if(dato6==5){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato6);
                    startActivity(intent);
                }
            });
        }
        if(dato7==6){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato7);
                    startActivity(intent);
                }
            });
        }
        if(dato8==7){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato8);
                    startActivity(intent);
                }
            });
        }
        if(dato9==8){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato9);
                    startActivity(intent);
                }
            });
        }
        if(dato10==9){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato10);
                    startActivity(intent);
                }
            });
        }
        if(dato11==10){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato11);
                    startActivity(intent);
                }
            });
        }
        if(dato12==11){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato12);
                    startActivity(intent);
                }
            });
        }
        if(dato13==12){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato13);
                    startActivity(intent);
                }
            });
        }
        if(dato14==13){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato14);
                    startActivity(intent);
                }
            });
        }
        if(dato15==14){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato15);
                    startActivity(intent);
                }
            });
        }
        if(dato16==15){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato16);
                    startActivity(intent);
                }
            });
        }
        if(dato17==16){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato17);
                    startActivity(intent);
                }
            });
        }
        if(dato18==17){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato18);
                    startActivity(intent);
                }
            });
        }
        if(dato19==18){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato19);
                    startActivity(intent);
                }
            });
        }
        if(dato20==19){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato20);
                    startActivity(intent);
                }
            });
        }
        if(dato21==20){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato21);
                    startActivity(intent);
                }
            });
        }
        if(dato22==21){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato22);
                    startActivity(intent);
                }
            });
        }
        if(dato23==22){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato23);
                    startActivity(intent);
                }
            });
        }
        if(dato24==23){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato24);
                    startActivity(intent);
                }
            });
        }
        if(dato25==24){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato25);
                    startActivity(intent);
                }
            });
        }
        if(dato26==25){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato26);
                    startActivity(intent);
                }
            });
        }
        if(dato27==26){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato27);
                    startActivity(intent);
                }
            });
        }
        if(dato28==27){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato28);
                    startActivity(intent);
                }
            });
        }
        if(dato29==28){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato29);
                    startActivity(intent);
                }
            });
        }
        if(dato30==29){
            btnca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Calentamiento.this,PracticaDiario.class);
                    intent.putExtra("b",dato30);
                    startActivity(intent);
                }
            });
        }

    }
}
