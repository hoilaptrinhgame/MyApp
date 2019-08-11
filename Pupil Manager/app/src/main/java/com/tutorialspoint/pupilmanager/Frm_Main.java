package com.tutorialspoint.pupilmanager;



import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

import java.util.ArrayList;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.List;

public class Frm_Main extends Fragment {
    ListView obj;
    public String name="null";
    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(getActivity() , savedInstanceState.getString("name"), Toast.LENGTH_LONG).show();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        if(savedInstanceState != null)
        {

        }
        Toast.makeText(getActivity() , name, Toast.LENGTH_LONG).show();
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to arraylist
        list.add("bí đao");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        //ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);

        View v= inflater.inflate(R.layout.frm_main, container, false);
        ArrayAdapter arrayAdapter = new ArrayAdapter (getActivity(),android.R.layout.simple_list_item_1,list);

        obj = (ListView)v.findViewById(R.id.listView1);
        obj.setAdapter(arrayAdapter);
        return v;

    }

}
