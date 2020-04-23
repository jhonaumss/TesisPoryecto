package tiroconarco.harold.tesisporyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TableroPuntos extends AppCompatActivity {

    private EditText et1_1,et1_2,et1_3,et1_4,et1_5,et1_6,et2_1,et2_2,et2_3,et2_4,et2_5,et2_6,et3_1,et3_2,et3_3,et3_4,et3_5,et3_6,et4_1,et4_2,et4_3,et4_4,et4_5,et4_6,et5_1,et5_2,et5_3,et5_4,et5_5,et5_6,et6_1,et6_2,et6_3,et6_4,et6_5,et6_6,
            et2_1_1,et2_1_2,et2_1_3,et2_1_4,et2_1_5,et2_1_6,et2_2_1,et2_2_2,et2_2_3,et2_2_4,et2_2_5,et2_2_6,et2_3_1,et2_3_2,et2_3_3,et2_3_4,et2_3_5,et2_3_6,et2_4_1,et2_4_2,et2_4_3,et2_4_4,et2_4_5,et2_4_6,et2_5_1,et2_5_2,et2_5_3,et2_5_4,et2_5_5,et2_5_6,et2_6_1,et2_6_2,et2_6_3,et2_6_4,et2_6_5,et2_6_6,
            et3_1_1,et3_1_2,et3_1_3,et3_1_4,et3_1_5,et3_1_6,et3_2_1,et3_2_2,et3_2_3,et3_2_4,et3_2_5,et3_2_6,et3_3_1,et3_3_2,et3_3_3,et3_3_4,et3_3_5,et3_3_6,et3_4_1,et3_4_2,et3_4_3,et3_4_4,et3_4_5,et3_4_6,et3_5_1,et3_5_2,et3_5_3,et3_5_4,et3_5_5,et3_5_6,et3_6_1,et3_6_2,et3_6_3,et3_6_4,et3_6_5,et3_6_6,
            et4_1_1,et4_1_2,et4_1_3,et4_1_4,et4_1_5,et4_1_6,et4_2_1,et4_2_2,et4_2_3,et4_2_4,et4_2_5,et4_2_6,et4_3_1,et4_3_2,et4_3_3,et4_3_4,et4_3_5,et4_3_6,et4_4_1,et4_4_2,et4_4_3,et4_4_4,et4_4_5,et4_4_6,et4_5_1,et4_5_2,et4_5_3,et4_5_4,et4_5_5,et4_5_6,et4_6_1,et4_6_2,et4_6_3,et4_6_4,et4_6_5,et4_6_6;
    private TextView sub1,total1,sub2,total2,sub3,total3,sub4,total4,sub5,total5,sub6,total6,
                     sub2_1,total2_1,sub2_2,total2_2,sub2_3,total2_3,sub2_4,total2_4,sub2_5,total2_5,sub2_6,total2_6,
                     sub3_1,total3_1,sub3_2,total3_2,sub3_3,total3_3,sub3_4,total3_4,sub3_5,total3_5,sub3_6,total3_6,
                     sub4_1,total4_1,sub4_2,total4_2,sub4_3,total4_3,sub4_4,total4_4,sub4_5,total4_5,sub4_6,total4_6;
    int valor1,valor2,valor3,valor4,valor5,valor6,resultado,preResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero_puntos);

        /*
        MyKeyboard keyboard=(MyKeyboard) findViewById(R.id.keyboard);

        et1_1.setRawInputType(InputType.TYPE_CLASS_TEXT);
        et1_1.setTextIsSelectable(true);
        InputConnection ic1_1=et1_1.onCreateInputConnection(new EditorInfo());
        keyboard.setInputConnection(ic1_1);


     */
        et1_1=(EditText) findViewById(R.id.editText1_1);
        et1_2=(EditText) findViewById(R.id.editText1_2);
        et1_3=(EditText) findViewById(R.id.editText1_3);
        et1_4=(EditText) findViewById(R.id.editText1_4);
        et1_5=(EditText) findViewById(R.id.editText1_5);
        et1_6=(EditText) findViewById(R.id.editText1_6);
        sub1=(TextView) findViewById(R.id.textViewSubTotal1);
        total1=(TextView) findViewById(R.id.textViewTotal1);

        et1_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et1_1));
        et1_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et1_2));
        et1_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et1_3));
        et1_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et1_4));
        et1_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et1_5));
        et1_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et1_6));

        et2_1=(EditText) findViewById(R.id.editText2_1);
        et2_2=(EditText) findViewById(R.id.editText2_2);
        et2_3=(EditText) findViewById(R.id.editText2_3);
        et2_4=(EditText) findViewById(R.id.editText2_4);
        et2_5=(EditText) findViewById(R.id.editText2_5);
        et2_6=(EditText) findViewById(R.id.editText2_6);
        sub2=(TextView) findViewById(R.id.textViewSubTotal2);
        total2=(TextView) findViewById(R.id.textViewTotal2);

        et2_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_1));
        et2_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_2));
        et2_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_3));
        et2_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_4));
        et2_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_5));
        et2_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_6));

        et3_1=(EditText) findViewById(R.id.editText3_1);
        et3_2=(EditText) findViewById(R.id.editText3_2);
        et3_3=(EditText) findViewById(R.id.editText3_3);
        et3_4=(EditText) findViewById(R.id.editText3_4);
        et3_5=(EditText) findViewById(R.id.editText3_5);
        et3_6=(EditText) findViewById(R.id.editText3_6);
        sub3=(TextView) findViewById(R.id.textViewSubTotal3);
        total3=(TextView) findViewById(R.id.textViewTotal3);

        et3_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_1));
        et3_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_2));
        et3_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_3));
        et3_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_4));
        et3_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_5));
        et3_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_6));

        et4_1=(EditText) findViewById(R.id.editText4_1);
        et4_2=(EditText) findViewById(R.id.editText4_2);
        et4_3=(EditText) findViewById(R.id.editText4_3);
        et4_4=(EditText) findViewById(R.id.editText4_4);
        et4_5=(EditText) findViewById(R.id.editText4_5);
        et4_6=(EditText) findViewById(R.id.editText4_6);
        sub4=(TextView) findViewById(R.id.textViewSubTotal4);
        total4=(TextView) findViewById(R.id.textViewTotal4);

        et4_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_1));
        et4_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_2));
        et4_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_3));
        et4_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_4));
        et4_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_5));
        et4_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_6));

        et5_1=(EditText) findViewById(R.id.editText5_1);
        et5_2=(EditText) findViewById(R.id.editText5_2);
        et5_3=(EditText) findViewById(R.id.editText5_3);
        et5_4=(EditText) findViewById(R.id.editText5_4);
        et5_5=(EditText) findViewById(R.id.editText5_5);
        et5_6=(EditText) findViewById(R.id.editText5_6);
        sub5=(TextView) findViewById(R.id.textViewSubTotal5);
        total5=(TextView) findViewById(R.id.textViewTotal5);

        et5_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et5_1));
        et5_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et5_2));
        et5_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et5_3));
        et5_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et5_4));
        et5_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et5_5));
        et5_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et5_6));

        et6_1=(EditText) findViewById(R.id.editText6_1);
        et6_2=(EditText) findViewById(R.id.editText6_2);
        et6_3=(EditText) findViewById(R.id.editText6_3);
        et6_4=(EditText) findViewById(R.id.editText6_4);
        et6_5=(EditText) findViewById(R.id.editText6_5);
        et6_6=(EditText) findViewById(R.id.editText6_6);
        sub6=(TextView) findViewById(R.id.textViewSubTotal6);
        total6=(TextView) findViewById(R.id.textViewTotal6);

        et6_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et6_1));
        et6_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et6_2));
        et6_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et6_3));
        et6_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et6_4));
        et6_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et6_5));
        et6_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et6_6));

        et2_1_1=(EditText) findViewById(R.id.editText2_1_1);
        et2_1_2=(EditText) findViewById(R.id.editText2_1_2);
        et2_1_3=(EditText) findViewById(R.id.editText2_1_3);
        et2_1_4=(EditText) findViewById(R.id.editText2_1_4);
        et2_1_5=(EditText) findViewById(R.id.editText2_1_5);
        et2_1_6=(EditText) findViewById(R.id.editText2_1_6);
        sub2_1=(TextView) findViewById(R.id.textViewSubTotal2_1);
        total2_1=(TextView) findViewById(R.id.textViewTotal2_1);

        et2_1_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_1_1));
        et2_1_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_1_2));
        et2_1_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_1_3));
        et2_1_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_1_4));
        et2_1_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_1_5));
        et2_1_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_1_6));

        et2_2_1=(EditText) findViewById(R.id.editText2_2_1);
        et2_2_2=(EditText) findViewById(R.id.editText2_2_2);
        et2_2_3=(EditText) findViewById(R.id.editText2_2_3);
        et2_2_4=(EditText) findViewById(R.id.editText2_2_4);
        et2_2_5=(EditText) findViewById(R.id.editText2_2_5);
        et2_2_6=(EditText) findViewById(R.id.editText2_2_6);
        sub2_2=(TextView) findViewById(R.id.textViewSubTotal2_2);
        total2_2=(TextView) findViewById(R.id.textViewTotal2_2);

        et2_2_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_2_1));
        et2_2_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_2_2));
        et2_2_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_2_3));
        et2_2_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_2_4));
        et2_2_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_2_5));
        et2_2_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_2_6));

        et2_3_1=(EditText) findViewById(R.id.editText2_3_1);
        et2_3_2=(EditText) findViewById(R.id.editText2_3_2);
        et2_3_3=(EditText) findViewById(R.id.editText2_3_3);
        et2_3_4=(EditText) findViewById(R.id.editText2_3_4);
        et2_3_5=(EditText) findViewById(R.id.editText2_3_5);
        et2_3_6=(EditText) findViewById(R.id.editText2_3_6);
        sub2_3=(TextView) findViewById(R.id.textViewSubTotal2_3);
        total2_3=(TextView) findViewById(R.id.textViewTotal2_3);

        et2_3_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_3_1));
        et2_3_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_3_2));
        et2_3_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_3_3));
        et2_3_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_3_4));
        et2_3_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_3_5));
        et2_3_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_3_6));

        et2_4_1=(EditText) findViewById(R.id.editText2_4_1);
        et2_4_2=(EditText) findViewById(R.id.editText2_4_2);
        et2_4_3=(EditText) findViewById(R.id.editText2_4_3);
        et2_4_4=(EditText) findViewById(R.id.editText2_4_4);
        et2_4_5=(EditText) findViewById(R.id.editText2_4_5);
        et2_4_6=(EditText) findViewById(R.id.editText2_4_6);
        sub2_4=(TextView) findViewById(R.id.textViewSubTotal2_4);
        total2_4=(TextView) findViewById(R.id.textViewTotal2_4);

        et2_4_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_4_1));
        et2_4_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_4_2));
        et2_4_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_4_3));
        et2_4_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_4_4));
        et2_4_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_4_5));
        et2_4_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_4_6));

        et2_5_1=(EditText) findViewById(R.id.editText2_5_1);
        et2_5_2=(EditText) findViewById(R.id.editText2_5_2);
        et2_5_3=(EditText) findViewById(R.id.editText2_5_3);
        et2_5_4=(EditText) findViewById(R.id.editText2_5_4);
        et2_5_5=(EditText) findViewById(R.id.editText2_5_5);
        et2_5_6=(EditText) findViewById(R.id.editText2_5_6);
        sub2_5=(TextView) findViewById(R.id.textViewSubTotal2_5);
        total2_5=(TextView) findViewById(R.id.textViewTotal2_5);

        et2_5_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_5_1));
        et2_5_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_5_2));
        et2_5_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_5_3));
        et2_5_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_5_4));
        et2_5_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_5_5));
        et2_5_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_5_6));

        et2_6_1=(EditText) findViewById(R.id.editText2_6_1);
        et2_6_2=(EditText) findViewById(R.id.editText2_6_2);
        et2_6_3=(EditText) findViewById(R.id.editText2_6_3);
        et2_6_4=(EditText) findViewById(R.id.editText2_6_4);
        et2_6_5=(EditText) findViewById(R.id.editText2_6_5);
        et2_6_6=(EditText) findViewById(R.id.editText2_6_6);
        sub2_6=(TextView) findViewById(R.id.textViewSubTotal2_6);
        total2_6=(TextView) findViewById(R.id.textViewTotal2_6);

        et2_6_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_6_1));
        et2_6_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_6_2));
        et2_6_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_6_3));
        et2_6_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_6_4));
        et2_6_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_6_5));
        et2_6_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et2_6_6));

        et3_1_1=(EditText) findViewById(R.id.editText3_1_1);
        et3_1_2=(EditText) findViewById(R.id.editText3_1_2);
        et3_1_3=(EditText) findViewById(R.id.editText3_1_3);
        et3_1_4=(EditText) findViewById(R.id.editText3_1_4);
        et3_1_5=(EditText) findViewById(R.id.editText3_1_5);
        et3_1_6=(EditText) findViewById(R.id.editText3_1_6);
        sub3_1=(TextView) findViewById(R.id.textViewSubTotal3_1);
        total3_1=(TextView) findViewById(R.id.textViewTotal3_1);

        et3_1_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_1_1));
        et3_1_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_1_2));
        et3_1_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_1_3));
        et3_1_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_1_4));
        et3_1_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_1_5));
        et3_1_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_1_6));

        et3_2_1=(EditText) findViewById(R.id.editText3_2_1);
        et3_2_2=(EditText) findViewById(R.id.editText3_2_2);
        et3_2_3=(EditText) findViewById(R.id.editText3_2_3);
        et3_2_4=(EditText) findViewById(R.id.editText3_2_4);
        et3_2_5=(EditText) findViewById(R.id.editText3_2_5);
        et3_2_6=(EditText) findViewById(R.id.editText3_2_6);
        sub3_2=(TextView) findViewById(R.id.textViewSubTotal3_2);
        total3_2=(TextView) findViewById(R.id.textViewTotal3_2);

        et3_2_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_2_1));
        et3_2_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_2_2));
        et3_2_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_2_3));
        et3_2_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_2_4));
        et3_2_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_2_5));
        et3_2_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_2_6));

        et3_3_1=(EditText) findViewById(R.id.editText3_3_1);
        et3_3_2=(EditText) findViewById(R.id.editText3_3_2);
        et3_3_3=(EditText) findViewById(R.id.editText3_3_3);
        et3_3_4=(EditText) findViewById(R.id.editText3_3_4);
        et3_3_5=(EditText) findViewById(R.id.editText3_3_5);
        et3_3_6=(EditText) findViewById(R.id.editText3_3_6);
        sub3_3=(TextView) findViewById(R.id.textViewSubTotal3_3);
        total3_3=(TextView) findViewById(R.id.textViewTotal3_3);

        et3_3_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_3_1));
        et3_3_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_3_2));
        et3_3_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_3_3));
        et3_3_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_3_4));
        et3_3_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_3_5));
        et3_3_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_3_6));

        et3_4_1=(EditText) findViewById(R.id.editText3_4_1);
        et3_4_2=(EditText) findViewById(R.id.editText3_4_2);
        et3_4_3=(EditText) findViewById(R.id.editText3_4_3);
        et3_4_4=(EditText) findViewById(R.id.editText3_4_4);
        et3_4_5=(EditText) findViewById(R.id.editText3_4_5);
        et3_4_6=(EditText) findViewById(R.id.editText3_4_6);
        sub3_4=(TextView) findViewById(R.id.textViewSubTotal3_4);
        total3_4=(TextView) findViewById(R.id.textViewTotal3_4);

        et3_4_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_4_1));
        et3_4_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_4_2));
        et3_4_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_4_3));
        et3_4_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_4_4));
        et3_4_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_4_5));
        et3_4_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_4_6));

        et3_5_1=(EditText) findViewById(R.id.editText3_5_1);
        et3_5_2=(EditText) findViewById(R.id.editText3_5_2);
        et3_5_3=(EditText) findViewById(R.id.editText3_5_3);
        et3_5_4=(EditText) findViewById(R.id.editText3_5_4);
        et3_5_5=(EditText) findViewById(R.id.editText3_5_5);
        et3_5_6=(EditText) findViewById(R.id.editText3_5_6);
        sub3_5=(TextView) findViewById(R.id.textViewSubTotal3_5);
        total3_5=(TextView) findViewById(R.id.textViewTotal3_5);

        et3_5_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_5_1));
        et3_5_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_5_2));
        et3_5_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_5_3));
        et3_5_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_5_4));
        et3_5_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_5_5));
        et3_5_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_5_6));

        et3_6_1=(EditText) findViewById(R.id.editText3_6_1);
        et3_6_2=(EditText) findViewById(R.id.editText3_6_2);
        et3_6_3=(EditText) findViewById(R.id.editText3_6_3);
        et3_6_4=(EditText) findViewById(R.id.editText3_6_4);
        et3_6_5=(EditText) findViewById(R.id.editText3_6_5);
        et3_6_6=(EditText) findViewById(R.id.editText3_6_6);
        sub3_6=(TextView) findViewById(R.id.textViewSubTotal3_6);
        total3_6=(TextView) findViewById(R.id.textViewTotal3_6);

        et3_6_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_6_1));
        et3_6_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_6_2));
        et3_6_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_6_3));
        et3_6_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_6_4));
        et3_6_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_6_5));
        et3_6_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et3_6_6));

        et4_1_1=(EditText) findViewById(R.id.editText4_1_1);
        et4_1_2=(EditText) findViewById(R.id.editText4_1_2);
        et4_1_3=(EditText) findViewById(R.id.editText4_1_3);
        et4_1_4=(EditText) findViewById(R.id.editText4_1_4);
        et4_1_5=(EditText) findViewById(R.id.editText4_1_5);
        et4_1_6=(EditText) findViewById(R.id.editText4_1_6);
        sub4_1=(TextView) findViewById(R.id.textViewSubTotal4_1);
        total4_1=(TextView) findViewById(R.id.textViewTotal4_1);

        et4_1_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_1_1));
        et4_1_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_1_2));
        et4_1_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_1_3));
        et4_1_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_1_4));
        et4_1_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_1_5));
        et4_1_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_1_6));

        et4_2_1=(EditText) findViewById(R.id.editText4_2_1);
        et4_2_2=(EditText) findViewById(R.id.editText4_2_2);
        et4_2_3=(EditText) findViewById(R.id.editText4_2_3);
        et4_2_4=(EditText) findViewById(R.id.editText4_2_4);
        et4_2_5=(EditText) findViewById(R.id.editText4_2_5);
        et4_2_6=(EditText) findViewById(R.id.editText4_2_6);
        sub4_2=(TextView) findViewById(R.id.textViewSubTotal4_2);
        total4_2=(TextView) findViewById(R.id.textViewTotal4_2);

        et4_2_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_2_1));
        et4_2_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_2_2));
        et4_2_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_2_3));
        et4_2_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_2_4));
        et4_2_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_2_5));
        et4_2_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_2_6));


        et4_3_1=(EditText) findViewById(R.id.editText4_3_1);
        et4_3_2=(EditText) findViewById(R.id.editText4_3_2);
        et4_3_3=(EditText) findViewById(R.id.editText4_3_3);
        et4_3_4=(EditText) findViewById(R.id.editText4_3_4);
        et4_3_5=(EditText) findViewById(R.id.editText4_3_5);
        et4_3_6=(EditText) findViewById(R.id.editText4_3_6);
        sub4_3=(TextView) findViewById(R.id.textViewSubTotal4_3);
        total4_3=(TextView) findViewById(R.id.textViewTotal4_3);

        et4_3_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_3_1));
        et4_3_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_3_2));
        et4_3_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_3_3));
        et4_3_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_3_4));
        et4_3_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_3_5));
        et4_3_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_3_6));

        et4_4_1=(EditText) findViewById(R.id.editText4_4_1);
        et4_4_2=(EditText) findViewById(R.id.editText4_4_2);
        et4_4_3=(EditText) findViewById(R.id.editText4_4_3);
        et4_4_4=(EditText) findViewById(R.id.editText4_4_4);
        et4_4_5=(EditText) findViewById(R.id.editText4_4_5);
        et4_4_6=(EditText) findViewById(R.id.editText4_4_6);
        sub4_4=(TextView) findViewById(R.id.textViewSubTotal4_4);
        total4_4=(TextView) findViewById(R.id.textViewTotal4_4);

        et4_4_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_4_1));
        et4_4_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_4_2));
        et4_4_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_4_3));
        et4_4_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_4_4));
        et4_4_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_4_5));
        et4_4_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_4_6));

        et4_5_1=(EditText) findViewById(R.id.editText4_5_1);
        et4_5_2=(EditText) findViewById(R.id.editText4_5_2);
        et4_5_3=(EditText) findViewById(R.id.editText4_5_3);
        et4_5_4=(EditText) findViewById(R.id.editText4_5_4);
        et4_5_5=(EditText) findViewById(R.id.editText4_5_5);
        et4_5_6=(EditText) findViewById(R.id.editText4_5_6);
        sub4_5=(TextView) findViewById(R.id.textViewSubTotal4_5);
        total4_5=(TextView) findViewById(R.id.textViewTotal4_5);

        et4_5_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_5_1));
        et4_5_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_5_2));
        et4_5_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_5_3));
        et4_5_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_5_4));
        et4_5_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_5_5));
        et4_5_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_5_6));

        et4_6_1=(EditText) findViewById(R.id.editText4_6_1);
        et4_6_2=(EditText) findViewById(R.id.editText4_6_2);
        et4_6_3=(EditText) findViewById(R.id.editText4_6_3);
        et4_6_4=(EditText) findViewById(R.id.editText4_6_4);
        et4_6_5=(EditText) findViewById(R.id.editText4_6_5);
        et4_6_6=(EditText) findViewById(R.id.editText4_6_6);
        sub4_6=(TextView) findViewById(R.id.textViewSubTotal4_6);
        total4_6=(TextView) findViewById(R.id.textViewTotal4_6);

        et4_6_1.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_6_1));
        et4_6_2.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_6_2));
        et4_6_3.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_6_3));
        et4_6_4.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_6_4));
        et4_6_5.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_6_5));
        et4_6_6.addTextChangedListener(new TableroPuntos.GenericTextWatcher(et4_6_6));
