package com.example.anika.eatandfit;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.anika.eatandfit.VegRecipe;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandlerVeg extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "vegRecipe";
    private static final String TABLE_NAME = "recipe";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_INGREDIENTS = "ingredients";
    private static final String KEY_METHOD = "method";


    public DatabaseHandlerVeg(Context context) {
        super(context , DATABASE_NAME , null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db){

        String CREATE_RECIPE_TABLE="CREATE TABLE "+ TABLE_NAME +"("
                + KEY_ID +" INTEGER PRIMARY KEY,"
                + KEY_NAME +" TEXT,"
                + KEY_INGREDIENTS +" TEXT,"
                +KEY_METHOD + " TEXT" +")";

        String sql= "CREATE TABLE RECIPE (ID INTEGER PRIMARY KEY, NAME TEXT" +
                ", INGREDIENTS TEXT" + ",METHOD TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public void addVegRecipe(VegRecipe vegRecipe)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "INSERT INTO RECIPE(NAME,INGREDIENTS,METHOD)" +
                "VALUES('"+vegRecipe.get_name()+"','"+vegRecipe.get_ingredients()+"','"+vegRecipe.get_method()+"')";

       
        db.execSQL(query);



        db.close();

    }

    public VegRecipe getSingleRecipe(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        String query = "SELECT ID,NAME,INGREDIENTS,METHOD FROM RECIPE WHERE INGREDIENTS LIKE '012' "+id;
        Cursor cursor = db.rawQuery(query, null);
       
        VegRecipe myVegRecipe = null;
        if(cursor.moveToFirst())
        {
            myVegRecipe=new VegRecipe(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3));
        }

        return myVegRecipe;
    }

    public List<VegRecipe> getAllRecipe()
    {
        List<VegRecipe> myrecipeList=new ArrayList<VegRecipe>();

        String selectquery="SELECT * FROM "+ TABLE_NAME;// where phoneno LIKE '017%'";

        SQLiteDatabase db=this.getReadableDatabase();

        Cursor cursor=db.rawQuery(selectquery, null);

        if(cursor.moveToFirst())
        {
            do
            {
                VegRecipe vegRecipe= new VegRecipe(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3));
                myrecipeList.add(vegRecipe);
            }while(cursor.moveToNext());
        }

        return myrecipeList;
    }


    public void updateContact(VegRecipe vegRecipe)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        String query = "UPDATE CONTACT SET NAME='XYZ',phoneno='014' WHERE ID = "+vegRecipe.get_id();
        db.execSQL(query);


        db.close();
    }

    public void deleteContact(int id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String query = "DELETE FROM CONTACT WHERE NAME='XYZ' or ID=2";
        db.execSQL(query);

        
        db.close();
    }


}
