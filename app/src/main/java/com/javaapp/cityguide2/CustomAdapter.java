package com.javaapp.cityguide2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final int resource;

    public CustomAdapter(@NonNull Context context, int resource, String[] attractions) {
        super(context, R.layout.activity_main, R.id.travel, attractions);
        this.context=context;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        View view=super.getView(position, convertView, parent);
        ImageView logoImg=view.findViewById(R.id.travel);
        logoImg.setImageResource(resource);
        return view;
    }
}