/*
        AdminSQLiteOpenHelper con=new AdminSQLiteOpenHelper(TableroPuntos.this,"db_puntaje",null,1);
        SQLiteDatabase db=con.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_N1,et1_1.getText().toString());
        values.put(Utilidades.CAMPO_N2,et1_2.getText().toString());
        values.put(Utilidades.CAMPO_N3,et1_3.getText().toString());
        values.put(Utilidades.CAMPO_N4,et1_4.getText().toString());
        values.put(Utilidades.CAMPO_N5,et1_5.getText().toString());
        values.put(Utilidades.CAMPO_N6,et1_6.getText().toString());
        values.put(Utilidades.CAMPO_S1,sub1.getText().toString());
        values.put(Utilidades.CAMPO_T1,total1.getText().toString());

        values.put(Utilidades.CAMPO_N7,et2_1.getText().toString());
        values.put(Utilidades.CAMPO_N8,et2_2.getText().toString());
        values.put(Utilidades.CAMPO_N9,et2_3.getText().toString());
        values.put(Utilidades.CAMPO_N10,et2_4.getText().toString());
        values.put(Utilidades.CAMPO_N11,et2_5.getText().toString());
        values.put(Utilidades.CAMPO_N12,et2_6.getText().toString());
        values.put(Utilidades.CAMPO_S2,sub2.getText().toString());
        values.put(Utilidades.CAMPO_T2,total2.getText().toString());

        values.put(Utilidades.CAMPO_N13,et3_1.getText().toString());
        values.put(Utilidades.CAMPO_N14,et3_2.getText().toString());
        values.put(Utilidades.CAMPO_N15,et3_3.getText().toString());
        values.put(Utilidades.CAMPO_N16,et3_4.getText().toString());
        values.put(Utilidades.CAMPO_N17,et3_5.getText().toString());
        values.put(Utilidades.CAMPO_N18,et3_6.getText().toString());
        values.put(Utilidades.CAMPO_S3,sub3.getText().toString());
        values.put(Utilidades.CAMPO_T3,total3.getText().toString());

        values.put(Utilidades.CAMPO_N19,et4_1.getText().toString());
        values.put(Utilidades.CAMPO_N20,et4_2.getText().toString());
        values.put(Utilidades.CAMPO_N21,et4_3.getText().toString());
        values.put(Utilidades.CAMPO_N22,et4_4.getText().toString());
        values.put(Utilidades.CAMPO_N23,et4_5.getText().toString());
        values.put(Utilidades.CAMPO_N24,et4_6.getText().toString());
        values.put(Utilidades.CAMPO_S4,sub4.getText().toString());
        values.put(Utilidades.CAMPO_T4,total4.getText().toString());

        values.put(Utilidades.CAMPO_N25,et5_1.getText().toString());
        values.put(Utilidades.CAMPO_N26,et5_2.getText().toString());
        values.put(Utilidades.CAMPO_N27,et5_3.getText().toString());
        values.put(Utilidades.CAMPO_N28,et5_4.getText().toString());
        values.put(Utilidades.CAMPO_N29,et5_5.getText().toString());
        values.put(Utilidades.CAMPO_N30,et5_6.getText().toString());
        values.put(Utilidades.CAMPO_S5,sub5.getText().toString());
        values.put(Utilidades.CAMPO_T5,total5.getText().toString());

        values.put(Utilidades.CAMPO_N31,et6_1.getText().toString());
        values.put(Utilidades.CAMPO_N32,et6_2.getText().toString());
        values.put(Utilidades.CAMPO_N33,et6_3.getText().toString());
        values.put(Utilidades.CAMPO_N34,et6_4.getText().toString());
        values.put(Utilidades.CAMPO_N35,et6_5.getText().toString());
        values.put(Utilidades.CAMPO_N36,et6_6.getText().toString());
        values.put(Utilidades.CAMPO_S6,sub6.getText().toString());
        values.put(Utilidades.CAMPO_T6,total6.getText().toString());
        ///////////////
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
        ////////////
        values.put(Utilidades.CAMPO_N73,et3_1_1.getText().toString());
        values.put(Utilidades.CAMPO_N74,et3_1_2.getText().toString());
        values.put(Utilidades.CAMPO_N75,et3_1_3.getText().toString());
        values.put(Utilidades.CAMPO_N76,et3_1_4.getText().toString());
        values.put(Utilidades.CAMPO_N77,et3_1_5.getText().toString());
        values.put(Utilidades.CAMPO_N78,et3_1_6.getText().toString());
        values.put(Utilidades.CAMPO_S13,sub3_1.getText().toString());
        values.put(Utilidades.CAMPO_T13,total3_1.getText().toString());

        values.put(Utilidades.CAMPO_N79,et3_2_1.getText().toString());
        values.put(Utilidades.CAMPO_N80,et3_2_2.getText().toString());
        values.put(Utilidades.CAMPO_N81,et3_2_3.getText().toString());
        values.put(Utilidades.CAMPO_N82,et3_2_4.getText().toString());
        values.put(Utilidades.CAMPO_N83,et3_2_5.getText().toString());
        values.put(Utilidades.CAMPO_N84,et3_2_6.getText().toString());
        values.put(Utilidades.CAMPO_S14,sub3_2.getText().toString());
        values.put(Utilidades.CAMPO_T14,total3_2.getText().toString());

        values.put(Utilidades.CAMPO_N85,et3_3_1.getText().toString());
        values.put(Utilidades.CAMPO_N86,et3_3_2.getText().toString());
        values.put(Utilidades.CAMPO_N87,et3_3_3.getText().toString());
        values.put(Utilidades.CAMPO_N88,et3_3_4.getText().toString());
        values.put(Utilidades.CAMPO_N89,et3_3_5.getText().toString());
        values.put(Utilidades.CAMPO_N90,et3_3_6.getText().toString());
        values.put(Utilidades.CAMPO_S15,sub3_3.getText().toString());
        values.put(Utilidades.CAMPO_T15,total3_3.getText().toString());

        values.put(Utilidades.CAMPO_N91,et3_4_1.getText().toString());
        values.put(Utilidades.CAMPO_N92,et3_4_2.getText().toString());
        values.put(Utilidades.CAMPO_N93,et3_4_3.getText().toString());
        values.put(Utilidades.CAMPO_N94,et3_4_4.getText().toString());
        values.put(Utilidades.CAMPO_N95,et3_4_5.getText().toString());
        values.put(Utilidades.CAMPO_N96,et3_4_6.getText().toString());
        values.put(Utilidades.CAMPO_S16,sub3_4.getText().toString());
        values.put(Utilidades.CAMPO_T16,total3_4.getText().toString());

        values.put(Utilidades.CAMPO_N97,et3_5_1.getText().toString());
        values.put(Utilidades.CAMPO_N98,et3_5_2.getText().toString());
        values.put(Utilidades.CAMPO_N99,et3_5_3.getText().toString());
        values.put(Utilidades.CAMPO_N100,et3_5_4.getText().toString());
        values.put(Utilidades.CAMPO_N101,et3_5_5.getText().toString());
        values.put(Utilidades.CAMPO_N102,et3_5_6.getText().toString());
        values.put(Utilidades.CAMPO_S17,sub3_5.getText().toString());
        values.put(Utilidades.CAMPO_T17,total3_5.getText().toString());

        values.put(Utilidades.CAMPO_N103,et3_6_1.getText().toString());
        values.put(Utilidades.CAMPO_N104,et3_6_2.getText().toString());
        values.put(Utilidades.CAMPO_N105,et3_6_3.getText().toString());
        values.put(Utilidades.CAMPO_N106,et3_6_4.getText().toString());
        values.put(Utilidades.CAMPO_N107,et3_6_5.getText().toString());
        values.put(Utilidades.CAMPO_N108,et3_6_6.getText().toString());
        values.put(Utilidades.CAMPO_S18,sub3_6.getText().toString());
        values.put(Utilidades.CAMPO_T18,total3_6.getText().toString());
        /////////////////
        values.put(Utilidades.CAMPO_N109,et4_1_1.getText().toString());
        values.put(Utilidades.CAMPO_N110,et4_1_2.getText().toString());
        values.put(Utilidades.CAMPO_N111,et4_1_3.getText().toString());
        values.put(Utilidades.CAMPO_N112,et4_1_4.getText().toString());
        values.put(Utilidades.CAMPO_N113,et4_1_5.getText().toString());
        values.put(Utilidades.CAMPO_N114,et4_1_6.getText().toString());
        values.put(Utilidades.CAMPO_S19,sub4_1.getText().toString());
        values.put(Utilidades.CAMPO_T19,total4_1.getText().toString());

        values.put(Utilidades.CAMPO_N115,et4_2_1.getText().toString());
        values.put(Utilidades.CAMPO_N116,et4_2_2.getText().toString());
        values.put(Utilidades.CAMPO_N117,et4_2_3.getText().toString());
        values.put(Utilidades.CAMPO_N118,et4_2_4.getText().toString());
        values.put(Utilidades.CAMPO_N119,et4_2_5.getText().toString());
        values.put(Utilidades.CAMPO_N120,et4_2_6.getText().toString());
        values.put(Utilidades.CAMPO_S20,sub4_2.getText().toString());
        values.put(Utilidades.CAMPO_T20,total4_2.getText().toString());

        values.put(Utilidades.CAMPO_N121,et4_3_1.getText().toString());
        values.put(Utilidades.CAMPO_N122,et4_3_2.getText().toString());
        values.put(Utilidades.CAMPO_N123,et4_3_3.getText().toString());
        values.put(Utilidades.CAMPO_N124,et4_3_4.getText().toString());
        values.put(Utilidades.CAMPO_N125,et4_3_5.getText().toString());
        values.put(Utilidades.CAMPO_N126,et4_3_6.getText().toString());
        values.put(Utilidades.CAMPO_S21,sub4_3.getText().toString());
        values.put(Utilidades.CAMPO_T21,total4_3.getText().toString());

        values.put(Utilidades.CAMPO_N127,et4_4_1.getText().toString());
        values.put(Utilidades.CAMPO_N128,et4_4_2.getText().toString());
        values.put(Utilidades.CAMPO_N129,et4_4_3.getText().toString());
        values.put(Utilidades.CAMPO_N130,et4_4_4.getText().toString());
        values.put(Utilidades.CAMPO_N131,et4_4_5.getText().toString());
        values.put(Utilidades.CAMPO_N132,et4_4_6.getText().toString());
        values.put(Utilidades.CAMPO_S22,sub4_4.getText().toString());
        values.put(Utilidades.CAMPO_T22,total4_4.getText().toString());

        values.put(Utilidades.CAMPO_N133,et4_5_1.getText().toString());
        values.put(Utilidades.CAMPO_N134,et4_5_2.getText().toString());
        values.put(Utilidades.CAMPO_N135,et4_5_3.getText().toString());
        values.put(Utilidades.CAMPO_N136,et4_5_4.getText().toString());
        values.put(Utilidades.CAMPO_N137,et4_5_5.getText().toString());
        values.put(Utilidades.CAMPO_N138,et4_5_6.getText().toString());
        values.put(Utilidades.CAMPO_S23,sub4_5.getText().toString());
        values.put(Utilidades.CAMPO_T23,total4_5.getText().toString());

        values.put(Utilidades.CAMPO_N139,et4_6_1.getText().toString());
        values.put(Utilidades.CAMPO_N140,et4_6_2.getText().toString());
        values.put(Utilidades.CAMPO_N141,et4_6_3.getText().toString());
        values.put(Utilidades.CAMPO_N142,et4_6_4.getText().toString());
        values.put(Utilidades.CAMPO_N143,et4_6_5.getText().toString());
        values.put(Utilidades.CAMPO_N144,et4_6_6.getText().toString());
        values.put(Utilidades.CAMPO_S24,sub4_6.getText().toString());
        values.put(Utilidades.CAMPO_T24,total4_6.getText().toString());

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


        }

        @Override
        public void afterTextChanged(Editable s) {

            switch (view.getId()){
                case R.id.editText1_1:
                    valor1=Integer.parseInt(et1_1.getText().toString());
                    resultado=valor1;
                    sub1.setText(""+resultado);
                    total1.setText(""+resultado);
                    break;
                case R.id.editText1_2:
                    valor2=Integer.parseInt(et1_2.getText().toString());
                    resultado=resultado+valor2;
                    sub1.setText(""+resultado);
                    total1.setText(""+resultado);
                    break;
                case R.id.editText1_3:
                    valor3=Integer.parseInt(et1_3.getText().toString());
                    resultado=resultado+valor3;
                    sub1.setText(""+resultado);
                    total1.setText(""+resultado);
                    break;
                case R.id.editText1_4:
                    valor4=Integer.parseInt(et1_4.getText().toString());
                    resultado=resultado+valor4;
                    sub1.setText(""+resultado);
                    total1.setText(""+resultado);
                    break;
                case R.id.editText1_5:
                    valor5=Integer.parseInt(et1_5.getText().toString());
                    resultado=resultado+valor5;
                    sub1.setText(""+resultado);
                    total1.setText(""+resultado);
                    break;
                case R.id.editText1_6:
                    valor6=Integer.parseInt(et1_6.getText().toString());
                    resultado=resultado+valor6;
                    sub1.setText(""+resultado);
                    total1.setText(""+resultado);
                    break;
                case R.id.editText2_1:
                    valor1=Integer.parseInt(et2_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub2.setText(""+preResultado);
                    total2.setText(""+resultado);
                    break;
                case R.id.editText2_2:
                    valor2=Integer.parseInt(et2_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub2.setText(""+preResultado);
                    total2.setText(""+resultado);
                    break;
                case R.id.editText2_3:
                    valor3=Integer.parseInt(et2_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub2.setText(""+preResultado);
                    total2.setText(""+resultado);
                    break;
                case R.id.editText2_4:
                    valor4=Integer.parseInt(et2_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub2.setText(""+preResultado);
                    total2.setText(""+resultado);
                    break;
                case R.id.editText2_5:
                    valor5=Integer.parseInt(et2_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub2.setText(""+preResultado);
                    total2.setText(""+resultado);
                    break;
                case R.id.editText2_6:
                    valor6=Integer.parseInt(et2_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub2.setText(""+preResultado);
                    total2.setText(""+resultado);
                    break;
                case R.id.editText3_1:
                    valor1=Integer.parseInt(et3_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub3.setText(""+preResultado);
                    total3.setText(""+resultado);
                    break;
                case R.id.editText3_2:
                    valor2=Integer.parseInt(et3_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub3.setText(""+preResultado);
                    total3.setText(""+resultado);
                    break;
                case R.id.editText3_3:
                    valor3=Integer.parseInt(et3_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub3.setText(""+preResultado);
                    total3.setText(""+resultado);
                    break;
                case R.id.editText3_4:
                    valor4=Integer.parseInt(et3_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub3.setText(""+preResultado);
                    total3.setText(""+resultado);
                    break;
                case R.id.editText3_5:
                    valor5=Integer.parseInt(et3_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub3.setText(""+preResultado);
                    total3.setText(""+resultado);
                    break;
                case R.id.editText3_6:
                    valor6=Integer.parseInt(et3_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub3.setText(""+preResultado);
                    total3.setText(""+resultado);
                    break;
                case R.id.editText4_1:
                    valor1=Integer.parseInt(et4_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub4.setText(""+preResultado);
                    total4.setText(""+resultado);
                    break;
                case R.id.editText4_2:
                    valor2=Integer.parseInt(et4_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub4.setText(""+preResultado);
                    total4.setText(""+resultado);
                    break;
                case R.id.editText4_3:
                    valor3=Integer.parseInt(et4_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub4.setText(""+preResultado);
                    total4.setText(""+resultado);
                    break;
                case R.id.editText4_4:
                    valor4=Integer.parseInt(et4_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub4.setText(""+preResultado);
                    total4.setText(""+resultado);
                    break;
                case R.id.editText4_5:
                    valor5=Integer.parseInt(et4_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub4.setText(""+preResultado);
                    total4.setText(""+resultado);
                    break;
                case R.id.editText4_6:
                    valor6=Integer.parseInt(et4_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub4.setText(""+preResultado);
                    total4.setText(""+resultado);
                    break;
                case R.id.editText5_1:
                    valor1=Integer.parseInt(et5_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub5.setText(""+preResultado);
                    total5.setText(""+resultado);
                    break;
                case R.id.editText5_2:
                    valor2=Integer.parseInt(et5_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub5.setText(""+preResultado);
                    total5.setText(""+resultado);
                    break;
                case R.id.editText5_3:
                    valor3=Integer.parseInt(et5_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub5.setText(""+preResultado);
                    total5.setText(""+resultado);
                    break;
                case R.id.editText5_4:
                    valor4=Integer.parseInt(et5_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub5.setText(""+preResultado);
                    total5.setText(""+resultado);
                    break;
                case R.id.editText5_5:
                    valor5=Integer.parseInt(et5_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub5.setText(""+preResultado);
                    total5.setText(""+resultado);
                    break;
                case R.id.editText5_6:
                    valor6=Integer.parseInt(et5_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub5.setText(""+preResultado);
                    total5.setText(""+resultado);
                    break;
                case R.id.editText6_1:
                    valor1=Integer.parseInt(et6_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub6.setText(""+preResultado);
                    total6.setText(""+resultado);
                    break;
                case R.id.editText6_2:
                    valor2=Integer.parseInt(et6_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub6.setText(""+preResultado);
                    total6.setText(""+resultado);
                    break;
                case R.id.editText6_3:
                    valor3=Integer.parseInt(et6_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub6.setText(""+preResultado);
                    total6.setText(""+resultado);
                    break;
                case R.id.editText6_4:
                    valor4=Integer.parseInt(et6_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub6.setText(""+preResultado);
                    total6.setText(""+resultado);
                    break;
                case R.id.editText6_5:
                    valor5=Integer.parseInt(et6_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub6.setText(""+preResultado);
                    total6.setText(""+resultado);
                    break;
                case R.id.editText6_6:
                    valor6=Integer.parseInt(et6_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub6.setText(""+preResultado);
                    total6.setText(""+resultado);
                    break;
                case R.id.editText2_1_1:
                    valor1=Integer.parseInt(et2_1_1.getText().toString());
                    resultado=valor1;
                    sub2_1.setText(""+resultado);
                    total2_1.setText(""+resultado);
                    break;
                case R.id.editText2_1_2:
                    valor2=Integer.parseInt(et2_1_2.getText().toString());
                    resultado=resultado+valor2;
                    sub2_1.setText(""+resultado);
                    total2_1.setText(""+resultado);
                    break;
                case R.id.editText2_1_3:
                    valor3=Integer.parseInt(et2_1_3.getText().toString());
                    resultado=resultado+valor3;
                    sub2_1.setText(""+resultado);
                    total2_1.setText(""+resultado);
                    break;
                case R.id.editText2_1_4:
                    valor4=Integer.parseInt(et2_1_4.getText().toString());
                    resultado=resultado+valor4;
                    sub2_1.setText(""+resultado);
                    total2_1.setText(""+resultado);
                    break;
                case R.id.editText2_1_5:
                    valor5=Integer.parseInt(et2_1_5.getText().toString());
                    resultado=resultado+valor5;
                    sub2_1.setText(""+resultado);
                    total2_1.setText(""+resultado);
                    break;
                case R.id.editText2_1_6:
                    valor6=Integer.parseInt(et2_1_6.getText().toString());
                    resultado=resultado+valor6;
                    sub2_1.setText(""+resultado);
                    total2_1.setText(""+resultado);
                    break;
                case R.id.editText2_2_1:
                    valor1=Integer.parseInt(et2_2_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub2_2.setText(""+preResultado);
                    total2_2.setText(""+resultado);
                    break;
                case R.id.editText2_2_2:
                    valor2=Integer.parseInt(et2_2_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub2_2.setText(""+preResultado);
                    total2_2.setText(""+resultado);
                    break;
                case R.id.editText2_2_3:
                    valor3=Integer.parseInt(et2_2_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub2_2.setText(""+preResultado);
                    total2_2.setText(""+resultado);
                    break;
                case R.id.editText2_2_4:
                    valor4=Integer.parseInt(et2_2_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub2_2.setText(""+preResultado);
                    total2_2.setText(""+resultado);
                    break;
                case R.id.editText2_2_5:
                    valor5=Integer.parseInt(et2_2_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub2_2.setText(""+preResultado);
                    total2_2.setText(""+resultado);
                    break;
                case R.id.editText2_2_6:
                    valor6=Integer.parseInt(et2_2_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub2_2.setText(""+preResultado);
                    total2_2.setText(""+resultado);
                    break;
                case R.id.editText2_3_1:
                    valor1=Integer.parseInt(et2_3_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub2_3.setText(""+preResultado);
                    total2_3.setText(""+resultado);
                    break;
                case R.id.editText2_3_2:
                    valor2=Integer.parseInt(et2_3_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub2_3.setText(""+preResultado);
                    total2_3.setText(""+resultado);
                    break;
                case R.id.editText2_3_3:
                    valor3=Integer.parseInt(et2_3_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub2_3.setText(""+preResultado);
                    total2_3.setText(""+resultado);
                    break;
                case R.id.editText2_3_4:
                    valor4=Integer.parseInt(et2_3_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub2_3.setText(""+preResultado);
                    total2_3.setText(""+resultado);
                    break;
                case R.id.editText2_3_5:
                    valor5=Integer.parseInt(et2_3_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub2_3.setText(""+preResultado);
                    total2_3.setText(""+resultado);
                    break;
                case R.id.editText2_3_6:
                    valor6=Integer.parseInt(et2_3_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub2_3.setText(""+preResultado);
                    total2_3.setText(""+resultado);
                    break;
                case R.id.editText2_4_1:
                    valor1=Integer.parseInt(et2_4_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub2_4.setText(""+preResultado);
                    total2_4.setText(""+resultado);
                    break;
                case R.id.editText2_4_2:
                    valor2=Integer.parseInt(et2_4_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub2_4.setText(""+preResultado);
                    total2_4.setText(""+resultado);
                    break;
                case R.id.editText2_4_3:
                    valor3=Integer.parseInt(et2_4_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub2_4.setText(""+preResultado);
                    total2_4.setText(""+resultado);
                    break;
                case R.id.editText2_4_4:
                    valor4=Integer.parseInt(et2_4_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub2_4.setText(""+preResultado);
                    total2_4.setText(""+resultado);
                    break;
                case R.id.editText2_4_5:
                    valor5=Integer.parseInt(et2_4_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub2_4.setText(""+preResultado);
                    total2_4.setText(""+resultado);
                    break;
                case R.id.editText2_4_6:
                    valor6=Integer.parseInt(et2_4_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub2_4.setText(""+preResultado);
                    total2_4.setText(""+resultado);
                    break;
                case R.id.editText2_5_1:
                    valor1=Integer.parseInt(et2_5_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub2_5.setText(""+preResultado);
                    total2_5.setText(""+resultado);
                    break;
                case R.id.editText2_5_2:
                    valor2=Integer.parseInt(et2_5_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub2_5.setText(""+preResultado);
                    total2_5.setText(""+resultado);
                    break;
                case R.id.editText2_5_3:
                    valor3=Integer.parseInt(et2_5_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub2_5.setText(""+preResultado);
                    total2_5.setText(""+resultado);
                    break;
                case R.id.editText2_5_4:
                    valor4=Integer.parseInt(et2_5_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub2_5.setText(""+preResultado);
                    total2_5.setText(""+resultado);
                    break;
                case R.id.editText2_5_5:
                    valor5=Integer.parseInt(et2_5_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub2_5.setText(""+preResultado);
                    total2_5.setText(""+resultado);
                    break;
                case R.id.editText2_5_6:
                    valor6=Integer.parseInt(et2_5_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub2_5.setText(""+preResultado);
                    total2_5.setText(""+resultado);
                    break;
                case R.id.editText2_6_1:
                    valor1=Integer.parseInt(et2_6_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub2_6.setText(""+preResultado);
                    total2_6.setText(""+resultado);
                    break;
                case R.id.editText2_6_2:
                    valor2=Integer.parseInt(et2_6_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub2_6.setText(""+preResultado);
                    total2_6.setText(""+resultado);
                    break;
                case R.id.editText2_6_3:
                    valor3=Integer.parseInt(et2_6_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub2_6.setText(""+preResultado);
                    total2_6.setText(""+resultado);
                    break;
                case R.id.editText2_6_4:
                    valor4=Integer.parseInt(et2_6_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub2_6.setText(""+preResultado);
                    total2_6.setText(""+resultado);
                    break;
                case R.id.editText2_6_5:
                    valor5=Integer.parseInt(et2_6_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub2_6.setText(""+preResultado);
                    total2_6.setText(""+resultado);
                    break;
                case R.id.editText2_6_6:
                    valor6=Integer.parseInt(et2_6_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub2_6.setText(""+preResultado);
                    total2_6.setText(""+resultado);
                    break;
                case R.id.editText3_1_1:
                    valor1=Integer.parseInt(et3_1_1.getText().toString());
                    resultado=valor1;
                    sub3_1.setText(""+resultado);
                    total3_1.setText(""+resultado);
                    break;
                case R.id.editText3_1_2:
                    valor2=Integer.parseInt(et3_1_2.getText().toString());
                    resultado=resultado+valor2;
                    sub3_1.setText(""+resultado);
                    total3_1.setText(""+resultado);
                    break;
                case R.id.editText3_1_3:
                    valor3=Integer.parseInt(et3_1_3.getText().toString());
                    resultado=resultado+valor3;
                    sub3_1.setText(""+resultado);
                    total3_1.setText(""+resultado);
                    break;
                case R.id.editText3_1_4:
                    valor4=Integer.parseInt(et3_1_4.getText().toString());
                    resultado=resultado+valor4;
                    sub3_1.setText(""+resultado);
                    total3_1.setText(""+resultado);
                    break;
                case R.id.editText3_1_5:
                    valor5=Integer.parseInt(et3_1_5.getText().toString());
                    resultado=resultado+valor5;
                    sub3_1.setText(""+resultado);
                    total3_1.setText(""+resultado);
                    break;
                case R.id.editText3_1_6:
                    valor6=Integer.parseInt(et3_1_6.getText().toString());
                    resultado=resultado+valor6;
                    sub3_1.setText(""+resultado);
                    total3_1.setText(""+resultado);
                    break;
                case R.id.editText3_2_1:
                    valor1=Integer.parseInt(et3_2_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub3_2.setText(""+preResultado);
                    total3_2.setText(""+resultado);
                    break;
                case R.id.editText3_2_2:
                    valor2=Integer.parseInt(et3_2_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub3_2.setText(""+preResultado);
                    total3_2.setText(""+resultado);
                    break;
                case R.id.editText3_2_3:
                    valor3=Integer.parseInt(et3_2_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub3_2.setText(""+preResultado);
                    total3_2.setText(""+resultado);
                    break;
                case R.id.editText3_2_4:
                    valor4=Integer.parseInt(et3_2_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub3_2.setText(""+preResultado);
                    total3_2.setText(""+resultado);
                    break;
                case R.id.editText3_2_5:
                    valor5=Integer.parseInt(et3_2_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub3_2.setText(""+preResultado);
                    total3_2.setText(""+resultado);
                    break;
                case R.id.editText3_2_6:
                    valor6=Integer.parseInt(et3_2_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub3_2.setText(""+preResultado);
                    total3_2.setText(""+resultado);
                    break;
                case R.id.editText3_3_1:
                    valor1=Integer.parseInt(et3_3_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub3_3.setText(""+preResultado);
                    total3_3.setText(""+resultado);
                    break;
                case R.id.editText3_3_2:
                    valor2=Integer.parseInt(et3_3_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub3_3.setText(""+preResultado);
                    total3_3.setText(""+resultado);
                    break;
                case R.id.editText3_3_3:
                    valor3=Integer.parseInt(et3_3_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub3_3.setText(""+preResultado);
                    total3_3.setText(""+resultado);
                    break;
                case R.id.editText3_3_4:
                    valor4=Integer.parseInt(et3_3_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub3_3.setText(""+preResultado);
                    total3_3.setText(""+resultado);
                    break;
                case R.id.editText3_3_5:
                    valor5=Integer.parseInt(et3_3_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub3_3.setText(""+preResultado);
                    total3_3.setText(""+resultado);
                    break;
                case R.id.editText3_3_6:
                    valor6=Integer.parseInt(et3_3_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub3_3.setText(""+preResultado);
                    total3_3.setText(""+resultado);
                    break;
                case R.id.editText3_4_1:
                    valor1=Integer.parseInt(et3_4_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub3_4.setText(""+preResultado);
                    total3_4.setText(""+resultado);
                    break;
                case R.id.editText3_4_2:
                    valor2=Integer.parseInt(et3_4_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub3_4.setText(""+preResultado);
                    total3_4.setText(""+resultado);
                    break;
                case R.id.editText3_4_3:
                    valor3=Integer.parseInt(et3_4_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub3_4.setText(""+preResultado);
                    total3_4.setText(""+resultado);
                    break;
                case R.id.editText3_4_4:
                    valor4=Integer.parseInt(et3_4_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub3_4.setText(""+preResultado);
                    total3_4.setText(""+resultado);
                    break;
                case R.id.editText3_4_5:
                    valor5=Integer.parseInt(et3_4_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub3_4.setText(""+preResultado);
                    total3_4.setText(""+resultado);
                    break;
                case R.id.editText3_4_6:
                    valor6=Integer.parseInt(et3_4_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub3_4.setText(""+preResultado);
                    total3_4.setText(""+resultado);
                    break;
                case R.id.editText3_5_1:
                    valor1=Integer.parseInt(et3_5_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub3_5.setText(""+preResultado);
                    total3_5.setText(""+resultado);
                    break;
                case R.id.editText3_5_2:
                    valor2=Integer.parseInt(et3_5_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub3_5.setText(""+preResultado);
                    total3_5.setText(""+resultado);
                    break;
                case R.id.editText3_5_3:
                    valor3=Integer.parseInt(et3_5_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub3_5.setText(""+preResultado);
                    total3_5.setText(""+resultado);
                    break;
                case R.id.editText3_5_4:
                    valor4=Integer.parseInt(et3_5_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub3_5.setText(""+preResultado);
                    total3_5.setText(""+resultado);
                    break;
                case R.id.editText3_5_5:
                    valor5=Integer.parseInt(et3_5_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub3_5.setText(""+preResultado);
                    total3_5.setText(""+resultado);
                    break;
                case R.id.editText3_5_6:
                    valor6=Integer.parseInt(et3_5_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub3_5.setText(""+preResultado);
                    total3_5.setText(""+resultado);
                    break;
                case R.id.editText3_6_1:
                    valor1=Integer.parseInt(et3_6_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub3_6.setText(""+preResultado);
                    total3_6.setText(""+resultado);
                    break;
                case R.id.editText3_6_2:
                    valor2=Integer.parseInt(et3_6_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub3_6.setText(""+preResultado);
                    total3_6.setText(""+resultado);
                    break;
                case R.id.editText3_6_3:
                    valor3=Integer.parseInt(et3_6_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub3_6.setText(""+preResultado);
                    total3_6.setText(""+resultado);
                    break;
                case R.id.editText3_6_4:
                    valor4=Integer.parseInt(et3_6_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub3_6.setText(""+preResultado);
                    total3_6.setText(""+resultado);
                    break;
                case R.id.editText3_6_5:
                    valor5=Integer.parseInt(et3_6_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub3_6.setText(""+preResultado);
                    total3_6.setText(""+resultado);
                    break;
                case R.id.editText3_6_6:
                    valor6=Integer.parseInt(et3_6_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub3_6.setText(""+preResultado);
                    total3_6.setText(""+resultado);
                    break;
                case R.id.editText4_1_1:
                    valor1=Integer.parseInt(et4_1_1.getText().toString());
                    resultado=valor1;
                    sub4_1.setText(""+resultado);
                    total4_1.setText(""+resultado);
                    break;
                case R.id.editText4_1_2:
                    valor2=Integer.parseInt(et4_1_2.getText().toString());
                    resultado=resultado+valor2;
                    sub4_1.setText(""+resultado);
                    total4_1.setText(""+resultado);
                    break;
                case R.id.editText4_1_3:
                    valor3=Integer.parseInt(et4_1_3.getText().toString());
                    resultado=resultado+valor3;
                    sub4_1.setText(""+resultado);
                    total4_1.setText(""+resultado);
                    break;
                case R.id.editText4_1_4:
                    valor4=Integer.parseInt(et4_1_4.getText().toString());
                    resultado=resultado+valor4;
                    sub4_1.setText(""+resultado);
                    total4_1.setText(""+resultado);
                    break;
                case R.id.editText4_1_5:
                    valor5=Integer.parseInt(et4_1_5.getText().toString());
                    resultado=resultado+valor5;
                    sub4_1.setText(""+resultado);
                    total4_1.setText(""+resultado);
                    break;
                case R.id.editText4_1_6:
                    valor6=Integer.parseInt(et4_1_6.getText().toString());
                    resultado=resultado+valor6;
                    sub4_1.setText(""+resultado);
                    total4_1.setText(""+resultado);
                    break;
                case R.id.editText4_2_1:
                    valor1=Integer.parseInt(et4_2_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub4_2.setText(""+preResultado);
                    total4_2.setText(""+resultado);
                    break;
                case R.id.editText4_2_2:
                    valor2=Integer.parseInt(et4_2_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub4_2.setText(""+preResultado);
                    total4_2.setText(""+resultado);
                    break;
                case R.id.editText4_2_3:
                    valor3=Integer.parseInt(et4_2_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub4_2.setText(""+preResultado);
                    total4_2.setText(""+resultado);
                    break;
                case R.id.editText4_2_4:
                    valor4=Integer.parseInt(et4_2_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub4_2.setText(""+preResultado);
                    total4_2.setText(""+resultado);
                    break;
                case R.id.editText4_2_5:
                    valor5=Integer.parseInt(et4_2_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub4_2.setText(""+preResultado);
                    total4_2.setText(""+resultado);
                    break;
                case R.id.editText4_2_6:
                    valor6=Integer.parseInt(et4_2_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub4_2.setText(""+preResultado);
                    total4_2.setText(""+resultado);
                    break;
                case R.id.editText4_3_1:
                    valor1=Integer.parseInt(et4_3_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub4_3.setText(""+preResultado);
                    total4_3.setText(""+resultado);
                    break;
                case R.id.editText4_3_2:
                    valor2=Integer.parseInt(et4_3_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub4_3.setText(""+preResultado);
                    total4_3.setText(""+resultado);
                    break;
                case R.id.editText4_3_3:
                    valor3=Integer.parseInt(et4_3_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub4_3.setText(""+preResultado);
                    total4_3.setText(""+resultado);
                    break;
                case R.id.editText4_3_4:
                    valor4=Integer.parseInt(et4_3_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub4_3.setText(""+preResultado);
                    total4_3.setText(""+resultado);
                    break;
                case R.id.editText4_3_5:
                    valor5=Integer.parseInt(et4_3_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub4_3.setText(""+preResultado);
                    total4_3.setText(""+resultado);
                    break;
                case R.id.editText4_3_6:
                    valor6=Integer.parseInt(et4_3_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub4_3.setText(""+preResultado);
                    total4_3.setText(""+resultado);
                    break;
                case R.id.editText4_4_1:
                    valor1=Integer.parseInt(et4_4_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub4_4.setText(""+preResultado);
                    total4_4.setText(""+resultado);
                    break;
                case R.id.editText4_4_2:
                    valor2=Integer.parseInt(et4_4_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub4_4.setText(""+preResultado);
                    total4_4.setText(""+resultado);
                    break;
                case R.id.editText4_4_3:
                    valor3=Integer.parseInt(et4_4_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub4_4.setText(""+preResultado);
                    total4_4.setText(""+resultado);
                    break;
                case R.id.editText4_4_4:
                    valor4=Integer.parseInt(et4_4_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub4_4.setText(""+preResultado);
                    total4_4.setText(""+resultado);
                    break;
                case R.id.editText4_4_5:
                    valor5=Integer.parseInt(et4_4_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub4_4.setText(""+preResultado);
                    total4_4.setText(""+resultado);
                    break;
                case R.id.editText4_4_6:
                    valor6=Integer.parseInt(et4_4_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub4_4.setText(""+preResultado);
                    total4_4.setText(""+resultado);
                    break;
                case R.id.editText4_5_1:
                    valor1=Integer.parseInt(et4_5_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub4_5.setText(""+preResultado);
                    total4_5.setText(""+resultado);
                    break;
                case R.id.editText4_5_2:
                    valor2=Integer.parseInt(et4_5_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub4_5.setText(""+preResultado);
                    total4_5.setText(""+resultado);
                    break;
                case R.id.editText4_5_3:
                    valor3=Integer.parseInt(et4_5_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub4_5.setText(""+preResultado);
                    total4_5.setText(""+resultado);
                    break;
                case R.id.editText4_5_4:
                    valor4=Integer.parseInt(et4_5_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub4_5.setText(""+preResultado);
                    total4_5.setText(""+resultado);
                    break;
                case R.id.editText4_5_5:
                    valor5=Integer.parseInt(et4_5_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub4_5.setText(""+preResultado);
                    total4_5.setText(""+resultado);
                    break;
                case R.id.editText4_5_6:
                    valor6=Integer.parseInt(et4_5_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub4_5.setText(""+preResultado);
                    total4_5.setText(""+resultado);
                    break;
                case R.id.editText4_6_1:
                    valor1=Integer.parseInt(et4_6_1.getText().toString());
                    resultado=resultado+valor1;
                    preResultado=valor1;
                    sub4_6.setText(""+preResultado);
                    total4_6.setText(""+resultado);
                    break;
                case R.id.editText4_6_2:
                    valor2=Integer.parseInt(et4_6_2.getText().toString());
                    resultado=resultado+valor2;
                    preResultado=preResultado+valor2;
                    sub4_6.setText(""+preResultado);
                    total4_6.setText(""+resultado);
                    break;
                case R.id.editText4_6_3:
                    valor3=Integer.parseInt(et4_6_3.getText().toString());
                    resultado=resultado+valor3;
                    preResultado=preResultado+valor3;
                    sub4_6.setText(""+preResultado);
                    total4_6.setText(""+resultado);
                    break;
                case R.id.editText4_6_4:
                    valor4=Integer.parseInt(et4_6_4.getText().toString());
                    resultado=resultado+valor4;
                    preResultado=preResultado+valor4;
                    sub4_6.setText(""+preResultado);
                    total4_6.setText(""+resultado);
                    break;
                case R.id.editText4_6_5:
                    valor5=Integer.parseInt(et4_6_5.getText().toString());
                    resultado=resultado+valor5;
                    preResultado=preResultado+valor5;
                    sub4_6.setText(""+preResultado);
                    total4_6.setText(""+resultado);
                    break;
                case R.id.editText4_6_6:
                    valor6=Integer.parseInt(et4_6_6.getText().toString());
                    resultado=resultado+valor6;
                    preResultado=preResultado+valor6;
                    sub4_6.setText(""+preResultado);
                    total4_6.setText(""+resultado);
                    break;
            }
        }
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
            Toast.makeText(TableroPuntos.this,"estadistica",Toast.LENGTH_LONG).show();
        }else if(id==R.id.generarPdf){
            Toast.makeText(TableroPuntos.this,"pdf",Toast.LENGTH_LONG).show();
        }else if(id==R.id.enviar){
            Toast.makeText(TableroPuntos.this,"enviar",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
