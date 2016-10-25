package ly.generalassemb.drewmahrt.shoppinglistver2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;
import java.util.List;

import ly.generalassemb.drewmahrt.shoppinglistver2.setup.DBAssetHelper;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        //Ignore the two lines below, they are for setup
        DBAssetHelper dbSetup = new DBAssetHelper(MainActivity.this);
        dbSetup.getReadableDatabase();

        SQLiteDatabase db = dbSetup.getReadableDatabase();

        Cursor cursor = db.query("SHOPPING_LIST",
                null,
                null,
                null,
                null,
                null,
                null);

        List<String> groceryList = new ArrayList<>();

        if(cursor.moveToFirst()){
            while (!cursor.isAfterLast()){
                String productName = cursor.getString(cursor.getColumnIndex("ITEM_NAME"));
                groceryList.add(productName);

                cursor.moveToNext();
            }
        }

        GroceryAdapter groceryAdapter = new GroceryAdapter(groceryList);
        mRecyclerView.setAdapter(groceryAdapter);

    }
}
