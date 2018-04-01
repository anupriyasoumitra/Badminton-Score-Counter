package com.example.android.badmintonsinglecounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA = 0, teamB = 0;
    String m="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreA(0);
        displayScoreB(0);
    }

    //point 1 clicked A
    public void Aincr1(View view) {
        String a="Team A Wins",b="Team B Wins";
        if((m.compareTo(a)==0)||(m.compareTo(b)==0))
           teamA = teamA + 0;
        else
            teamA=teamA+1;
        displayScoreA(teamA);
    }

    //point 2 clicked A
    public void Aincr2(View view) {
        String a="Team A Wins",b="Team B Wins";
        if((m.compareTo(a)==0)||(m.compareTo(b)==0))
            teamA = teamA + 0;
        else
            teamA=teamA+2;
        displayScoreA(teamA);
    }

    //display for team A
    public void displayScoreA(int score) {
        TextView s = (TextView) findViewById(R.id.teamA_score);
        s.setText(String.valueOf(score));
    }

    //point 1 clicked B
    public void Bincr1(View view) {
        String a="Team A Wins",b="Team B Wins";
        if((m.compareTo(a)==0)||(m.compareTo(b)==0))
            teamB = teamB + 0;
        else
            teamB=teamB+1;
        displayScoreB(teamB);
    }

    //point 2 clicked B
    public void Bincr2(View view) {
        String a="Team A Wins",b="Team B Wins";
        if((m.compareTo(a)==0)||(m.compareTo(b)==0))
            teamB = teamB + 0;
        else
            teamB=teamB+2;
        displayScoreB(teamB);
    }

    //display for team B
    public void displayScoreB(int score) {
        TextView s = (TextView) findViewById(R.id.teamB_score);
        s.setText(String.valueOf(score));
    }

    //reset button
    public void clear(View view) {
        teamA = 0;
        teamB = 0;
        m = "Match Not Started";
        displayScoreA(teamA);
        displayScoreB(teamB);
        displayMessage(m);
    }

    //submit button
    public void done(View view) {
        if((teamA==0)&&(teamB==0))
            m="Match Not Started";
        else if((teamA>=20)&&(teamB>=20))
        {

            if((teamA!=21)||(teamB>=21)) {
                if (teamA == teamB)
                    m = "All Equal";
                else if (teamA > teamB)
                    m = "Team A Wins";
                else
                    m = "Team B Wins";
            }
            else{
                if(teamA==21)
                    m="Atleast one more point needed";
                if(teamB==21)
                    m="Atleast one more point needed";
            }

        }
        else if(teamA==teamB)
            m="AL Equal";
        else if(teamA>teamB)
            m="Team A Wins";
        else
            m="Team B Wins";
        displayMessage(m);

    }

    public void displayMessage(String message) {
        TextView r = (TextView) findViewById(R.id.result1);
        r.setText(message);

    }
}
