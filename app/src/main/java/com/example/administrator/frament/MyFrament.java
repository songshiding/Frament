package com.example.administrator.frament;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFrament extends Fragment implements View.OnClickListener {
    private TextView textView;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView=(TextView)getActivity().findViewById(R.id.tv);
        textView.setOnClickListener(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frament_layout,container);
        //return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }

    @Override
    public void onClick(View v) {
          switch (v.getId()){
              case R.id.tv:
                  textView.setText("fsdfdsf");
                  Log.i("1","sdfd");
                  break;
          }
    }
}
