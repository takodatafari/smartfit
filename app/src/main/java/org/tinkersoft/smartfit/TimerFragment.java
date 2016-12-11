package org.tinkersoft.smartfit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by cortell on 12/8/2016.
 */

public class TimerFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //set Fragment layout
        View view = inflater.inflate(R.layout.fragment_timer, container, false);
        //getActivity().findViewByID(R.id.);

        //returning our layout file
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        //getActivity().setTitle(");
    }

    public void incrementCounter(){
        Log.d("TAG", "Increment Counter has been initiated");
       // TextView text = (TextView) getActivity().findViewById(R.id.timer_text);
       // text.setText("9999");



    }

    @Override
    public void onClick(View v) {
        //do what you want to do when button is clicked
        switch (v.getId()) {
          //  case R.id.:
           //     break;
         //   case R.id.:
            //    break;
        }

    }
}
