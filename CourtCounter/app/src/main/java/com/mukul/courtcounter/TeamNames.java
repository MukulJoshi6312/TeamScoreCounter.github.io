package com.mukul.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TeamNames extends AppCompatActivity {

    private EditText et_team1,et_team2;
    private Button startCounting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_names);

        et_team1 = findViewById(R.id.et_team1);
        et_team2 = findViewById(R.id.et_team2);
        startCounting = findViewById(R.id.startCounting);

        startCounting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t1 = et_team1.getText().toString();
                String t2 = et_team2.getText().toString();

                if (t1.isEmpty()){
                    et_team1.setError("Please Enter the team name!");
                    et_team1.requestFocus();
                    return;
                }if (t2.isEmpty()){
                    et_team2.setError("Please Enter the team name!");
                    et_team2.requestFocus();
                    return;
                }

                Intent intent = new Intent(TeamNames.this,MainActivity.class);
                intent.putExtra("team1",t1);
                intent.putExtra("team2",t2);
                startActivity(intent);

            }
        });


    }
}