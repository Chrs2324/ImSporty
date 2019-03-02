package com.example.workoutbuddy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class item_two extends Fragment {
    public static item_two newInstance() {
        item_two fragment = new item_two();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_two, container, false);
        Button button = (Button)view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.button2:
                        Intent intent = new Intent(getActivity(), ExcersizeResult.class);
                        startActivity(intent);
                        break;
                }
            }
        });
        return view;
    }
}