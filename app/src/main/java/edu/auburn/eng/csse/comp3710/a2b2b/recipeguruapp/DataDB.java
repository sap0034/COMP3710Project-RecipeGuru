package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.IOException;
/**
 * Created by sap0034 on 4/20/2018.
 */

public class DataDB {
    DatabaseConnection eventoConexion;
    String name;

    public String getNameDB(Context context){
        eventoConexion = new DatabaseConnection(context);

        try {
            eventoConexion.createDataBase();
        } catch (IOException e) {
        }

        if(eventoConexion.checkDataBase()){
            eventoConexion.openDataBase();
            SQLiteDatabase db = eventoConexion.getWritableDatabase();
            Cursor cursor = db.rawQuery("SELECT name FROM exampleTable", null);
            while(cursor.moveToNext()){
                name = cursor.getString(0);
            }

            eventoConexion.close();

            return name;
        }else{
            return "ERROR";
        }
    }

}

