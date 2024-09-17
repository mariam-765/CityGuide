package com.javaapp.cityguide2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends ListActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] attraction={"Art Institute of Chicago", "Magnificent Mile",
                "Willis Tower", "Navy Pier", "Water Tower"};
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, attraction));
      //  CustomAdapter customAdapter= new CustomAdapter(this, R.drawable.ic_launcher_chicago,attraction);
  //      setListAdapter(customAdapter);
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position)
         {
            case 0:
                startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("https://artic.edu")));
                break;
            case 1:
                startActivity(new Intent(getIntent().ACTION_VIEW, Uri.parse("https://www.themagnificentmile.com/")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Willis.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Pier.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Water.class));
                break;
        }
    }
}