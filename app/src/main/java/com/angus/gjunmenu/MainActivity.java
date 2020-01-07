package com.angus.gjunmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ConstraintLayout) findViewById(R.id.layout);
        registerForContextMenu(layout);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        String msg = "選取課程";
        Resources resources = getResources();
        switch (id){
            case R.id.item1:
                msg = msg + resources.getString(R.string.s1);
                break;
            case R.id.item2:
                msg = msg + resources.getString(R.string.s2);
                break;
            case R.id.item3:
                msg = msg + resources.getString(R.string.s3);
                break;
            case R.id.item4:
                msg = msg + resources.getString(R.string.s4);
                break;
            case R.id.item5:
                msg = msg + resources.getString(R.string.s5);
                break;
            case R.id.item6:
                msg = msg + resources.getString(R.string.s6);
                break;
        }
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        String msg = "選取課程";
        Resources resources = getResources();
        switch (id){
            case R.id.item1:
                msg = msg + resources.getString(R.string.s1);
                break;
            case R.id.item2:
                msg = msg + resources.getString(R.string.s2);
                break;
            case R.id.item3:
                msg = msg + resources.getString(R.string.s3);
                break;
            case R.id.item4:
                msg = msg + resources.getString(R.string.s4);
                break;
            case R.id.item5:
                msg = msg + resources.getString(R.string.s5);
                break;
            case R.id.item6:
                msg = msg + resources.getString(R.string.s6);
                break;
        }
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.context_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
