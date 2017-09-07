package com.abucay.abucayquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button compSci;
    Button infoTech;
    Button infoSys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compSci = (Button)findViewById(R.id.btnCS);
        infoTech = (Button) findViewById(R.id.btnIT);
        infoSys = (Button) findViewById(R.id.btnIS);
    }


    public void clickComputerScience(View view){
        Intent intent = new Intent(this, ComputerScience.class);
        startActivity(intent);
    }

    public void clickInformationTechnology(View view){
        Intent intent2 = new Intent(this, InformationTechnology.class);
        startActivity(intent2);
    }

    public void clickInformationSystems(View view){
        Intent intent3 = new Intent(this, InformationSystems.class);
        startActivity(intent3);
    }

}
