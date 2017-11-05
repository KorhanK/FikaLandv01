package com.wortyhgame.korhank.fikalandv01.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button educationButton;
    Button languageButton;
    Button jobButton;
    Button houseButton;
    Button socializeButton;
    Button otherButton;
    Button eatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        educationButton = (Button)findViewById(R.id.educationButton);
        languageButton = (Button) findViewById(R.id.languageButton);
        jobButton = (Button) findViewById(R.id.jobButton);
        houseButton = (Button) findViewById(R.id.housingButton);
        socializeButton = (Button) findViewById(R.id.socializeButton);
        otherButton = (Button) findViewById(R.id.otherButton);
        eatButton = (Button) findViewById(R.id.eatButton);


        Player player = new Player();
        Controller controller = new Controller();

        player.setMoney(1717);


    }

    public void educationClick(View view){



    }


}
