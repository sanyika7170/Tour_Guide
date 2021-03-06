package com.example.sanyi.tour_guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {

    final ArrayList<Sight>sights=new ArrayList<Sight>();
    final ArrayList<Sight>properSight=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Hotel1Name),R.drawable.hotel1,10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Hotel2Name),1000,500));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Hotel3Name),R.drawable.hotel2,100,5000));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Hotel4Name),R.drawable.hotel3,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Hotel5Name),R.drawable.hotel4,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Hotel6Name),R.drawable.hotel4,1000,5000));


        for (Sight sight:sights) {
            if(sight.getCity().equals(Constants.CITY)){
                properSight.add(sight);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.sight_list,container,false);



        SightAdapter sightAdapter=new SightAdapter(getActivity(),properSight);

        ListView listView=(ListView) rootView.findViewById(R.id.listMap);

        listView.setAdapter(sightAdapter);

        return rootView;

    }

}
