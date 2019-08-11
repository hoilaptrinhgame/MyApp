package com.tutorialspoint.pupilmanager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Debug;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.util.Log;
import android.widget.Toast;

public class Frm_Introduce extends Fragment {

    int iStackLevel;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.frm_introduce, container, false);
        Button button = (Button)view.findViewById(R.id.button);

        button.setOnClickListener( new  OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragmentToStack();
            }});
        if(savedInstanceState == null)
        {
            //this.add(R.id.simple_fragment, newFragment).commit();
            //this.addFragmentToStack();
            //FragmentTransaction ft = getFragmentManager().beginTransaction();
            //ft.add(R.id.frm_introduce,this);
        }
        return view;
    }
    void addFragmentToStack()
    {
        //Toast.makeText(getActivity() , "Start Working!", Toast.LENGTH_LONG).show();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Frm_Main frm_main = new Frm_Main();
        Bundle args =  new Bundle();
        args.putString("name","Frm_Main");
        frm_main.name = "Frm_Main";
        frm_main.setArguments(args);
        fragmentTransaction.replace(android.R.id.content, frm_main);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name", "Frm_Main onSaveInstanceState");
        Toast.makeText(getActivity() , "onSaveInstanceState!", Toast.LENGTH_LONG).show();
    }

}
