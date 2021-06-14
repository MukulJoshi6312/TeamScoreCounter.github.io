package com.mukul.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    private TextView team1,team2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamAScore(0);
        displayTeamBScore(0);

        team1 = findViewById(R.id.team1);
        team2 = findViewById(R.id.team2);

        team1.setText(getIntent().getStringExtra("team1"));
        team2.setText(getIntent().getStringExtra("team2"));
    }


    public void score2(View view) {
        scoreTeamA = scoreTeamA +2;
        displayTeamAScore(scoreTeamA);

    }
    public void score3(View view) {
        scoreTeamA = scoreTeamA +3;
        displayTeamAScore(scoreTeamA);
    }
    public void freeThrow(View view) {
        scoreTeamA = scoreTeamA+1;
        displayTeamAScore(scoreTeamA);
    }

    private void displayTeamAScore(int i) {
        TextView score = (TextView) findViewById(R.id.team_a_score);
        score.setText(String.valueOf(i));

    }


    public void score2TeamB(View view) {
        scoreTeamB = scoreTeamB+2;
        displayTeamBScore(scoreTeamB);

    }

    public void score3TeamB(View view) {
        scoreTeamB = scoreTeamB+3;
        displayTeamBScore(scoreTeamB);
    }

    public void freeThrowTeamB(View view) {
        scoreTeamB = scoreTeamB+1;
        displayTeamBScore(scoreTeamB);
    }

    private void displayTeamBScore(int i){
        TextView score = (TextView)findViewById(R.id.team_b_score);
        score.setText(String.valueOf(i));

    }

    public void resetButton(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayTeamAScore(0);
        displayTeamBScore(0);
    }
}