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
    TextView warning;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_two, container, false);
        Button button = (Button)view.findViewById(R.id.button2);
        text = view.findViewById(R.id.editText);
        text2 = view.findViewById(R.id.editText2);
        warning = view.findViewById(R.id.textView3);
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
                            weight = text.getText().toString();
                            double numHeight = Double.parseDouble(height);
                            double numWeight = Double.parseDouble(weight);
                            if (numHeight != 0)
                            {
                                warning.setVisibility(View.INVISIBLE);
                                Intent intent = new Intent(getActivity(), ExcersizeResult.class);
                                startActivity(intent);
                            }
                        }catch (NumberFormatException e)
                        {
                            warning.setVisibility(View.VISIBLE);
                            //checks to see if a valid double was entered
                        }
                        break;
                }
            }
        });
        return view;
    }
}