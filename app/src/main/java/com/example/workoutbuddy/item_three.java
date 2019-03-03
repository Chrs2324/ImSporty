package com.example.workoutbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TableLayout;
import android.content.Context;
import java.util.*;


public class item_three extends Fragment {
    public static item_three newInstance() {
        item_three fragment = new item_three();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    EditText text;
    EditText text2;
    String height;
    String weight;
    TextView warning;
    double numHeight;
    double numWeight;
    TableLayout table;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_three, container, false);
        Button button = (Button)view.findViewById(R.id.button);
        text = view.findViewById(R.id.editText3);
        text2 = view.findViewById(R.id.editText4);
        warning = view.findViewById(R.id.textView4);
        table = view.findViewById(R.id.lowWeightTable);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.button:
                        try
                        {
                            height = text.getText().toString();
                            weight = text.getText().toString();
                            numHeight = Integer.parseInt(height);
                            numWeight = Integer.parseInt(weight);
                            if (numHeight != 0)
                            {
                                warning.setVisibility(View.INVISIBLE);
                                if (numWeight >= 0 && numWeight <= 100)
                                {
                                        table.setVisibility(View.VISIBLE);
                                }
                                else
                                {
                                    table.setVisibility(View.INVISIBLE);
                                }
                                //Intent intent = new Intent(getActivity(), ExcersizeResult.class);
                                //startActivity(intent);
                            }
                        }catch (NumberFormatException e)
                        {
                            warning.setVisibility(View.VISIBLE);
                            //checks to see if a valid double was entered
                        }
                }
            }
        });
        return view;
    }
}
