package pe.edu.ulima.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sodm on 10/31/2016.
 */

public class IntervencionesOpenHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "data.db";
    private static final String SQL_CREACION = "CREATE TABLE alumno ("+
            "id INTEGER PRIMARY KEY AUTOINCREMENT,)"+
            "nombre TEXT" +
            "codigo TEXT" +
            "edad INTEGER)";
    private static final String SQL_DROP = "DROP TABLE alumno";

    public IntervencionesOpenHelper(Context context, SQLiteDatabase.CursorFactory factory) {
        super(context, DB_NAME, factory, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Cuando se desee crear la bd por primera vez
        db.execSQL(SQL_CREACION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP);
        onCreate(db);
    }
}
