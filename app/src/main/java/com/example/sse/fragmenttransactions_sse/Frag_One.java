package com.example.sse.fragmenttransactions_sse;


import android.app.Fragment;
import android.os.Bundle;
//import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_One extends Fragment {
    View view;

    public Frag_One() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.frag_one, container, false);
        return view;
    }

}
