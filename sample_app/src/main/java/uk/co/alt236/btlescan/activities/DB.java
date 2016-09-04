package uk.co.alt236.btlescan.activities;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by PC on 31/8/59.
 */
public class DB {

    public static void insert(Context context, String uuid,String item_name,String distracne,String major ){
        DBHelper dbHelper = new DBHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        String sql = "INSERT INTO " + DBHelper.TABLE_NAME + "(" + DBHelper.COL_ITEM_NAME + ", " + DBHelper.COL_UUID + ", " + DBHelper.COL_DISTRANCE  +","+DBHelper.COL_MAJOR +  ") VALUES ('" + item_name + "', '" + uuid + "', '" + distracne + "','"+major + "')";
        db.execSQL(sql);

        db.close();
        dbHelper.close();

    }
}
