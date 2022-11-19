package com.example.mediapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class shop_frag extends Fragment {

    ArrayList<Items> items = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shop_frag, container, false);

        ImageView shop = view.findViewById(R.id.addToCart);

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move2 = new Intent(getActivity(), shopping_cart.class);
                startActivity(move2);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        Items item1 = new Items("Magnificent candles",R.drawable.candle1,"Price:$22");
        Items item2 = new Items("Aroma Naturals candle",R.drawable.candle2,"Price:$12");
        Items item3 = new Items("Chesapeake Bay balance candle",R.drawable.candle3,"Price:$13");
        Items item4 = new Items("Chakra Candle Box Set of 7",R.drawable.set,"Price:$36");
        Items item5 = new Items("Meditation White Noise Sound Machine",R.drawable.mch,"Price:$25");
        Items item6 = new Items("Meditation Floor 22x22 Inch",R.drawable.floor,"Price:$26");
        Items item7 = new Items("Alexia D371-E-066 Meditation Seat",R.drawable.seat,"Price:$360");
        Items item8 = new Items("Florensi Meditation Bench",R.drawable.seat1,"Price:$70");
        Items item9 = new Items("Sensate Relaxation Device",R.drawable.device,"Price:$300");
        Items item10 = new Items("HIGOGOGO Floor 20x20x5.5",R.drawable.floor1,"Price:$40");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);

        ListView itemsList = view.findViewById(R.id.listview);

        ItemAdapter noor = new ItemAdapter(getActivity(),0,items);
        itemsList.setAdapter(noor);

        itemsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Items thisItem = items.get(i);

                Intent click = new Intent(getActivity(),Details_Activity.class);

                click.putExtra("clk",thisItem);
                startActivity(click);
            }
        });

        return view;
    }
}