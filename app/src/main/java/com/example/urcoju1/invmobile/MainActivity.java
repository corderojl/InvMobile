package com.example.urcoju1.invmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner listTienda;
    Spinner listDep;
    Spinner listArea;
    String[] datosTienda = {"Desplegar..", "San Miguel", "La Molina", "Miraflores"};
    String[] datosDep = {"Desplegar..", "Almacen", "Stand", "Tienda"};
    String[] datosArea = {"Desplegar..", "Panaderia", "Confiteria", "Lacteaos"};
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listTienda = (Spinner) findViewById(R.id.sprTienda);
        ArrayAdapter<String> adapTienda = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosTienda);
        listTienda.setAdapter(adapTienda);

        listDep = (Spinner) findViewById(R.id.sprDepartamento);
        ArrayAdapter<String> adapDep = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosDep);
        listDep.setAdapter(adapDep);

        listArea = (Spinner) findViewById(R.id.sprArea);
        ArrayAdapter<String> adapArea = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosArea);
        listArea.setAdapter(adapArea);

        btn = (Button) findViewById(R.id.btnScan);
        btn.setOnClickListener(this);

       /* final Button boton = (Button) findViewById(R.id.btnScan);
        boton.setOnClickListener(new View.OnClickListener() {

        });*/
    }

    @Override
    public void onClick(View v) {
    /*    Intent nuevoform = new Intent(MainActivity.this, Inventario.class);
        startActivity(nuevoform);*/

        Intent i = new Intent(this, Inventario.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
