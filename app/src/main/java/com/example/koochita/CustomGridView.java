package com.example.koochita;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomGridView extends BaseAdapter {

    private final int[] gridViewImage;
    private final String[] gridViewText;
    private Context mContext;

    public CustomGridView(Context mContext, int[] gridViewImage, String[] gridViewText) {
        this.mContext = mContext;
        this.gridViewImage = gridViewImage;
        this.gridViewText = gridViewText;
    }

    @Override
    public int getCount() {
        return gridViewText.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridViewLayout;

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridViewLayout = new View(mContext);
            gridViewLayout = inflater.inflate(R.layout.raw_items, null);
            TextView textView = gridViewLayout.findViewById(R.id.GridText);
            ImageView imageView = gridViewLayout.findViewById(R.id.GridImage);
            textView.setText(gridViewText[position]);
            imageView.setImageResource(gridViewImage[position]);
        } else {
            gridViewLayout = (View) convertView;
        }
        return gridViewLayout;
    }
}

