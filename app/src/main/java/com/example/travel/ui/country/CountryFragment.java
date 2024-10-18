package com.example.travel.ui.country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.travel.Adapters.CountryAdapter;
import com.example.travel.Models.CountryItem;
import com.example.travel.R;

import java.util.ArrayList;

public class CountryFragment extends Fragment {

    private ArrayList<CountryItem> countryItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_country, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CountryAdapter(countryItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        countryItems.add(new CountryItem(R.drawable.ritz, "The Rits-Carlton","0","0","The room was luxurious and comfortable, with everything working properly. Mineral water were given generously twice a day. Bathroom was luxurious with a very important feature, an automatic toilet."));
        countryItems.add(new CountryItem(R.drawable.king, "The King West","1","0","The room was clean, had very large windows overlooking the city, and was well-equipped with a cooktop, microwave, dishwasher, coffee maker with coffee and tea, and various utensils, cups, glasses and plates."));
        countryItems.add(new CountryItem(R.drawable.pool, "Radisson Blu","2","0","Very spacious bright room nice and clean , washroom is spacious too . Comfortable bed, hardwood floor, fridge. I was given a room on 3rd floor, face to bus stop, wish for the higher floor."));
        countryItems.add(new CountryItem(R.drawable.exterior, "Fairmont Royal York","3","0","Nice spacious room with a great view. The bed and linens were simply luxurious!! The mini bar and snacks on offer were expensive and that’s to be expected. The mini bar was well stocked!"));
        countryItems.add(new CountryItem(R.drawable.roof, "The Yorkville Royal","4","0","Super comfortable, quiet and spacious room with all the conveniences ones needs, very good view of area, a bar with great pub food, valet parking in an area of Toronto where parking is limited and more."));

        return root;
    }
}