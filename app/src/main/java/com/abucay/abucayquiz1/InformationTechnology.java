package com.abucay.abucayquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationTechnology extends AppCompatActivity {

    Button btn_Home;
    Button compSci;
    Button infoSys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_technology);

        btn_Home = (Button)findViewById(R.id.btnHome);
        compSci = (Button) findViewById(R.id.btnCS);
        infoSys = (Button) findViewById(R.id.btnIS);
    }

    public void clickHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickComputerScience(View view){
        Intent intent2 = new Intent(this, ComputerScience.class);
        startActivity(intent2);
    }

    public void clickInformationSystems(View view){
        Intent intent3 = new Intent(this, InformationSystems.class);
        startActivity(intent3);
    }
}
