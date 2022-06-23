package com.example.telegramapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextClock;
import android.widget.TextView;

public class ContryAdepter extends BaseAdapter {
    Context context;
    String[] contry;
    public ContryAdepter(Context context, String[] contry) {
        this.context=context;
        this.contry=contry;

    }

    @Override
    public int getCount() {
        return contry.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(context).inflate(R.layout.contry,null);
        TextView text=(TextView) view.findViewById(R.id.textview);
        text.setText(contry[position]);
        return view;
    }
}
