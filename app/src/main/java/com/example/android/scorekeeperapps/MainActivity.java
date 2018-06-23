package com.example.android.scorekeeperapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * This method is called when the button ember is pressed.
     */
    public void ember(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the button HeadButt is pressed.
     */
    public void headButt(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the button FireTail is pressed.
     */
    public void fireTail(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the button ElectraBuzz is pressed.
     */
    public void electraBuzz(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the button ThunderBolt is pressed.
     */
    public void thunderBolt(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the button ElectricPwr is pressed.
     */
    public void electricPwr(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView teamAScore = (TextView) findViewById(R.id.teamAscore);
        teamAScore.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView teamBScore = (TextView) findViewById(R.id.teamBscore);
        teamBScore.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Button Reset is pressed.
     */
    public void resetScore (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}