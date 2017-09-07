package com.abucay.abucayquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationSystems extends AppCompatActivity {

    Button btn_Home;
    Button compSci;
    Button infoTech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_systems);

        btn_Home = (Button)findViewById(R.id.btnHome);
        infoTech = (Button) findViewById(R.id.btnIT);
        compSci = (Button) findViewById(R.id.btnCS);
    }

    public void clickHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickInformationTechnology(View view){
        Intent intent2 = new Intent(this, InformationTechnology.class);
        startActivity(intent2);
    }

    public void clickComputerScience(View view){
        Intent intent3 = new Intent(this, ComputerScience.class);
        startActivity(intent3);
    }
}
