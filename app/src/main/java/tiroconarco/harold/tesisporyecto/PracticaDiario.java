package tiroconarco.harold.tesisporyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class PracticaDiario extends AppCompatActivity {

    private TextView txtTitulo,txtInfo1,txtInfo2,txtInfo3,txtInfo4,txtInfo5;
    private Button btn;
    private GifImageView gifImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_diario);

        txtTitulo=(TextView)findViewById(R.id.tituloPractica);
        txtInfo1=(TextView)findViewById(R.id.descripcionPractica1);
        txtInfo2=(TextView)findViewById(R.id.descripcionPractica2);
        txtInfo3=(TextView)findViewById(R.id.descripcionPractica3);
        txtInfo4=(TextView)findViewById(R.id.descripcionPractica4);
        txtInfo5=(TextView)findViewById(R.id.descripcionPractica5);
        btn=(Button)findViewById(R.id.btnpracticaRealizar);
        gifImageView=(GifImageView)findViewById(R.id.gifPractica);


        final int d1=getIntent().getIntExtra("b",1);
        final int d2=getIntent().getIntExtra("b",2);
        final int d3=getIntent().getIntExtra("b",3);
        final int d4=getIntent().getIntExtra("b",4);
        final int d5=getIntent().getIntExtra("b",5);
        final int d6=getIntent().getIntExtra("b",6);
        final int d7=getIntent().getIntExtra("b",7);
        final int d8=getIntent().getIntExtra("b",8);
        final int d9=getIntent().getIntExtra("b",9);
        final int d10=getIntent().getIntExtra("b",10);
        final int d11=getIntent().getIntExtra("b",11);
        final int d12=getIntent().getIntExtra("b",12);
        final int d13=getIntent().getIntExtra("b",13);
        final int d14=getIntent().getIntExtra("b",14);
        final int d15=getIntent().getIntExtra("b",15);
        final int d16=getIntent().getIntExtra("b",16);
        final int d17=getIntent().getIntExtra("b",17);
        final int d18=getIntent().getIntExtra("b",18);
        final int d19=getIntent().getIntExtra("b",19);
        final int d20=getIntent().getIntExtra("b",20);
        final int d21=getIntent().getIntExtra("b",21);
        final int d22=getIntent().getIntExtra("b",22);
        final int d23=getIntent().getIntExtra("b",23);
        final int d24=getIntent().getIntExtra("b",24);
        final int d25=getIntent().getIntExtra("b",25);
        final int d26=getIntent().getIntExtra("b",26);
        final int d27=getIntent().getIntExtra("b",27);
        final int d28=getIntent().getIntExtra("b",28);
        final int d29=getIntent().getIntExtra("b",29);
        final int d30=getIntent().getIntExtra("b",30);

        if(d1==0){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            intent.putExtra("campo",d1);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }

        if( d2==1 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            //intent.putExtra();
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d3==2 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            //intent.putExtra();
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d4==3 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            //intent.putExtra();
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d5==4 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            //intent.putExtra();
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d6==5 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);

                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);
                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d7==6 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);

                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);
                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d8==7 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);

                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);
                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d9==8 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);

                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);
                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d10==9 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);

                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);
                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar5);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d11==10 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d12==11 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d13==12 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d14==13 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d15==14 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d16==15 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d17==16 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d18==17 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d19==18 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d20==19 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);

                    gifImageView.setImageResource(R.drawable.estirararco);
                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);


                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);

                                    gifImageView.setImageResource(R.drawable.disparar);
                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d21==20 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);



                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d22==21 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);



                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d23==22 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);



                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d24==23 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);



                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d25==24 ){
            txtTitulo.setText(R.string.estirar_liga);
            gifImageView.setImageResource(R.drawable.estirarliga);

            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);



                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar6);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d26==25 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d27==26 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d28==27 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if( d29==28 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }
        if(d30==29 ){
            txtTitulo.setText(R.string.estirar_liga);

            gifImageView.setImageResource(R.drawable.estirarliga);
            txtInfo1.setText(R.string.descripcion_liga1);
            txtInfo2.setText(R.string.descripcion_liga2);
            txtInfo3.setText(R.string.descripcion_liga3);
            txtInfo4.setText(R.string.descripcion_liga4);
            txtInfo5.setText(R.string.descripcion_liga5);

            btn.setText(R.string.btn_siguiente);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtTitulo.setText(R.string.estirar_arco);
                    gifImageView.setImageResource(R.drawable.estirararco);

                    txtInfo1.setText(R.string.descripcion_arco1);
                    txtInfo2.setText(R.string.descripcion_arco2);
                    txtInfo3.setText(R.string.descripcion_arco3);
                    txtInfo4.setText(R.string.descripcion_arco4);
                    txtInfo5.setText(R.string.descripcion_arco5);

                    btn.setText(R.string.btn_siguiente);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            txtTitulo.setText(R.string.descanso);
                            gifImageView.setImageResource(R.drawable.descanso);
                            txtInfo1.setText(R.string.descripcion_descanso3);
                            txtInfo2.setText(R.string.descripcion_descanso1);
                            txtInfo3.setText(R.string.descripcion_descanso3);
                            txtInfo4.setText(R.string.descripcion_descanso2);
                            txtInfo5.setText(R.string.descripcion_descanso3);

                            btn.setText(R.string.btn_siguiente);
                            btn.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    txtTitulo.setText(R.string.tirar);
                                    gifImageView.setImageResource(R.drawable.disparar);

                                    txtInfo1.setText(R.string.descripcion_tirar1);
                                    txtInfo2.setText(R.string.descripcion_tirar2);
                                    txtInfo3.setText(R.string.descripcion_tirar3);
                                    txtInfo4.setText(R.string.descripcion_tirar4);
                                    txtInfo5.setText(R.string.descripcion_tirar7);

                                    btn.setText(R.string.btn_terminar);
                                    btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent=new Intent(PracticaDiario.this,PracticaInicio.class);
                                            startActivity(intent);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });


        }

    }

    //para que el boton de ir asia atraz del celular no funcione
    @Override
    public void onBackPressed(){

    }
}
