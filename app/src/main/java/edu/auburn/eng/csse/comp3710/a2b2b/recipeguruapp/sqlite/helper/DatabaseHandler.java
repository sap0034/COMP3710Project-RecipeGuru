package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp.sqlite.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sap00 on 4/27/2018.
 */

public class DatabaseHandler extends SQLiteOpenHelper{
    //Database Version
    private static final int DATABASE_VERSION = 1;

    //Database Name
    private static final String DATABASE_NAME = "RecipeGuru.db";

    //database tables
    private static final String ACCOUNT_TABLE = "tbl_account";
    private static final String RECIPE_TABLE = "tbl_recipe";
    private static final String RECIPEIMAGE_TABLE = "tbl_recipeimage";
    private static final String RECIPEINSTRUCTIONSTEP_TABLE = "tbl_recipeinstructionstep";
    private static final String INGREDIENT_TABLE = "tbl_ingredient";
    private static final String MEASUREMENT_TABLE = "tbl_measurement";

    //database fields
    //Account Column Names
    private static final String COLUMN_ACCOUNTID = "AccountID";
    private static final String COLUMN_FIRSTNAME = "FirstName";
    private static final String COLUMN_LASTNAME = "LastName";
    private static final String COLUMN_EMAILADDRESS = "EmailAddress";
    private static final String COLUMN_ACCOUNTCREATEDDATETIME = "AccountCreatedDatetime";
    private static final String COLUMN_ISARCHIVED = "IsArchived";
    private static final String COLUMN_PASSWORD = "Password";

     // Recipe Column Names
     private static final String COLUMN_RECIPEID = "RecipeID";
    private static final String COLUMN_RECIPENAME = "RecipeName";
    private static final String COLUMN_COOKINGTIME = "CookingTime";
    private static final String COLUMN_PREPTIME = "PrepTime";
    private static final String COLUMN_TOTALTIME = "TotalTime";
    private static final String COLUMN_SERVINGS = "Servings";
    private static final String COLUMN_ISFAVORITE = "IsFavorite";

    //RecipeImage Column Names
    private static final String COLUMN_RECIPEIMAGEID = "RecipeImageID";
    private static final String COLUMN_RECIPEIMAGEPATH = "RecipeImagePath";

    //RecipeInstructionSteps Column Names
    private static final String COLUMN_RECIPEINSTRUCTIONSTEPID = "RecipeInstructionStepID";
    private static final String COLUMN_INSTRUCTIONSTEPTEXT = "InstructionStepText";
    private static final String COLUMN_STEPNUMBERORDER = "StepNumberOrder";

    //Ingredient Column Names
    private static final String COLUMN_INGREDIENTID = "IngredientID";
    private static final String COLUMN_INGREDIENTTEXT = "IngredientText";
    private static final String COLUMN_INGREDIENTAMOUNT = "IngredientAmount";

    //Measurement Column Names
    private static final String COLUMN_MEASUREMENTID = "MeasurementID";
    private static final String COLUMN_MEASUREMENTNAME = "MeasurementName";

    //Table Create Statements
    //Create Account Table
    private static final String CREATE_TABLE_ACCOUNT = "CREATE TABLE " + ACCOUNT_TABLE + "(" + COLUMN_ACCOUNTID + " INTEGER PRIMARY KEY," + COLUMN_FIRSTNAME + " TEXT," +
            COLUMN_LASTNAME + " TEXT," + COLUMN_EMAILADDRESS + " TEXT," + COLUMN_ACCOUNTCREATEDDATETIME + " TEXT," + COLUMN_ISARCHIVED + " INTEGER," + COLUMN_PASSWORD + " TEXT" + ")";

    //CREATE RECIPE TABLE
    private  static final String CREATE_TABLE_RECIPE = "CREATE TABLE" + RECIPE_TABLE + "(" + COLUMN_RECIPEID + "  INTEGER PRIMARY KEY," + COLUMN_RECIPENAME + " TEXT," + COLUMN_COOKINGTIME + " TEXT," + COLUMN_PREPTIME + " TEXT,"
            + COLUMN_TOTALTIME + " TEXT," + COLUMN_SERVINGS + " INTEGER," + COLUMN_ISFAVORITE + " INTEGER," + COLUMN_ACCOUNTID + "  INTEGER FOREIGN KEY"  + ")";


    //CREATE RECIPE IMAGE TABLE
    private  static final String CREATE_TABLE_RECIPEIMAGE = "CREATE TABLE" + RECIPEIMAGE_TABLE + "(" + COLUMN_RECIPEIMAGEID + "  INTEGER PRIMARY KEY," + COLUMN_RECIPEIMAGEPATH + " TEXT,"
            + COLUMN_ISARCHIVED + " INTEGER," + COLUMN_RECIPEID + "  INTEGER FOREIGN KEY"  + ")";


    //CREATE RECIPE INSTRUCTION STEP TABLE
    private  static final String CREATE_TABLE_RECIPEINSTRUCTIONSTEP = "CREATE TABLE" + RECIPEINSTRUCTIONSTEP_TABLE + "(" + COLUMN_RECIPEINSTRUCTIONSTEPID + "  INTEGER PRIMARY KEY," + COLUMN_INSTRUCTIONSTEPTEXT + " TEXT,"
            + COLUMN_STEPNUMBERORDER + " INTEGER," + COLUMN_ISARCHIVED + " INTEGER," + COLUMN_RECIPEID + "  INTEGER FOREIGN KEY"  + ")";

    //CREATE RECIPE INGREDIENT TABLE
    private  static final String CREATE_TABLE_INGREDIENT = "CREATE TABLE" + INGREDIENT_TABLE + "(" + COLUMN_INGREDIENTID + "  INTEGER PRIMARY KEY," + COLUMN_INGREDIENTTEXT + " TEXT,"
            + COLUMN_INGREDIENTAMOUNT + " INTEGER," + COLUMN_ISARCHIVED + " INTEGER," + COLUMN_RECIPEID + "  INTEGER FOREIGN KEY," + COLUMN_MEASUREMENTID + "  INTEGER FOREIGN KEY"  + ")";


    //CREATE MEASUREMENT TABLE
    private static final String CREATE_MEASUREMENT_TABLE =  "CREATE TABLE" + MEASUREMENT_TABLE + "(" + COLUMN_MEASUREMENTID + "  INTEGER PRIMARY KEY," + COLUMN_MEASUREMENTNAME + " TEXT"
            + ")";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_ACCOUNT);
        db.execSQL(CREATE_TABLE_RECIPE);
        db.execSQL(CREATE_TABLE_RECIPEINSTRUCTIONSTEP);
        db.execSQL(CREATE_TABLE_RECIPEIMAGE);
        db.execSQL(CREATE_MEASUREMENT_TABLE);
        db.execSQL(CREATE_TABLE_INGREDIENT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + ACCOUNT_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + RECIPE_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + RECIPEINSTRUCTIONSTEP_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + RECIPEIMAGE_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + MEASUREMENT_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + INGREDIENT_TABLE);

        //CREATE NEW TABLES
        onCreate(db);
    }






}
