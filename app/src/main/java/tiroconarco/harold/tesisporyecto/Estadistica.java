package tiroconarco.harold.tesisporyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Estadistica extends AppCompatActivity {

    //BarChart grafica;
   // BarData barData;
    //BarDataSet barDataSet;
    //ArrayList barEntries;
    PieChart grafica;
    ArrayList<Integer> colores=new ArrayList<>();
    ArrayList<PieEntry> valorY=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadistica);
        grafica=(PieChart) findViewById(R.id.graficaTorta);
        crearGraficoPastel();

    }

    private void crearGraficoPastel() {
        grafica.setHoleRadius(50f);
        grafica.setRotationEnabled(true);
        grafica.animateXY(1500,1500);

        valorY.add(new PieEntry(5,"1",0));
        valorY.add(new PieEntry(5,"2",1));
        valorY.add(new PieEntry(5,"3",2));
        valorY.add(new PieEntry(5,"4",3));
        valorY.add(new PieEntry(6,"5",4));
        valorY.add(new PieEntry(9,"6",5));
        valorY.add(new PieEntry(10,"7",6));
        valorY.add(new PieEntry(3,"8",7));
        valorY.add(new PieEntry(2,"9",8));
        valorY.add(new PieEntry(4,"10",9));
        valorY.add(new PieEntry(8,"X",10));
        valorY.add(new PieEntry(38,"M",11));

        colores.add(getResources().getColor(R.color.blanco1));
        colores.add(getResources().getColor(R.color.blanco2));
        colores.add(getResources().getColor(R.color.negro3));
        colores.add(getResources().getColor(R.color.negro4));
        colores.add(getResources().getColor(R.color.celeste5));
        colores.add(getResources().getColor(R.color.celeste6));
        colores.add(getResources().getColor(R.color.rojo7));
        colores.add(getResources().getColor(R.color.rojo8));
        colores.add(getResources().getColor(R.color.amarrillo9));
        colores.add(getResources().getColor(R.color.amarrillo10));
        colores.add(getResources().getColor(R.color.amarrilloX));
        colores.add(getResources().getColor(R.color.blancoM));


        PieDataSet pieDataSet=new PieDataSet(valorY,"Resultados");
        pieDataSet.setSliceSpace(3f);
        pieDataSet.setValueTextColor(Color.CYAN);
        pieDataSet.setColors(colores);

        PieData pieData=new PieData(pieDataSet);
        grafica.setData(pieData);
        grafica.highlightValue(null);
        grafica.invalidate();
        Description description=new Description();
        description.setText("Tabla de torta");
        grafica.setDescription(description);
    }

    /*

    private void crearGraficoPastel() {
        colores.add(getResources().getColor(R.color.amarrilloX));
        colores.add(getResources().getColor(R.color.amarrillo10));
        colores.add(getResources().getColor(R.color.amarrillo9));
        colores.add(getResources().getColor(R.color.rojo8));
        colores.add(getResources().getColor(R.color.rojo7));
        colores.add(getResources().getColor(R.color.celeste6));
        Description description=new Description();
        description.setText("Tabla de torta");
        grafica.setDescription(description);

        ArrayList<PieEntry> pieEntries=new ArrayList<>();
        pieEntries.add(new PieEntry(2,3));
        pieEntries.add(new PieEntry(3,4));
        pieEntries.add(new PieEntry(4,5));
        pieEntries.add(new PieEntry(5,2));
        pieEntries.add(new PieEntry(6,3));
        pieEntries.add(new PieEntry(7,1));

        PieDataSet pieDataSet=new PieDataSet(pieEntries,"descripcion texto");
        pieDataSet.setColors(colores);
        pieDataSet.setSliceSpace(5f);
        PieData pieData=new PieData(pieDataSet);

        grafica.setData(pieData);
    }
    */

}
