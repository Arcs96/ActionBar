package com.example.usuario.menuopciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Item 1 Seleccionado",Toast.LENGTH_LONG).show();
                return true;
            case R.id.subItem1:
                Toast.makeText(getApplicationContext(),"SubItem1 Seleccionado",Toast.LENGTH_LONG).show();
                return true;
            case  R.id.subItem2:
                Toast.makeText(getApplicationContext(),"SubItem2 Seleccionado",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Item 2 Seleccionado",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Item 3 Seleccionado",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_buscar:
                Toast.makeText(getApplicationContext(),"Acción buscar Seleccionado",Toast.LENGTH_LONG).show();
            case R.id.action_nuevo:
                Toast.makeText(getApplicationContext(),"Acción nuevo Seleccionado",Toast.LENGTH_LONG).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
