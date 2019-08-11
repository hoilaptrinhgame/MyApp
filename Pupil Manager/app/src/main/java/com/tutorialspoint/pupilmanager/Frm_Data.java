package com.tutorialspoint.pupilmanager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class Frm_Data extends Fragment {
    public DBHelper mydb;
    EditText name ;
    TextView age;
    TextView sex;
    TextView grade;
    TextView phone;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.frm_data, container, false);
        Button button = v.findViewById(R.id.button3);
         name=  v.findViewById(R.id.txt_name);
        button.setOnClickListener( new  View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( name == null)
                    Toast.makeText(getActivity(), "name is null",
                            Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity(), "name is Ok",
                            Toast.LENGTH_SHORT).show();

                //age = (TextView) v.findViewById(R.id.editText_);
                //sex = (TextView) v.findViewById(R.id.editText_);
               /* grade = v.findViewById(R.id.editText_class);
                phone = v.findViewById(R.id.editText_phone);
                mydb.insertContact((String)name.getText() ,6,"male",(String)grade.getText(),(String)phone.getText());
                Toast.makeText(getActivity(), "done",
                        Toast.LENGTH_SHORT).show();*/
            }});
        if(savedInstanceState == null)
        {
            //this.add(R.id.simple_fragment, newFragment).commit();
            //this.addFragmentToStack();
            //FragmentTransaction ft = getFragmentManager().beginTransaction();
            //ft.add(R.id.frm_introduce,this);
        }
        return v;
    }
}
