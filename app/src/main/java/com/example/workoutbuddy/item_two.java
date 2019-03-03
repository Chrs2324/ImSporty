package com.example.workoutbuddy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.widget.TableLayout;

public class item_two extends Fragment {
    public static item_two newInstance() {
        item_two fragment = new item_two();
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
    TextView warning2;
    TableLayout table1_1;
    TableLayout table1_2;
    TableLayout table1_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_two, container, false);
        Button button = (Button)view.findViewById(R.id.button2);
        text = view.findViewById(R.id.editText);
        text2 = view.findViewById(R.id.editText2);
        table1_1 = view.findViewById(R.id.lowWeightTable2);
        table1_2 = view.findViewById(R.id.medWeightTable2);
        table1_3 = view.findViewById(R.id.largeWeightTable2);
        warning2 = view.findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.button2:
                        try
                        {
                            height = text.getText().toString();
                            weight = text2.getText().toString();
                            int numHeight = Integer.parseInt(height);
                            int numWeight = Integer.parseInt(weight);
                            if (numHeight != 0)
                            {
                                warning2.setVisibility(View.INVISIBLE);
                                if (numWeight >= 0 && numWeight <= 100)
                                {
                                    table1_1.setVisibility(View.VISIBLE);
                                    table1_2.setVisibility(View.INVISIBLE);
                                    table1_3.setVisibility(View.INVISIBLE);
                                }
                                if (numWeight >= 101 && numWeight <= 200)
                                {
                                    table1_1.setVisibility(View.INVISIBLE);
                                    table1_2.setVisibility(View.VISIBLE);
                                    table1_3.setVisibility(View.INVISIBLE);
                                }
                                if (numWeight >= 201 && numWeight <= 999)
                                {
                                    table1_1.setVisibility(View.INVISIBLE);
                                    table1_2.setVisibility(View.INVISIBLE);
                                    table1_3.setVisibility(View.VISIBLE);
                                }
                                //Intent intent = new Intent(getActivity(), ExcersizeResult.class);
                                //startActivity(intent);
                            }
                        }catch (NumberFormatException e)
                        {
                            warning2.setVisibility(View.VISIBLE);
                            //checks to see if a valid double was entered
                        }
                }
            }
        });
        return view;
    }
}