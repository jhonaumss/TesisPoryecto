package tiroconarco.harold.tesisporyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TableroPuntos2 extends AppCompatActivity {

    private EditText et1_1_1,et1_1_2,et1_1_3,et1_1_4,et1_1_5,et1_1_6,et1_2_1,et1_2_2,et1_2_3,et1_2_4,et1_2_5,et1_2_6,et1_3_1,et1_3_2,et1_3_3,et1_3_4,et1_3_5,et1_3_6,et1_4_1,et1_4_2,et1_4_3,et1_4_4,et1_4_5,et1_4_6,et1_5_1,et1_5_2,et1_5_3,et1_5_4,et1_5_5,et1_5_6,et1_6_1,et1_6_2,et1_6_3,et1_6_4,et1_6_5,et1_6_6,
                     et2_1_1,et2_1_2,et2_1_3,et2_1_4,et2_1_5,et2_1_6,et2_2_1,et2_2_2,et2_2_3,et2_2_4,et2_2_5,et2_2_6,et2_3_1,et2_3_2,et2_3_3,et2_3_4,et2_3_5,et2_3_6,et2_4_1,et2_4_2,et2_4_3,et2_4_4,et2_4_5,et2_4_6,et2_5_1,et2_5_2,et2_5_3,et2_5_4,et2_5_5,et2_5_6,et2_6_1,et2_6_2,et2_6_3,et2_6_4,et2_6_5,et2_6_6;

    private TextView sub1_1,total1_1,sub1_2,total1_2,sub1_3,total1_3,sub1_4,total1_4,sub1_5,total1_5,sub1_6,total1_6,
                     sub2_1,total2_1,sub2_2,total2_2,sub2_3,total2_3,sub2_4,total2_4,sub2_5,total2_5,sub2_6,total2_6;

    private Template3PDF template3PDF;
    private String[]header={"n°","1","2","3","subtotal","total"};
    private String shortText="tabla de puntaje";
    private String longText="tabla de puntaje......................................";
    int valor1,valor2,valor3,valor4,valor5,valor6,resultado,preResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero_puntos2);

        //datos del pdf
        template3PDF=new Template3PDF(getApplicationContext());
        template3PDF.openDocument();
        template3PDF.adMetaData("Datos para el control de puntaje del arquero","Azores","Elimminacion");
        template3PDF.addTitles("tabla puntaje 18 metros","sobre 620 puntos","3/17/2020");
        template3PDF.addParagraph(shortText);
        template3PDF.addParagraph(longText);
        template3PDF.createTable(header,getPuntos());
        template3PDF.closeDocument();


        et1_1_1=(EditText) findViewById(R.id.editText1_1);
        et1_1_2=(EditText) findViewById(R.id.editText1_2);
        et1_1_3=(EditText) findViewById(R.id.editText1_3);
        et1_1_4=(EditText) findViewById(R.id.editText1_4);
        et1_1_5=(EditText) findViewById(R.id.editText1_5);
        et1_1_6=(EditText) findViewById(R.id.editText1_6);
        sub1_1=(TextView) findViewById(R.id.textViewSubTotal1);
        total1_1=(TextView) findViewById(R.id.textViewTotal1);

        et1_1_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_1_1));
        et1_1_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_1_2));
        et1_1_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_1_3));
        et1_1_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_1_4));
        et1_1_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_1_5));
        et1_1_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_1_6));

        et1_2_1=(EditText) findViewById(R.id.editText2_1);
        et1_2_2=(EditText) findViewById(R.id.editText2_2);
        et1_2_3=(EditText) findViewById(R.id.editText2_3);
        et1_2_4=(EditText) findViewById(R.id.editText2_4);
        et1_2_5=(EditText) findViewById(R.id.editText2_5);
        et1_2_6=(EditText) findViewById(R.id.editText2_6);
        sub1_2=(TextView) findViewById(R.id.textViewSubTotal2);
        total1_2=(TextView) findViewById(R.id.textViewTotal2);

        et1_2_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_2_1));
        et1_2_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_2_2));
        et1_2_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_2_3));
        et1_2_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_2_4));
        et1_2_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_2_5));
        et1_2_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_2_6));

        et1_3_1=(EditText) findViewById(R.id.editText3_1);
        et1_3_2=(EditText) findViewById(R.id.editText3_2);
        et1_3_3=(EditText) findViewById(R.id.editText3_3);
        et1_3_4=(EditText) findViewById(R.id.editText3_4);
        et1_3_5=(EditText) findViewById(R.id.editText3_5);
        et1_3_6=(EditText) findViewById(R.id.editText3_6);
        sub1_3=(TextView) findViewById(R.id.textViewSubTotal3);
        total1_3=(TextView) findViewById(R.id.textViewTotal3);

        et1_3_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_3_1));
        et1_3_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_3_2));
        et1_3_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_3_3));
        et1_3_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_3_4));
        et1_3_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_3_5));
        et1_3_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_3_6));

        et1_4_1=(EditText) findViewById(R.id.editText4_1);
        et1_4_2=(EditText) findViewById(R.id.editText4_2);
        et1_4_3=(EditText) findViewById(R.id.editText4_3);
        et1_4_4=(EditText) findViewById(R.id.editText4_4);
        et1_4_5=(EditText) findViewById(R.id.editText4_5);
        et1_4_6=(EditText) findViewById(R.id.editText4_6);
        sub1_4=(TextView) findViewById(R.id.textViewSubTotal4);
        total1_4=(TextView) findViewById(R.id.textViewTotal4);

        et1_4_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_4_1));
        et1_4_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_4_2));
        et1_4_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_4_3));
        et1_4_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_4_4));
        et1_4_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_4_5));
        et1_4_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_4_6));

        et1_5_1=(EditText) findViewById(R.id.editText5_1);
        et1_5_2=(EditText) findViewById(R.id.editText5_2);
        et1_5_3=(EditText) findViewById(R.id.editText5_3);
        et1_5_4=(EditText) findViewById(R.id.editText5_4);
        et1_5_5=(EditText) findViewById(R.id.editText5_5);
        et1_5_6=(EditText) findViewById(R.id.editText5_6);
        sub1_5=(TextView) findViewById(R.id.textViewSubTotal5);
        total1_5=(TextView) findViewById(R.id.textViewTotal5);

        et1_5_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_5_1));
        et1_5_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_5_2));
        et1_5_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_5_3));
        et1_5_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_5_4));
        et1_5_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_5_5));
        et1_5_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_5_6));

        et1_6_1=(EditText) findViewById(R.id.editText6_1);
        et1_6_2=(EditText) findViewById(R.id.editText6_2);
        et1_6_3=(EditText) findViewById(R.id.editText6_3);
        et1_6_4=(EditText) findViewById(R.id.editText6_4);
        et1_6_5=(EditText) findViewById(R.id.editText6_5);
        et1_6_6=(EditText) findViewById(R.id.editText6_6);
        sub1_6=(TextView) findViewById(R.id.textViewSubTotal6);
        total1_6=(TextView) findViewById(R.id.textViewTotal6);

        et1_6_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_6_1));
        et1_6_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_6_2));
        et1_6_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_6_3));
        et1_6_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_6_4));
        et1_6_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_6_5));
        et1_6_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et1_6_6));

        et2_1_1=(EditText) findViewById(R.id.editText2_1_1);
        et2_1_2=(EditText) findViewById(R.id.editText2_1_2);
        et2_1_3=(EditText) findViewById(R.id.editText2_1_3);
        et2_1_4=(EditText) findViewById(R.id.editText2_1_4);
        et2_1_5=(EditText) findViewById(R.id.editText2_1_5);
        et2_1_6=(EditText) findViewById(R.id.editText2_1_6);
        sub2_1=(TextView) findViewById(R.id.textViewSubTotal2_1);
        total2_1=(TextView) findViewById(R.id.textViewTotal2_1);

        et2_1_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_1_1));
        et2_1_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_1_2));
        et2_1_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_1_3));
        et2_1_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_1_4));
        et2_1_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_1_5));
        et2_1_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_1_6));

        et2_2_1=(EditText) findViewById(R.id.editText2_2_1);
        et2_2_2=(EditText) findViewById(R.id.editText2_2_2);
        et2_2_3=(EditText) findViewById(R.id.editText2_2_3);
        et2_2_4=(EditText) findViewById(R.id.editText2_2_4);
        et2_2_5=(EditText) findViewById(R.id.editText2_2_5);
        et2_2_6=(EditText) findViewById(R.id.editText2_2_6);
        sub2_2=(TextView) findViewById(R.id.textViewSubTotal2_2);
        total2_2=(TextView) findViewById(R.id.textViewTotal2_2);

        et2_2_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_2_1));
        et2_2_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_2_2));
        et2_2_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_2_3));
        et2_2_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_2_4));
        et2_2_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_2_5));
        et2_2_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_2_6));

        et2_3_1=(EditText) findViewById(R.id.editText2_3_1);
        et2_3_2=(EditText) findViewById(R.id.editText2_3_2);
        et2_3_3=(EditText) findViewById(R.id.editText2_3_3);
        et2_3_4=(EditText) findViewById(R.id.editText2_3_4);
        et2_3_5=(EditText) findViewById(R.id.editText2_3_5);
        et2_3_6=(EditText) findViewById(R.id.editText2_3_6);
        sub2_3=(TextView) findViewById(R.id.textViewSubTotal2_3);
        total2_3=(TextView) findViewById(R.id.textViewTotal2_3);

        et2_3_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_3_1));
        et2_3_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_3_2));
        et2_3_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_3_3));
        et2_3_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_3_4));
        et2_3_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_3_5));
        et2_3_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_3_6));

        et2_4_1=(EditText) findViewById(R.id.editText2_4_1);
        et2_4_2=(EditText) findViewById(R.id.editText2_4_2);
        et2_4_3=(EditText) findViewById(R.id.editText2_4_3);
        et2_4_4=(EditText) findViewById(R.id.editText2_4_4);
        et2_4_5=(EditText) findViewById(R.id.editText2_4_5);
        et2_4_6=(EditText) findViewById(R.id.editText2_4_6);
        sub2_4=(TextView) findViewById(R.id.textViewSubTotal2_4);
        total2_4=(TextView) findViewById(R.id.textViewTotal2_4);

        et2_4_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_4_1));
        et2_4_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_4_2));
        et2_4_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_4_3));
        et2_4_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_4_4));
        et2_4_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_4_5));
        et2_4_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_4_6));

        et2_5_1=(EditText) findViewById(R.id.editText2_5_1);
        et2_5_2=(EditText) findViewById(R.id.editText2_5_2);
        et2_5_3=(EditText) findViewById(R.id.editText2_5_3);
        et2_5_4=(EditText) findViewById(R.id.editText2_5_4);
        et2_5_5=(EditText) findViewById(R.id.editText2_5_5);
        et2_5_6=(EditText) findViewById(R.id.editText2_5_6);
        sub2_5=(TextView) findViewById(R.id.textViewSubTotal2_5);
        total2_5=(TextView) findViewById(R.id.textViewTotal2_5);

        et2_5_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_5_1));
        et2_5_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_5_2));
        et2_5_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_5_3));
        et2_5_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_5_4));
        et2_5_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_5_5));
        et2_5_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_5_6));

        et2_6_1=(EditText) findViewById(R.id.editText2_6_1);
        et2_6_2=(EditText) findViewById(R.id.editText2_6_2);
        et2_6_3=(EditText) findViewById(R.id.editText2_6_3);
        et2_6_4=(EditText) findViewById(R.id.editText2_6_4);
        et2_6_5=(EditText) findViewById(R.id.editText2_6_5);
        et2_6_6=(EditText) findViewById(R.id.editText2_6_6);
        sub2_6=(TextView) findViewById(R.id.textViewSubTotal2_6);
        total2_6=(TextView) findViewById(R.id.textViewTotal2_6);

        et2_6_1.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_6_1));
        et2_6_2.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_6_2));
        et2_6_3.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_6_3));
        et2_6_4.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_6_4));
        et2_6_5.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_6_5));
        et2_6_6.addTextChangedListener(new TableroPuntos2.GenericTextWatcher(et2_6_6));

        /*
        AdminSQLiteOpenHelper con=new AdminSQLiteOpenHelper(TableroPuntos2.this,"db_puntaje",null,1);
        SQLiteDatabase db=con.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_N1,et1_1_1.getText().toString());
        values.put(Utilidades.CAMPO_N2,et1_1_2.getText().toString());
        values.put(Utilidades.CAMPO_N3,et1_1_3.getText().toString());
        values.put(Utilidades.CAMPO_N4,et1_1_4.getText().toString());
        values.put(Utilidades.CAMPO_N5,et1_1_5.getText().toString());
        values.put(Utilidades.CAMPO_N6,et1_1_6.getText().toString());
        values.put(Utilidades.CAMPO_S1,sub1_1.getText().toString());
        values.put(Utilidades.CAMPO_T1,total1_1.getText().toString());

        values.put(Utilidades.CAMPO_N7,et1_2_1.getText().toString());
        values.put(Utilidades.CAMPO_N8,et1_2_2.getText().toString());
        values.put(Utilidades.CAMPO_N9,et1_2_3.getText().toString());
        values.put(Utilidades.CAMPO_N10,et1_2_4.getText().toString());
        values.put(Utilidades.CAMPO_N11,et1_2_5.getText().toString());
        values.put(Utilidades.CAMPO_N12,et1_2_6.getText().toString());
        values.put(Utilidades.CAMPO_S2,sub1_2.getText().toString());
        values.put(Utilidades.CAMPO_T2,total1_2.getText().toString());

        values.put(Utilidades.CAMPO_N13,et1_3_1.getText().toString());
        values.put(Utilidades.CAMPO_N14,et1_3_2.getText().toString());
        values.put(Utilidades.CAMPO_N15,et1_3_3.getText().toString());
        values.put(Utilidades.CAMPO_N16,et1_3_4.getText().toString());
        values.put(Utilidades.CAMPO_N17,et1_3_5.getText().toString());
        values.put(Utilidades.CAMPO_N18,et1_3_6.getText().toString());
        values.put(Utilidades.CAMPO_S3,sub1_3.getText().toString());
        values.put(Utilidades.CAMPO_T3,total1_3.getText().toString());

        values.put(Utilidades.CAMPO_N19,et1_4_1.getText().toString());
        values.put(Utilidades.CAMPO_N20,et1_4_2.getText().toString());
        values.put(Utilidades.CAMPO_N21,et1_4_3.getText().toString());
        values.put(Utilidades.CAMPO_N22,et1_4_4.getText().toString());
        values.put(Utilidades.CAMPO_N23,et1_4_5.getText().toString());
        values.put(Utilidades.CAMPO_N24,et1_4_6.getText().toString());
        values.put(Utilidades.CAMPO_S4,sub1_4.getText().toString());
        values.put(Utilidades.CAMPO_T4,total1_4.getText().toString());

        values.put(Utilidades.CAMPO_N25,et1_5_1.getText().toString());
        values.put(Utilidades.CAMPO_N26,et1_5_2.getText().toString());
        values.put(Utilidades.CAMPO_N27,et1_5_3.getText().toString());
        values.put(Utilidades.CAMPO_N28,et1_5_4.getText().toString());
        values.put(Utilidades.CAMPO_N29,et1_5_5.getText().toString());
        values.put(Utilidades.CAMPO_N30,et1_5_6.getText().toString());
        values.put(Utilidades.CAMPO_S5,sub1_5.getText().toString());
        values.put(Utilidades.CAMPO_T5,total1_5.getText().toString());

        values.put(Utilidades.CAMPO_N31,et1_6_1.getText().toString());
        values.put(Utilidades.CAMPO_N32,et1_6_2.getText().toString());
        values.put(Utilidades.CAMPO_N33,et1_6_3.getText().toString());
        values.put(Utilidades.CAMPO_N34,et1_6_4.getText().toString());
        values.put(Utilidades.CAMPO_N35,et1_6_5.getText().toString());
        values.put(Utilidades.CAMPO_N36,et1_6_6.getText().toString());
        values.put(Utilidades.CAMPO_S6,sub1_6.getText().toString());
        values.put(Utilidades.CAMPO_T6,total1_6.getText().toString());
        /////////
        values.put(Utilidades.CAMPO_N37,et2_1_1.getText().toString());
        values.put(Utilidades.CAMPO_N38,et2_1_2.getText().toString());
        values.put(Utilidades.CAMPO_N39,et2_1_3.getText().toString());
        values.put(Utilidades.CAMPO_N40,et2_1_4.getText().toString());
        values.put(Utilidades.CAMPO_N41,et2_1_5.getText().toString());
        values.put(Utilidades.CAMPO_N42,et2_1_6.getText().toString());
        values.put(Utilidades.CAMPO_S7,sub2_1.getText().toString());
        values.put(Utilidades.CAMPO_T7,total2_1.getText().toString());

        values.put(Utilidades.CAMPO_N43,et2_2_1.getText().toString());
        values.put(Utilidades.CAMPO_N44,et2_2_2.getText().toString());
        values.put(Utilidades.CAMPO_N45,et2_2_3.getText().toString());
        values.put(Utilidades.CAMPO_N46,et2_2_4.getText().toString());
        values.put(Utilidades.CAMPO_N47,et2_2_5.getText().toString());
        values.put(Utilidades.CAMPO_N48,et2_2_6.getText().toString());
        values.put(Utilidades.CAMPO_S8,sub2_2.getText().toString());
        values.put(Utilidades.CAMPO_T8,total2_2.getText().toString());

        values.put(Utilidades.CAMPO_N49,et2_3_1.getText().toString());
        values.put(Utilidades.CAMPO_N50,et2_3_2.getText().toString());
        values.put(Utilidades.CAMPO_N51,et2_3_3.getText().toString());
        values.put(Utilidades.CAMPO_N52,et2_3_4.getText().toString());
        values.put(Utilidades.CAMPO_N53,et2_3_5.getText().toString());
        values.put(Utilidades.CAMPO_N54,et2_3_6.getText().toString());
        values.put(Utilidades.CAMPO_S9,sub2_3.getText().toString());
        values.put(Utilidades.CAMPO_T9,total2_3.getText().toString());

        values.put(Utilidades.CAMPO_N55,et2_4_1.getText().toString());
        values.put(Utilidades.CAMPO_N56,et2_4_2.getText().toString());
        values.put(Utilidades.CAMPO_N57,et2_4_3.getText().toString());
        values.put(Utilidades.CAMPO_N58,et2_4_4.getText().toString());
        values.put(Utilidades.CAMPO_N59,et2_4_5.getText().toString());
        values.put(Utilidades.CAMPO_N60,et2_4_6.getText().toString());
        values.put(Utilidades.CAMPO_S10,sub2_4.getText().toString());
        values.put(Utilidades.CAMPO_T10,total2_4.getText().toString());

        values.put(Utilidades.CAMPO_N61,et2_5_1.getText().toString());
        values.put(Utilidades.CAMPO_N62,et2_5_2.getText().toString());
        values.put(Utilidades.CAMPO_N63,et2_5_3.getText().toString());
        values.put(Utilidades.CAMPO_N64,et2_5_4.getText().toString());
        values.put(Utilidades.CAMPO_N65,et2_5_5.getText().toString());
        values.put(Utilidades.CAMPO_N66,et2_5_6.getText().toString());
        values.put(Utilidades.CAMPO_S11,sub2_5.getText().toString());
        values.put(Utilidades.CAMPO_T11,total2_5.getText().toString());

        values.put(Utilidades.CAMPO_N67,et2_6_1.getText().toString());
        values.put(Utilidades.CAMPO_N68,et2_6_2.getText().toString());
        values.put(Utilidades.CAMPO_N69,et2_6_3.getText().toString());
        values.put(Utilidades.CAMPO_N70,et2_6_4.getText().toString());
        values.put(Utilidades.CAMPO_N71,et2_6_5.getText().toString());
        values.put(Utilidades.CAMPO_N72,et2_6_6.getText().toString());
        values.put(Utilidades.CAMPO_S12,sub2_6.getText().toString());
        values.put(Utilidades.CAMPO_T12,total2_6.getText().toString());

        Long numero=db.insert(Utilidades.TABLA_PUNTAJE,Utilidades.CAMPO_ID_PUNTAJE,values);
        db.close();

         */
    }

    private class GenericTextWatcher implements TextWatcher{
        private View view;
        private GenericTextWatcher(View view){
            this.view=view;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            switch (view.getId()){
                case R.id.editText1_1:
                    if(et1_1_1.equals("")){
                        sub1_1.setText("");
                        total1_1.setText("");
                    }else if(et1_1_1.equals("X")){
                        valor1=10;
                        sub1_1.setText(""+valor1);
                        total1_1.setText(""+valor1);
                    }else if(et1_1_1.equals("M")){
                        valor1=0;
                        sub1_1.setText(""+valor1);
                        total1_1.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et1_1_1.getText().toString());
                        resultado=valor1;
                        sub1_1.setText(""+resultado);
                        total1_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText1_2:
                    if(et1_1_2.equals("")){
                        sub1_1.setText("");
                        total1_1.setText("");
                    }else if(et1_1_2.equals("X")){
                        valor2=10;
                        sub1_1.setText(""+valor2);
                        total1_1.setText(""+valor2);
                    }else if(et1_1_2.equals("M")){
                        valor2=0;
                        sub1_1.setText(""+valor2);
                        total1_1.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et1_1_2.getText().toString());
                        resultado=resultado+valor2;
                        sub1_1.setText(""+resultado);
                        total1_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText1_3:
                    if(et1_1_3.equals("")){
                        sub1_1.setText("");
                        total1_1.setText("");
                    }else if(et1_1_3.equals("X")){
                        valor3=10;
                        sub1_1.setText(""+valor3);
                        total1_1.setText(""+valor3);
                    }else if(et1_1_3.equals("M")){
                        valor3=0;
                        sub1_1.setText(""+valor3);
                        total1_1.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et1_1_3.getText().toString());
                        resultado=resultado+valor3;
                        sub1_1.setText(""+resultado);
                        total1_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText1_4:
                    if(et1_1_4.equals("")){
                        sub1_1.setText("");
                        total1_1.setText("");
                    }else if(et1_1_4.equals("X")){
                        valor4=10;
                        sub1_1.setText(""+valor4);
                        total1_1.setText(""+valor4);
                    }else if(et1_1_3.equals("M")){
                        valor4=0;
                        sub1_1.setText(""+valor4);
                        total1_1.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et1_1_4.getText().toString());
                        resultado=resultado+valor4;
                        sub1_1.setText(""+resultado);
                        total1_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText1_5:
                    if(et1_1_5.equals("")){
                        sub1_1.setText("");
                        total1_1.setText("");
                    }else if(et1_1_5.equals("X")){
                        valor5=10;
                        sub1_1.setText(""+valor5);
                        total1_1.setText(""+valor5);
                    }else if(et1_1_5.equals("M")){
                        valor5=0;
                        sub1_1.setText(""+valor5);
                        total1_1.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et1_1_5.getText().toString());
                        resultado=resultado+valor5;
                        sub1_1.setText(""+resultado);
                        total1_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText1_6:
                    if(et1_1_6.equals("")){
                        sub1_1.setText("");
                        total1_1.setText("");
                    }else if(et1_1_6.equals("X")){
                        valor6=10;
                        sub1_1.setText(""+valor6);
                        total1_1.setText(""+valor6);
                    }else if(et1_1_6.equals("M")){
                        valor6=0;
                        sub1_1.setText(""+valor6);
                        total1_1.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et1_1_6.getText().toString());
                        resultado=resultado+valor6;
                        sub1_1.setText(""+resultado);
                        total1_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_1:
                    if(et1_2_1.equals("")){
                        sub1_2.setText("");
                        total1_2.setText("");
                    }else if(et1_2_1.equals("X")){
                        valor1=10;
                        sub1_2.setText(""+valor1);
                        total1_2.setText(""+valor1);
                    }else if(et1_2_1.equals("M")){
                        valor1=0;
                        sub1_2.setText(""+valor1);
                        total1_2.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et1_2_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub1_2.setText(""+preResultado);
                        total1_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_2:
                    if(et1_2_2.equals("")){
                        sub1_2.setText("");
                        total1_2.setText("");
                    }else if(et1_2_2.equals("X")){
                        valor2=10;
                        sub1_2.setText(""+valor2);
                        total1_2.setText(""+valor2);
                    }else if(et1_2_2.equals("M")){
                        valor2=0;
                        sub1_2.setText(""+valor2);
                        total1_2.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et1_2_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub1_2.setText(""+preResultado);
                        total1_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_3:
                    if(et1_2_3.equals("")){
                        sub1_2.setText("");
                        total1_2.setText("");
                    }else if(et1_2_3.equals("X")){
                        valor3=10;
                        sub1_2.setText(""+valor3);
                        total1_2.setText(""+valor3);
                    }else if(et1_2_3.equals("M")){
                        valor3=0;
                        sub1_2.setText(""+valor3);
                        total1_2.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et1_2_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub1_2.setText(""+preResultado);
                        total1_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_4:
                    if(et1_2_4.equals("")){
                        sub1_2.setText("");
                        total1_2.setText("");
                    }else if(et1_2_4.equals("X")){
                        valor4=10;
                        sub1_2.setText(""+valor4);
                        total1_2.setText(""+valor4);
                    }else if(et1_2_4.equals("M")){
                        valor4=0;
                        sub1_2.setText(""+valor4);
                        total1_2.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et1_2_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub1_2.setText(""+preResultado);
                        total1_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_5:
                    if(et1_2_5.equals("")){
                        sub1_2.setText("");
                        total1_2.setText("");
                    }else if(et1_2_5.equals("X")){
                        valor5=10;
                        sub1_2.setText(""+valor5);
                        total1_2.setText(""+valor5);
                    }else if(et1_2_5.equals("M")){
                        valor5=0;
                        sub1_2.setText(""+valor5);
                        total1_2.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et1_2_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub1_2.setText(""+preResultado);
                        total1_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_6:
                    if(et1_2_6.equals("")){
                        sub1_2.setText("");
                        total1_2.setText("");
                    }else if(et1_2_6.equals("X")){
                        valor6=10;
                        sub1_2.setText(""+valor6);
                        total1_2.setText(""+valor6);
                    }else if(et1_2_6.equals("M")){
                        valor6=0;
                        sub1_2.setText(""+valor6);
                        total1_2.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et1_2_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub1_2.setText(""+preResultado);
                        total1_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText3_1:
                    if(et1_3_1.equals("")){
                        sub1_3.setText("");
                        total1_3.setText("");
                    }else if(et1_3_1.equals("X")){
                        valor1=10;
                        sub1_3.setText(""+valor1);
                        total1_3.setText(""+valor1);
                    }else if(et1_3_1.equals("M")){
                        valor1=0;
                        sub1_3.setText(""+valor1);
                        total1_3.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et1_3_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub1_3.setText(""+preResultado);
                        total1_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText3_2:
                    if(et1_3_2.equals("")){
                        sub1_3.setText("");
                        total1_3.setText("");
                    }else if(et1_3_2.equals("X")){
                        valor2=10;
                        sub1_3.setText(""+valor2);
                        total1_3.setText(""+valor2);
                    }else if(et1_3_2.equals("M")){
                        valor2=0;
                        sub1_3.setText(""+valor2);
                        total1_3.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et1_3_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub1_3.setText(""+preResultado);
                        total1_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText3_3:
                    if(et1_3_3.equals("")){
                        sub1_3.setText("");
                        total1_3.setText("");
                    }else if(et1_3_3.equals("X")){
                        valor3=10;
                        sub1_3.setText(""+valor3);
                        total1_3.setText(""+valor3);
                    }else if(et1_3_3.equals("M")){
                        valor3=0;
                        sub1_3.setText(""+valor3);
                        total1_3.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et1_3_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub1_3.setText(""+preResultado);
                        total1_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText3_4:
                    if(et1_3_4.equals("")){
                        sub1_3.setText("");
                        total1_3.setText("");
                    }else if(et1_3_4.equals("X")){
                        valor4=10;
                        sub1_3.setText(""+valor4);
                        total1_3.setText(""+valor4);
                    }else if(et1_3_4.equals("M")){
                        valor4=0;
                        sub1_3.setText(""+valor4);
                        total1_3.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et1_3_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub1_3.setText(""+preResultado);
                        total1_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText3_5:
                    if(et1_3_5.equals("")){
                        sub1_3.setText("");
                        total1_3.setText("");
                    }else if(et1_3_5.equals("X")){
                        valor5=10;
                        sub1_3.setText(""+valor5);
                        total1_3.setText(""+valor5);
                    }else if(et1_3_5.equals("M")){
                        valor5=0;
                        sub1_3.setText(""+valor5);
                        total1_3.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et1_3_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub1_3.setText(""+preResultado);
                        total1_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText3_6:
                    if(et1_3_6.equals("")){
                        sub1_3.setText("");
                        total1_3.setText("");
                    }else if(et1_3_6.equals("X")){
                        valor6=10;
                        sub1_3.setText(""+valor6);
                        total1_3.setText(""+valor6);
                    }else if(et1_3_6.equals("M")){
                        valor6=0;
                        sub1_3.setText(""+valor6);
                        total1_3.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et1_3_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub1_3.setText(""+preResultado);
                        total1_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText4_1:
                    if(et1_4_1.equals("")){
                        sub1_4.setText("");
                        total1_4.setText("");
                    }else if(et1_4_1.equals("X")){
                        valor1=10;
                        sub1_4.setText(""+valor1);
                        total1_4.setText(""+valor1);
                    }else if(et1_4_1.equals("M")){
                        valor1=0;
                        sub1_4.setText(""+valor1);
                        total1_4.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et1_4_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub1_4.setText(""+preResultado);
                        total1_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText4_2:
                    if(et1_4_2.equals("")){
                        sub1_4.setText("");
                        total1_4.setText("");
                    }else if(et1_4_2.equals("X")){
                        valor2=10;
                        sub1_4.setText(""+valor2);
                        total1_4.setText(""+valor2);
                    }else if(et1_4_2.equals("M")){
                        valor2=0;
                        sub1_4.setText(""+valor2);
                        total1_4.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et1_4_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub1_4.setText(""+preResultado);
                        total1_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText4_3:
                    if(et1_4_3.equals("")){
                        sub1_4.setText("");
                        total1_4.setText("");
                    }else if(et1_4_3.equals("X")){
                        valor3=10;
                        sub1_4.setText(""+valor3);
                        total1_4.setText(""+valor3);
                    }else if(et1_4_3.equals("M")){
                        valor3=0;
                        sub1_4.setText(""+valor3);
                        total1_4.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et1_4_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub1_4.setText(""+preResultado);
                        total1_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText4_4:
                    if(et1_4_4.equals("")){
                        sub1_4.setText("");
                        total1_4.setText("");
                    }else if(et1_4_4.equals("X")){
                        valor4=10;
                        sub1_4.setText(""+valor4);
                        total1_4.setText(""+valor4);
                    }else if(et1_4_4.equals("M")){
                        valor4=0;
                        sub1_4.setText(""+valor4);
                        total1_4.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et1_4_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub1_4.setText(""+preResultado);
                        total1_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText4_5:
                    if(et1_4_5.equals("")){
                        sub1_4.setText("");
                        total1_4.setText("");
                    }else if(et1_4_5.equals("X")){
                        valor5=10;
                        sub1_4.setText(""+valor5);
                        total1_4.setText(""+valor5);
                    }else if(et1_4_5.equals("M")){
                        valor5=0;
                        sub1_4.setText(""+valor5);
                        total1_4.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et1_4_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub1_4.setText(""+preResultado);
                        total1_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText4_6:
                    if(et1_4_6.equals("")){
                        sub1_4.setText("");
                        total1_4.setText("");
                    }else if(et1_4_6.equals("X")){
                        valor6=10;
                        sub1_4.setText(""+valor6);
                        total1_4.setText(""+valor6);
                    }else if(et1_4_6.equals("M")){
                        valor6=0;
                        sub1_4.setText(""+valor6);
                        total1_4.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et1_4_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub1_4.setText(""+preResultado);
                        total1_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText5_1:
                    if(et1_5_1.equals("")){
                        sub1_5.setText("");
                        total1_5.setText("");
                    }else if(et1_5_1.equals("X")){
                        valor1=10;
                        sub1_5.setText(""+valor1);
                        total1_5.setText(""+valor1);
                    }else if(et1_5_1.equals("M")){
                        valor1=0;
                        sub1_5.setText(""+valor1);
                        total1_5.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et1_5_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub1_5.setText(""+preResultado);
                        total1_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText5_2:
                    if(et1_5_2.equals("")){
                        sub1_5.setText("");
                        total1_5.setText("");
                    }else if(et1_5_2.equals("X")){
                        valor2=10;
                        sub1_5.setText(""+valor2);
                        total1_5.setText(""+valor2);
                    }else if(et1_5_2.equals("M")){
                        valor2=0;
                        sub1_5.setText(""+valor2);
                        total1_5.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et1_5_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub1_5.setText(""+preResultado);
                        total1_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText5_3:
                    if(et1_5_3.equals("")){
                        sub1_5.setText("");
                        total1_5.setText("");
                    }else if(et1_5_3.equals("X")){
                        valor3=10;
                        sub1_5.setText(""+valor3);
                        total1_5.setText(""+valor3);
                    }else if(et1_5_3.equals("M")){
                        valor3=0;
                        sub1_5.setText(""+valor3);
                        total1_5.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et1_5_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub1_5.setText(""+preResultado);
                        total1_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText5_4:
                    if(et1_5_4.equals("")){
                        sub1_5.setText("");
                        total1_5.setText("");
                    }else if(et1_5_4.equals("X")){
                        valor4=10;
                        sub1_5.setText(""+valor4);
                        total1_5.setText(""+valor4);
                    }else if(et1_5_4.equals("M")){
                        valor4=0;
                        sub1_5.setText(""+valor4);
                        total1_5.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et1_5_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub1_5.setText(""+preResultado);
                        total1_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText5_5:
                    if(et1_5_5.equals("")){
                        sub1_5.setText("");
                        total1_5.setText("");
                    }else if(et1_5_5.equals("X")){
                        valor5=10;
                        sub1_5.setText(""+valor5);
                        total1_5.setText(""+valor5);
                    }else if(et1_5_5.equals("M")){
                        valor5=0;
                        sub1_5.setText(""+valor5);
                        total1_5.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et1_5_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub1_5.setText(""+preResultado);
                        total1_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText5_6:
                    if(et1_5_6.equals("")){
                        sub1_5.setText("");
                        total1_5.setText("");
                    }else if(et1_5_6.equals("X")){
                        valor6=10;
                        sub1_5.setText(""+valor6);
                        total1_5.setText(""+valor6);
                    }else if(et1_5_6.equals("M")){
                        valor6=0;
                        sub1_5.setText(""+valor6);
                        total1_5.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et1_5_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub1_5.setText(""+preResultado);
                        total1_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText6_1:
                    if(et1_6_1.equals("")){
                        sub1_6.setText("");
                        total1_6.setText("");
                    }else if(et1_6_1.equals("X")){
                        valor1=10;
                        sub1_6.setText(""+valor1);
                        total1_6.setText(""+valor1);
                    }else if(et1_6_1.equals("M")){
                        valor1=0;
                        sub1_6.setText(""+valor1);
                        total1_6.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et1_6_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub1_6.setText(""+preResultado);
                        total1_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText6_2:
                    if(et1_6_2.equals("")){
                        sub1_6.setText("");
                        total1_6.setText("");
                    }else if(et1_6_2.equals("X")){
                        valor2=10;
                        sub1_6.setText(""+valor2);
                        total1_6.setText(""+valor2);
                    }else if(et1_6_2.equals("M")){
                        valor2=0;
                        sub1_6.setText(""+valor2);
                        total1_6.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et1_6_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub1_6.setText(""+preResultado);
                        total1_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText6_3:
                    if(et1_6_3.equals("")){
                        sub1_6.setText("");
                        total1_6.setText("");
                    }else if(et1_6_3.equals("X")){
                        valor3=10;
                        sub1_6.setText(""+valor3);
                        total1_6.setText(""+valor3);
                    }else if(et1_6_3.equals("M")){
                        valor3=0;
                        sub1_6.setText(""+valor3);
                        total1_6.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et1_6_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub1_6.setText(""+preResultado);
                        total1_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText6_4:
                    if(et1_6_4.equals("")){
                        sub1_6.setText("");
                        total1_6.setText("");
                    }else if(et1_6_4.equals("X")){
                        valor4=10;
                        sub1_6.setText(""+valor4);
                        total1_6.setText(""+valor4);
                    }else if(et1_6_4.equals("M")){
                        valor4=0;
                        sub1_6.setText(""+valor4);
                        total1_6.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et1_6_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub1_6.setText(""+preResultado);
                        total1_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText6_5:
                    if(et1_6_5.equals("")){
                        sub1_6.setText("");
                        total1_6.setText("");
                    }else if(et1_6_5.equals("X")){
                        valor5=10;
                        sub1_6.setText(""+valor5);
                        total1_6.setText(""+valor5);
                    }else if(et1_6_5.equals("M")){
                        valor5=0;
                        sub1_6.setText(""+valor5);
                        total1_6.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et1_6_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub1_6.setText(""+preResultado);
                        total1_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText6_6:
                    if(et1_6_6.equals("")){
                        sub1_6.setText("");
                        total1_6.setText("");
                    }else if(et1_6_6.equals("X")){
                        valor6=10;
                        sub1_6.setText(""+valor6);
                        total1_6.setText(""+valor6);
                    }else if(et1_6_6.equals("M")){
                        valor6=0;
                        sub1_6.setText(""+valor6);
                        total1_6.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et1_6_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub1_6.setText(""+preResultado);
                        total1_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_1_1:
                    if(et2_1_1.equals("")){
                        sub2_1.setText("");
                        total2_1.setText("");
                    }else if(et2_1_1.equals("X")){
                        valor1=10;
                        sub2_1.setText(""+valor1);
                        total2_1.setText(""+valor1);
                    }else if(et2_1_1.equals("M")){
                        valor1=0;
                        sub2_1.setText(""+valor1);
                        total2_1.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et2_1_1.getText().toString());
                        resultado=valor1;
                        sub2_1.setText(""+resultado);
                        total2_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_1_2:
                    if(et2_1_2.equals("")){
                        sub2_1.setText("");
                        total2_1.setText("");
                    }else if(et2_1_2.equals("X")){
                        valor2=10;
                        sub2_1.setText(""+valor2);
                        total2_1.setText(""+valor2);
                    }else if(et2_1_2.equals("M")){
                        valor2=0;
                        sub2_1.setText(""+valor2);
                        total2_1.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et2_1_2.getText().toString());
                        resultado=resultado+valor2;
                        sub2_1.setText(""+resultado);
                        total2_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_1_3:
                    if(et2_1_3.equals("")){
                        sub2_1.setText("");
                        total2_1.setText("");
                    }else if(et2_1_3.equals("X")){
                        valor3=10;
                        sub2_1.setText(""+valor3);
                        total2_1.setText(""+valor3);
                    }else if(et2_1_3.equals("M")){
                        valor3=0;
                        sub2_1.setText(""+valor3);
                        total2_1.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et2_1_3.getText().toString());
                        resultado=resultado+valor3;
                        sub2_1.setText(""+resultado);
                        total2_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_1_4:
                    if(et2_1_4.equals("")){
                        sub2_1.setText("");
                        total2_1.setText("");
                    }else if(et2_1_4.equals("X")){
                        valor4=10;
                        sub2_1.setText(""+valor4);
                        total2_1.setText(""+valor4);
                    }else if(et2_1_3.equals("M")){
                        valor4=0;
                        sub2_1.setText(""+valor4);
                        total2_1.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et2_1_4.getText().toString());
                        resultado=resultado+valor4;
                        sub2_1.setText(""+resultado);
                        total2_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_1_5:
                    if(et2_1_5.equals("")){
                        sub2_1.setText("");
                        total2_1.setText("");
                    }else if(et2_1_5.equals("X")){
                        valor5=10;
                        sub2_1.setText(""+valor5);
                        total2_1.setText(""+valor5);
                    }else if(et2_1_5.equals("M")){
                        valor5=0;
                        sub2_1.setText(""+valor5);
                        total2_1.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et2_1_5.getText().toString());
                        resultado=resultado+valor5;
                        sub2_1.setText(""+resultado);
                        total2_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_1_6:
                    if(et2_1_6.equals("")){
                        sub2_1.setText("");
                        total2_1.setText("");
                    }else if(et2_1_6.equals("X")){
                        valor6=10;
                        sub2_1.setText(""+valor6);
                        total2_1.setText(""+valor6);
                    }else if(et2_1_6.equals("M")){
                        valor6=0;
                        sub2_1.setText(""+valor6);
                        total2_1.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et2_1_6.getText().toString());
                        resultado=resultado+valor6;
                        sub2_1.setText(""+resultado);
                        total2_1.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_2_1:
                    if(et2_2_1.equals("")){
                        sub2_2.setText("");
                        total2_2.setText("");
                    }else if(et2_2_1.equals("X")){
                        valor1=10;
                        sub2_2.setText(""+valor1);
                        total2_2.setText(""+valor1);
                    }else if(et2_2_1.equals("M")){
                        valor1=0;
                        sub2_2.setText(""+valor1);
                        total2_2.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et2_2_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub2_2.setText(""+preResultado);
                        total2_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_2_2:
                    if(et2_2_2.equals("")){
                        sub2_2.setText("");
                        total2_2.setText("");
                    }else if(et2_2_2.equals("X")){
                        valor2=10;
                        sub2_2.setText(""+valor2);
                        total2_2.setText(""+valor2);
                    }else if(et2_2_2.equals("M")){
                        valor2=0;
                        sub2_2.setText(""+valor2);
                        total2_2.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et2_2_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub2_2.setText(""+preResultado);
                        total2_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_2_3:
                    if(et2_2_3.equals("")){
                        sub2_2.setText("");
                        total2_2.setText("");
                    }else if(et2_2_3.equals("X")){
                        valor3=10;
                        sub2_2.setText(""+valor3);
                        total2_2.setText(""+valor3);
                    }else if(et2_2_3.equals("M")){
                        valor3=0;
                        sub2_2.setText(""+valor3);
                        total2_2.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et2_2_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub2_2.setText(""+preResultado);
                        total2_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_2_4:
                    if(et2_2_4.equals("")){
                        sub2_2.setText("");
                        total2_2.setText("");
                    }else if(et2_2_4.equals("X")){
                        valor4=10;
                        sub2_2.setText(""+valor4);
                        total2_2.setText(""+valor4);
                    }else if(et2_2_4.equals("M")){
                        valor4=0;
                        sub2_2.setText(""+valor4);
                        total2_2.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et2_2_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub2_2.setText(""+preResultado);
                        total2_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_2_5:
                    if(et2_2_5.equals("")){
                        sub2_2.setText("");
                        total2_2.setText("");
                    }else if(et2_2_5.equals("X")){
                        valor5=10;
                        sub2_2.setText(""+valor5);
                        total2_2.setText(""+valor5);
                    }else if(et2_2_5.equals("M")){
                        valor5=0;
                        sub2_2.setText(""+valor5);
                        total2_2.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et2_2_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub2_2.setText(""+preResultado);
                        total2_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_2_6:
                    if(et2_2_6.equals("")){
                        sub2_2.setText("");
                        total2_2.setText("");
                    }else if(et2_2_6.equals("X")){
                        valor6=10;
                        sub2_2.setText(""+valor6);
                        total2_2.setText(""+valor6);
                    }else if(et2_2_6.equals("M")){
                        valor6=0;
                        sub2_2.setText(""+valor6);
                        total2_2.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et2_2_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub2_2.setText(""+preResultado);
                        total2_2.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_3_1:
                    if(et2_3_1.equals("")){
                        sub2_3.setText("");
                        total2_3.setText("");
                    }else if(et2_3_1.equals("X")){
                        valor1=10;
                        sub2_3.setText(""+valor1);
                        total2_3.setText(""+valor1);
                    }else if(et2_3_1.equals("M")){
                        valor1=0;
                        sub2_3.setText(""+valor1);
                        total2_3.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et2_3_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub2_3.setText(""+preResultado);
                        total2_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_3_2:
                    if(et2_3_2.equals("")){
                        sub2_3.setText("");
                        total2_3.setText("");
                    }else if(et2_3_2.equals("X")){
                        valor2=10;
                        sub2_3.setText(""+valor2);
                        total2_3.setText(""+valor2);
                    }else if(et2_3_2.equals("M")){
                        valor2=0;
                        sub2_3.setText(""+valor2);
                        total2_3.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et2_3_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub2_3.setText(""+preResultado);
                        total2_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_3_3:
                    if(et2_3_3.equals("")){
                        sub2_3.setText("");
                        total2_3.setText("");
                    }else if(et2_3_3.equals("X")){
                        valor3=10;
                        sub2_3.setText(""+valor3);
                        total2_3.setText(""+valor3);
                    }else if(et2_3_3.equals("M")){
                        valor3=0;
                        sub2_3.setText(""+valor3);
                        total2_3.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et2_3_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub2_3.setText(""+preResultado);
                        total2_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_3_4:
                    if(et2_3_4.equals("")){
                        sub2_3.setText("");
                        total2_3.setText("");
                    }else if(et2_3_4.equals("X")){
                        valor4=10;
                        sub2_3.setText(""+valor4);
                        total2_3.setText(""+valor4);
                    }else if(et2_3_4.equals("M")){
                        valor4=0;
                        sub2_3.setText(""+valor4);
                        total2_3.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et2_3_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub2_3.setText(""+preResultado);
                        total2_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_3_5:
                    if(et2_3_5.equals("")){
                        sub2_3.setText("");
                        total2_3.setText("");
                    }else if(et2_3_5.equals("X")){
                        valor5=10;
                        sub2_3.setText(""+valor5);
                        total2_3.setText(""+valor5);
                    }else if(et2_3_5.equals("M")){
                        valor5=0;
                        sub2_3.setText(""+valor5);
                        total2_3.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et2_3_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub2_3.setText(""+preResultado);
                        total2_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_3_6:
                    if(et2_3_6.equals("")){
                        sub2_3.setText("");
                        total2_3.setText("");
                    }else if(et2_3_6.equals("X")){
                        valor6=10;
                        sub2_3.setText(""+valor6);
                        total2_3.setText(""+valor6);
                    }else if(et2_3_6.equals("M")){
                        valor6=0;
                        sub2_3.setText(""+valor6);
                        total2_3.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et2_3_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub2_3.setText(""+preResultado);
                        total2_3.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_4_1:
                    if(et2_4_1.equals("")){
                        sub2_4.setText("");
                        total2_4.setText("");
                    }else if(et2_4_1.equals("X")){
                        valor1=10;
                        sub2_4.setText(""+valor1);
                        total2_4.setText(""+valor1);
                    }else if(et2_4_1.equals("M")){
                        valor1=0;
                        sub2_4.setText(""+valor1);
                        total2_4.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et2_4_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub2_4.setText(""+preResultado);
                        total2_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_4_2:
                    if(et2_4_2.equals("")){
                        sub2_4.setText("");
                        total2_4.setText("");
                    }else if(et2_4_2.equals("X")){
                        valor2=10;
                        sub2_4.setText(""+valor2);
                        total2_4.setText(""+valor2);
                    }else if(et2_4_2.equals("M")){
                        valor2=0;
                        sub2_4.setText(""+valor2);
                        total2_4.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et2_4_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub2_4.setText(""+preResultado);
                        total2_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_4_3:
                    if(et2_4_3.equals("")){
                        sub2_4.setText("");
                        total2_4.setText("");
                    }else if(et2_4_3.equals("X")){
                        valor3=10;
                        sub2_4.setText(""+valor3);
                        total2_4.setText(""+valor3);
                    }else if(et2_4_3.equals("M")){
                        valor3=0;
                        sub2_4.setText(""+valor3);
                        total2_4.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et2_4_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub2_4.setText(""+preResultado);
                        total2_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_4_4:
                    if(et2_4_4.equals("")){
                        sub2_4.setText("");
                        total2_4.setText("");
                    }else if(et2_4_4.equals("X")){
                        valor4=10;
                        sub2_4.setText(""+valor4);
                        total2_4.setText(""+valor4);
                    }else if(et2_4_4.equals("M")){
                        valor4=0;
                        sub2_4.setText(""+valor4);
                        total2_4.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et2_4_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub2_4.setText(""+preResultado);
                        total2_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_4_5:
                    if(et2_4_5.equals("")){
                        sub2_4.setText("");
                        total2_4.setText("");
                    }else if(et2_4_5.equals("X")){
                        valor5=10;
                        sub2_4.setText(""+valor5);
                        total2_4.setText(""+valor5);
                    }else if(et2_4_5.equals("M")){
                        valor5=0;
                        sub2_4.setText(""+valor5);
                        total2_4.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et2_4_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub2_4.setText(""+preResultado);
                        total2_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_4_6:
                    if(et2_4_6.equals("")){
                        sub2_4.setText("");
                        total2_4.setText("");
                    }else if(et2_4_6.equals("X")){
                        valor6=10;
                        sub2_4.setText(""+valor6);
                        total2_4.setText(""+valor6);
                    }else if(et2_4_6.equals("M")){
                        valor6=0;
                        sub2_4.setText(""+valor6);
                        total2_4.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et2_4_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub2_4.setText(""+preResultado);
                        total2_4.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_5_1:
                    if(et2_5_1.equals("")){
                        sub2_5.setText("");
                        total2_5.setText("");
                    }else if(et2_5_1.equals("X")){
                        valor1=10;
                        sub2_5.setText(""+valor1);
                        total2_5.setText(""+valor1);
                    }else if(et2_5_1.equals("M")){
                        valor1=0;
                        sub2_5.setText(""+valor1);
                        total2_5.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et2_5_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub2_5.setText(""+preResultado);
                        total2_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_5_2:
                    if(et2_5_2.equals("")){
                        sub2_5.setText("");
                        total2_5.setText("");
                    }else if(et2_5_2.equals("X")){
                        valor2=10;
                        sub2_5.setText(""+valor2);
                        total2_5.setText(""+valor2);
                    }else if(et2_5_2.equals("M")){
                        valor2=0;
                        sub2_5.setText(""+valor2);
                        total2_5.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et2_5_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub2_5.setText(""+preResultado);
                        total2_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_5_3:
                    if(et2_5_3.equals("")){
                        sub2_5.setText("");
                        total2_5.setText("");
                    }else if(et2_5_3.equals("X")){
                        valor3=10;
                        sub2_5.setText(""+valor3);
                        total2_5.setText(""+valor3);
                    }else if(et2_5_3.equals("M")){
                        valor3=0;
                        sub2_5.setText(""+valor3);
                        total2_5.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et2_5_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub2_5.setText(""+preResultado);
                        total2_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_5_4:
                    if(et2_5_4.equals("")){
                        sub2_5.setText("");
                        total2_5.setText("");
                    }else if(et2_5_4.equals("X")){
                        valor4=10;
                        sub2_5.setText(""+valor4);
                        total2_5.setText(""+valor4);
                    }else if(et2_5_4.equals("M")){
                        valor4=0;
                        sub2_5.setText(""+valor4);
                        total2_5.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et2_5_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub2_5.setText(""+preResultado);
                        total2_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_5_5:
                    if(et2_5_5.equals("")){
                        sub2_5.setText("");
                        total2_5.setText("");
                    }else if(et2_5_5.equals("X")){
                        valor5=10;
                        sub2_5.setText(""+valor5);
                        total2_5.setText(""+valor5);
                    }else if(et2_5_5.equals("M")){
                        valor5=0;
                        sub2_5.setText(""+valor5);
                        total2_5.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et2_5_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub2_5.setText(""+preResultado);
                        total2_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_5_6:
                    if(et2_5_6.equals("")){
                        sub2_5.setText("");
                        total2_5.setText("");
                    }else if(et2_5_6.equals("X")){
                        valor6=10;
                        sub2_5.setText(""+valor6);
                        total2_5.setText(""+valor6);
                    }else if(et2_5_6.equals("M")){
                        valor6=0;
                        sub2_5.setText(""+valor6);
                        total2_5.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et2_5_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub2_5.setText(""+preResultado);
                        total2_5.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_6_1:
                    if(et2_6_1.equals("")){
                        sub2_6.setText("");
                        total2_6.setText("");
                    }else if(et2_6_1.equals("X")){
                        valor1=10;
                        sub2_6.setText(""+valor1);
                        total2_6.setText(""+valor1);
                    }else if(et2_6_1.equals("M")){
                        valor1=0;
                        sub2_6.setText(""+valor1);
                        total2_6.setText(""+valor1);
                    }else {
                        valor1=Integer.parseInt(et2_6_1.getText().toString());
                        resultado=resultado+valor1;
                        preResultado=valor1;
                        sub2_6.setText(""+preResultado);
                        total2_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_6_2:
                    if(et2_6_2.equals("")){
                        sub2_6.setText("");
                        total2_6.setText("");
                    }else if(et2_6_2.equals("X")){
                        valor2=10;
                        sub2_6.setText(""+valor2);
                        total2_6.setText(""+valor2);
                    }else if(et2_6_2.equals("M")){
                        valor2=0;
                        sub2_6.setText(""+valor2);
                        total2_6.setText(""+valor2);
                    }else {
                        valor2=Integer.parseInt(et2_6_2.getText().toString());
                        resultado=resultado+valor2;
                        preResultado=preResultado+valor2;
                        sub2_6.setText(""+preResultado);
                        total2_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_6_3:
                    if(et2_6_3.equals("")){
                        sub2_6.setText("");
                        total2_6.setText("");
                    }else if(et2_6_3.equals("X")){
                        valor3=10;
                        sub2_6.setText(""+valor3);
                        total2_6.setText(""+valor3);
                    }else if(et2_6_3.equals("M")){
                        valor3=0;
                        sub2_6.setText(""+valor3);
                        total2_6.setText(""+valor3);
                    }else {
                        valor3=Integer.parseInt(et2_6_3.getText().toString());
                        resultado=resultado+valor3;
                        preResultado=preResultado+valor3;
                        sub2_6.setText(""+preResultado);
                        total2_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_6_4:
                    if(et2_6_4.equals("")){
                        sub2_6.setText("");
                        total2_6.setText("");
                    }else if(et2_6_4.equals("X")){
                        valor4=10;
                        sub2_6.setText(""+valor4);
                        total2_6.setText(""+valor4);
                    }else if(et2_6_4.equals("M")){
                        valor4=0;
                        sub2_6.setText(""+valor4);
                        total2_6.setText(""+valor4);
                    }else {
                        valor4=Integer.parseInt(et2_6_4.getText().toString());
                        resultado=resultado+valor4;
                        preResultado=preResultado+valor4;
                        sub2_6.setText(""+preResultado);
                        total2_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_6_5:
                    if(et2_6_5.equals("")){
                        sub2_6.setText("");
                        total2_6.setText("");
                    }else if(et2_6_5.equals("X")){
                        valor5=10;
                        sub2_6.setText(""+valor5);
                        total2_6.setText(""+valor5);
                    }else if(et2_6_5.equals("M")){
                        valor5=0;
                        sub2_6.setText(""+valor5);
                        total2_6.setText(""+valor5);
                    }else {
                        valor5=Integer.parseInt(et2_6_5.getText().toString());
                        resultado=resultado+valor5;
                        preResultado=preResultado+valor5;
                        sub2_6.setText(""+preResultado);
                        total2_6.setText(""+resultado);
                    }
                    break;
                case R.id.editText2_6_6:
                    if(et2_6_6.equals("")){
                        sub2_6.setText("");
                        total2_6.setText("");
                    }else if(et2_6_6.equals("X")){
                        valor6=10;
                        sub2_6.setText(""+valor6);
                        total2_6.setText(""+valor6);
                    }else if(et2_6_6.equals("M")){
                        valor6=0;
                        sub2_6.setText(""+valor6);
                        total2_6.setText(""+valor6);
                    }else {
                        valor6=Integer.parseInt(et2_6_6.getText().toString());
                        resultado=resultado+valor6;
                        preResultado=preResultado+valor6;
                        sub2_6.setText(""+preResultado);
                        total2_6.setText(""+resultado);
                    }
                    break;
            }

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private ArrayList<String []> getPuntos(){
        ArrayList<String[]>rows=new ArrayList<>();
        rows.add(new String[]{"1","3","3","3","9","9"});
        rows.add(new String[]{"1","3","3","3","9","18"});
        rows.add(new String[]{"1","3","3","3","9","27"});
        rows.add(new String[]{"1","3","3","3","9","36"});
        rows.add(new String[]{"1","3","3","3","9","45"});
        rows.add(new String[]{"1","3","3","3","9","54"});
        rows.add(new String[]{"1","3","3","3","9","63"});
        rows.add(new String[]{"1","3","3","3","9","72"});
        rows.add(new String[]{"1","3","3","3","9","81"});
        rows.add(new String[]{"1","3","3","3","9","90"});
        return rows;
    }
    // metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_puntaje, menu);
        return true;
    }
    // menu para activar las funciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id == R.id.estadistica){
            Intent intent=new Intent(TableroPuntos2.this,Estadistica.class);
            startActivity(intent);
        }else if(id==R.id.generarPdf){
            template3PDF.appViewPDF(this);
            Toast.makeText(TableroPuntos2.this,"El pdf se guardo en la carpeta 'Archery'",Toast.LENGTH_LONG).show();
        }else if(id==R.id.enviar){
            Toast.makeText(TableroPuntos2.this,"enviar",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
