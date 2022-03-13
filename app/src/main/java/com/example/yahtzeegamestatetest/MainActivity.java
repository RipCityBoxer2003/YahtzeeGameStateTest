package com.example.yahtzeegamestatetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean testRun;
    EditText ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ui = (EditText)findViewById(R.id.user_input) ;
        ui.setOnClickListener(this);

        Button button = findViewById(R.id.runTest);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        ui.setText("");

        YahtzeeGameState firstInstance = new YahtzeeGameState(2);
        YahtzeeGameState firstCopy = new YahtzeeGameState(firstInstance);

        firstCopy.setRound(1);
        firstCopy.setTurn(0);
        firstCopy.setScores(0,1, 10);

        ui.setText(firstInstance.toString());
    }
}