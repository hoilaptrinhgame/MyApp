package com.tutorialspoint.pupilmanager;



import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

import java.util.ArrayList;

import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.List;

public class Frm_Main extends Fragment {

    private ListView obj;
    private DBHelper mydb;


    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(getActivity() , savedInstanceState.getString("name"), Toast.LENGTH_LONG).show();

    }
    void addFragmentToStack()
    {
        //Toast.makeText(getActivity() , "Start Working!", Toast.LENGTH_LONG).show();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Frm_Data frm = new Frm_Data();
        //Bundle args =  new Bundle();
        //args.putString("name","Frm_Main");
        //frm_main.setArguments(args);
        frm.mydb = mydb;
        fragmentTransaction.replace(android.R.id.content, frm);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        if(savedInstanceState != null)
        {

        }
        //Toast.makeText(getActivity() , name, Toast.LENGTH_LONG).show();
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to arraylist
        list.add("bí đao");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        //ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);

        View v= inflater.inflate(R.layout.frm_main, container, false);
        mydb = new DBHelper(getActivity() );
        ArrayList array_list = mydb.getAllCotacts();
        if(array_list.isEmpty())Toast.makeText(getActivity() , "Database is empty", Toast.LENGTH_LONG).show();
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, array_list);
        obj = v.findViewById(R.id.listView1);
        obj.setAdapter(arrayAdapter);
        Button button = (Button)v.findViewById(R.id.button2);

        button.setOnClickListener( new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragmentToStack();
            }});
        if(savedInstanceState == null)
        {
            //this.add(R.id.simple_fragment, newFragment).commit();

            //FragmentTransaction ft = getFragmentManager().beginTransaction();
            //ft.add(R.id.frm_introduce,this);
        }
        return v;

    }

}
