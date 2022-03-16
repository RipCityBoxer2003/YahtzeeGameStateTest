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

        firstInstance.setRound(5);
        ui.setText(ui.getText().append("Round number set to " + firstInstance.getRound() + "\n"));
        firstInstance.setTurn(1);
        ui.setText(ui.getText().append("turn number set to " + firstInstance.getTurn() + "\n"));
        firstInstance.setScores(0,1, 10);
        int[] player0Scores = firstInstance.getScores(0);
        ui.setText(ui.getText().append("Score of row 1 player 0 number set to " + player0Scores[1] + "\n"));
        firstInstance.setSelected(firstInstance.getDice(3),0);
        ui.setText(ui.getText().append("set the dice in added dice 3 to selected arraylist\n"));
        firstInstance.setDiceVal(firstInstance.getDice(3),5);
        ui.setText(ui.getText().append("set Dice at idx 3 to 5\n"));
        firstInstance.swapKeepValue(firstInstance.getDice(3),true);
        ui.setText(ui.getText().append("swapped dice at idx 3 to keep\n"));
        firstInstance.setRollNum(5);
        ui.setText(ui.getText().append("roll number set to " + firstInstance.getRollNum() + "\n"));

        YahtzeeGameState secondInstance = new YahtzeeGameState(2);
        YahtzeeGameState secondCopy = new YahtzeeGameState(secondInstance);

        ui.setText(ui.getText().append( firstCopy.equals(secondCopy) +"\n"));
        ui.setText(ui.getText().append(firstCopy + "\n"));
        ui.setText(ui.getText().append(secondCopy + "\n"));
        ;
    }
}