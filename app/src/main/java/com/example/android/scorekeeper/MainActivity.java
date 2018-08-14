package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreAway = 0;
    int numberOfOuts = 0;
    int numberOfOutsb = 0;
    int numberOfStrikes = 0;
    int numberOfStrikesb = 0;
    int numberOfBalls = 0;
    int numberOfBallsb = 0;
    int innings = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add1pointhome(View v) {
        scoreHome = scoreHome + 1;
        displayForHome(scoreHome);
    }

    /**
     * Displays the given score for Home Team.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }


    public void add1inning(View v) {
        innings = innings + 1;
        displayForInning(innings);
    }

    /**
     * Displays the given Innings.
     */
    public void displayForInning(int score) {
        TextView scoreView = (TextView) findViewById(R.id.inning);
        scoreView.setText(String.valueOf(score));
    }

    public void add1pointaway(View v) {
        scoreAway = scoreAway + 1;
        displayForAway(scoreAway);
    }

    /**
     * Displays the given score for Away Team.
     */
    public void displayForAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add1out(View v) {
        numberOfOuts = numberOfOuts + 1;
        if (numberOfOuts > 2) {
            displayForOuts(numberOfOuts = 0);
            displayForStrikes(numberOfStrikes = 0);
            displayForBalls(numberOfBalls = 0);
        }
        displayForOuts(numberOfOuts);
    }

    /**
     * Displays the given number of outs.
     */
    public void displayForOuts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.outs);
        scoreView.setText(String.valueOf(score));
    }

    public void add1strike(View v) {
        numberOfStrikes = numberOfStrikes + 1;
        if (numberOfStrikes > 2) {
            displayForOuts(numberOfOuts = numberOfOuts + 1);
            displayForBalls(numberOfBalls = 0);
            if (numberOfOuts > 2) {
                displayForOuts(numberOfOuts = 0);
                displayForStrikes(numberOfStrikes = 0);
                displayForBalls(numberOfBalls = 0);
            }
            displayForStrikes(numberOfStrikes = 0);
        }
        displayForStrikes(numberOfStrikes);
    }

    /**
     * Displays the given number of strikes.
     */
    public void displayForStrikes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.strikes);
        scoreView.setText(String.valueOf(score));
    }

    public void add1ball(View v) {
        numberOfBalls = numberOfBalls + 1;
        if (numberOfBalls > 3) {
            displayForBalls(numberOfBalls = 0);
            displayForStrikes(numberOfStrikes = 0);
        }
        displayForBalls(numberOfBalls);
    }

    /**
     * Displays the given number of balls.
     */
    public void displayForBalls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.balls);
        scoreView.setText(String.valueOf(score));
    }

    public void add1outb(View v) {
        numberOfOutsb = numberOfOutsb + 1;
        if (numberOfOutsb > 2) {
            displayForOutsb(numberOfOutsb = 0);
            displayForStrikesb(numberOfStrikesb = 0);
            displayForBallsb(numberOfBallsb = 0);
        }
        displayForOutsb(numberOfOutsb);
    }

    /**
     * Displays the given number of outs for away team.
     */
    public void displayForOutsb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.outsb);
        scoreView.setText(String.valueOf(score));
    }

    public void add1strikeb(View v) {
        numberOfStrikesb = numberOfStrikesb + 1;
        if (numberOfStrikesb > 2) {
            displayForOutsb(numberOfOutsb = numberOfOutsb + 1);
            displayForBallsb(numberOfBallsb = 0);
            if (numberOfOutsb > 2) {
                displayForOutsb(numberOfOutsb = 0);
                displayForStrikesb(numberOfStrikesb = 0);
                displayForBallsb(numberOfBallsb = 0);
            }
            displayForStrikesb(numberOfStrikesb = 0);
        }
        displayForStrikesb(numberOfStrikesb);
    }

    /**
     * Displays the given number of strikes for away team.
     */
    public void displayForStrikesb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.strikesb);
        scoreView.setText(String.valueOf(score));
    }

    public void add1ballb(View v) {
        numberOfBallsb = numberOfBallsb + 1;
        if (numberOfBallsb > 3) {
            displayForBallsb(numberOfBallsb = 0);
            displayForStrikesb(numberOfStrikesb = 0);
        }
        displayForBallsb(numberOfBallsb);
    }

    /**
     * Displays the given number of balls for away team.
     */
    public void displayForBallsb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ballsb);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the display to 0.
     */
    public void ballHit(View v) {
        displayForBalls(numberOfBalls = 0);
        displayForStrikes(numberOfStrikes = 0);
        displayForBallsb(numberOfBallsb = 0);
        displayForStrikesb(numberOfStrikesb = 0);
    }

    /**
     * Resets all the display to 0.
     */
    public void resetall(View v) {
        displayForHome(scoreHome = 0);
        displayForAway(scoreAway = 0);
        displayForBalls(numberOfBalls = 0);
        displayForStrikes(numberOfStrikes = 0);
        displayForOuts(numberOfOuts = 0);
        displayForBallsb(numberOfBallsb = 0);
        displayForStrikesb(numberOfStrikesb = 0);
        displayForOutsb(numberOfOutsb = 0);
        displayForInning(innings = 0);
    }

}
