package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import android.database.sqlite.SQLiteOpenHelper;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by sap0034 on 4/20/2018.
 */

public class DatabaseConnection extends SQLiteOpenHelper {
   private static String DB_PATH = "/data/data/edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp/databases/";
   private static String DB_NAME = "recipeguru_db.sqlite";
   private SQLiteDatabase myDataBase;
   private Context myContext = null;

   @SuppressLint("NewApi")
   public DatabaseConnection(Context context) {
      super(context, DB_NAME, null, 1);
      this.myContext = context;
   }


   public void createDataBase() throws IOException{
      boolean dbExist = checkDataBase();
      if (dbExist){

      }else {
         this.getReadableDatabase();
         try {
            copyDataBase();
         }catch (IOException e) {
            throw new Error("Error copying database.");
         }
      }
   }

   public void copyDataBase() throws IOException{
      //open local database as input stream
      InputStream myInput = myContext.getAssets().open(DB_NAME);

      //path to just created empty db
      String outFileName = DB_PATH + DB_NAME;

      //open empty db as the output file stream
      OutputStream myOutput = new FileOutputStream(outFileName);

      //tranfer bytes from the inputfile to the output file
      byte[] buffer = new byte[1024];
      int length;
      while((length = myInput.read(buffer)) > 0) {
         myOutput.write(buffer, 0, length);
      }
      //close the stream
      myOutput.flush();
      myOutput.close();
      myInput.close();
   }

   public boolean checkDataBase() {
      SQLiteDatabase checkDB = null;
      try {
         String myPath = DB_PATH + DB_NAME;
         checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
      } catch (SQLException e) {

      }
      if(checkDB != null) {
         checkDB.close();
      }
      return checkDB != null ? true : false;
   }

public void openDataBase() throws SQLException {
      //open the db
   String myPath = DB_PATH + DB_NAME;
   myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
}

   @Override
   public synchronized void close() {
      if(myDataBase != null)
         myDataBase.close();
      super.close();
   }

   public void ejecutar(){

   }

   @Override
   public void onCreate(SQLiteDatabase db) {
      // TODO Auto-generated method stub
   }

   @Override
   public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
      // TODO Auto-generated method stub

   }
}
