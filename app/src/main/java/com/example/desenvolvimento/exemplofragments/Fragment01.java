package com.example.desenvolvimento.exemplofragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Desenvolvimento on 21/02/2019.
 */

public class Fragment01 extends Fragment {
    private static final String TAG = "Fragment01";
    private Button btnFragment01, btnFragment02, btnFragment03, btnSegundaActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_01_layout, container, false);
        Log.d(TAG, "onCreateView iniciado!");

        btnFragment01 = (Button) view.findViewById(R.id.btnFragment01);
        btnFragment02 = (Button) view.findViewById(R.id.btnFragment02);
        btnFragment03 = (Button) view.findViewById(R.id.btnFragment03);
        btnSegundaActivity = (Button) view.findViewById(R.id.btnSegundaActivity);

        btnFragment01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Indo para o fragment 01!", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnFragment02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Indo para o fragment 02!", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnFragment03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Indo para o fragment 03!", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        btnSegundaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Indo para a segunda activity!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SegundaActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
