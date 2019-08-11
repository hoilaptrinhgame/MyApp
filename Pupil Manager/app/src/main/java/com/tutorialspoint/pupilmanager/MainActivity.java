package com.tutorialspoint.pupilmanager;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    Frm_Introduce frm_introduce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "MainActivity Create", Toast.LENGTH_LONG).show();
    }

}
