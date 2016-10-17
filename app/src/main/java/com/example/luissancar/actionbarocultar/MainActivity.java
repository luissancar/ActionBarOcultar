package com.example.luissancar.actionbarocultar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MenuItem itemUno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        itemUno=menu.findItem(R.id.uno);             /// obtenemos referencia al item uno
;       return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.uno) {
            Toast.makeText(this,"Uno",Toast.LENGTH_LONG).show();
        }
        if (id==R.id.dos) {
            Toast.makeText(this,"Dos",Toast.LENGTH_LONG).show();
        }
        if (id==R.id.tres) {
            Toast.makeText(this,"Tres", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }





    public void metodoCambiar(View v){

        if (getSupportActionBar().isShowing())
            getSupportActionBar().hide();
        else
            getSupportActionBar().show();


    }
    public void metodoCambiarItem(View v){



        if (itemUno.isVisible())
            itemUno.setVisible(false);
        else
            itemUno.setVisible(true);


    }
}
