package com.example.mediapp;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends ArrayAdapter<Items> {

    List<Items> itemsList;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View m = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);

        Items currentItem = itemsList.get(position);

        TextView itemName = m.findViewById(R.id.itemName);
        TextView itemPrice = m.findViewById(R.id.itemPrice);
        ImageView itemImage = m.findViewById(R.id.itemImage);
        ImageView addTo = m.findViewById(R.id.addd);

        itemName.setText(currentItem.getItemName());
        itemPrice.setText(currentItem.getItemPrice());
        itemImage.setImageResource(currentItem.getItemImage());

        addTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(getContext(), m , "This item will add to cart soon!", 2000).show();
            }
        });



        return m;
    }
}
