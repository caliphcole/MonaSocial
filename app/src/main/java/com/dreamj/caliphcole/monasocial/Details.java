package com.dreamj.caliphcole.monasocial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by CaliphCole on 01/21/2015.
 */
public class Details extends Fragment {

    public static final String ARG_CATEGORY_NUMBER = "details";

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.details, container, false);

        TextView text = (TextView)rootView.findViewById(R.id.details);

        text.setText("Developed By:DreamJInc\n\nContact Information: dreamjinc@gmail.com\n\nIf you want to advertise parties and events in our app" +
                ", contact us at the email above.");


        return rootView;
    }


    public static Details newInstance(int someInt, String someTitle) {
        Details dfragment = new Details();
        Bundle args = new Bundle();
        args.putInt(ARG_CATEGORY_NUMBER, someInt);
        dfragment.setArguments(args);
        return dfragment;
    }
}
