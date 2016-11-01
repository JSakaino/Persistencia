package pe.edu.ulima.persistencia;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.content.Context.MODE_PRIVATE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntervencionesOpenHelper dbHelper = new IntervencionesOpenHelper(this,null);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        //con el db hare operaciones a mi bd
        ContentValues values = new ContentValues();
        values.put("edad",20);
        values.put("nombre","Pepito");
        values.put("codigo","20142323");
        db.insert("alumno",null,values);

    }

    @Override
    protected void onResume() {
        super.onResume();
        //Leer data
        SharedPreferences sp = getSharedPreferences("datos", Context.MODE_PRIVATE);
        sp.getInt("NUMERO_PAG",0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Escribir data
        SharedPreferences sp = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("NUMERO_PAG",0);
        editor.commit();
    }
}
