package com.leventalahan.android.developedcounter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class CounterActivity extends AppCompatActivity {
    int scoreTeamOne, scoreTeamTwo, x;
    int t1player1, t1player2, t1player3, t1player4, t1player5, t1player6, t1player7, t1player8;
    int t1player1f, t1player2f, t1player3f, t1player4f, t1player5f, t1player6f, t1player7f, t1player8f;

    int t2player1, t2player2, t2player3, t2player4, t2player5, t2player6, t2player7, t2player8;
    int t2player1f, t2player2f, t2player3f, t2player4f, t2player5f, t2player6f, t2player7f, t2player8f;
    Button add3A, add2A, add1A, min3A, min2A, min1A, add3B, add2B, add1B, min3B, min2B, min1B;
    Button guyScored, faul1, faul2;
    CheckBox first, second, third, fourth;
    ImageButton play, stop;
    RadioButton radplayer1, radplayer2, radplayer3, radplayer4, radplayer5, radplayer6, radplayer7, radplayer8;
    boolean isRunning = false;
    CountDownTimer countDown;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private static long START_TIME_IN_MILLIS = 60000;
    TextView itisfun, towritecodes, gameRule, timer, quarter;
    TextView teamonelist1, teamonelist2, teamonelist3, teamonelist4, teamonelist5, teamonelist6, teamonelist7, teamonelist8;

    String t1p1, t1p2, t1p3, t1p4, t1p5, t1p6, t1p7, t1p8, t2p1, t2p2, t2p3, t2p4, t2p5, t2p6, t2p7, t2p8, chronom;

    public MediaPlayer scoreMediaPlayer;
    public MediaPlayer buzzerMediaPlayer;
    public MediaPlayer minusMediaPlayer;
    ImageView basketa;
    ImageView basketb;
    LinearLayout shema;
    LinearLayout add3Ateam;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        if(savedInstanceState == null){

        }

        itisfun = (TextView) findViewById(R.id.team1);
        towritecodes = (TextView) findViewById(R.id.team2);
        teamonelist1 = (TextView) findViewById(R.id.player1);
        teamonelist2 = (TextView) findViewById(R.id.player2);
        teamonelist3 = (TextView) findViewById(R.id.player3);
        teamonelist4 = (TextView) findViewById(R.id.player4);
        teamonelist5 = (TextView) findViewById(R.id.player5);
        teamonelist6 = (TextView) findViewById(R.id.player6);
        teamonelist7 = (TextView) findViewById(R.id.player7);
        teamonelist8 = (TextView) findViewById(R.id.player8);
        gameRule = (TextView) findViewById(R.id.gameRule);

        Intent intent = getIntent();
        String teamOneString = intent.getStringExtra("teamOne");
        String teamTwoString = intent.getStringExtra("teamTwo");
        t1p1 = intent.getStringExtra("t1p1");
        t1p2 = intent.getStringExtra("t1p2");
        t1p3 = intent.getStringExtra("t1p3");
        t1p4 = intent.getStringExtra("t1p4");
        t1p5 = intent.getStringExtra("t1p5");
        t1p6 = intent.getStringExtra("t1p6");
        t1p7 = intent.getStringExtra("t1p7");
        t1p8 = intent.getStringExtra("t1p8");
        t2p1 = intent.getStringExtra("t2p1");
        t2p2 = intent.getStringExtra("t2p2");
        t2p3 = intent.getStringExtra("t2p3");
        t2p4 = intent.getStringExtra("t2p4");
        t2p5 = intent.getStringExtra("t2p5");
        t2p6 = intent.getStringExtra("t2p6");
        t2p7 = intent.getStringExtra("t2p7");
        t2p8 = intent.getStringExtra("t2p8");
        chronom = intent.getStringExtra("chronom");

        gameRule.setText(chronom);

        scoreMediaPlayer = MediaPlayer.create(this, R.raw.plus);
        buzzerMediaPlayer = MediaPlayer.create(this, R.raw.buzzer);
        minusMediaPlayer = MediaPlayer.create(this, R.raw.minus);
        basketa = (ImageView) findViewById(R.id.imageView1);
        basketb = (ImageView) findViewById(R.id.imageView2);
        shema = (LinearLayout) findViewById(R.id.shema);
        add3Ateam = (LinearLayout) findViewById(R.id.add3Ateam);
        radplayer1 = (RadioButton) findViewById(R.id.player1);
        radplayer2 = (RadioButton) findViewById(R.id.player2);
        radplayer3 = (RadioButton) findViewById(R.id.player3);
        radplayer4 = (RadioButton) findViewById(R.id.player4);
        radplayer5 = (RadioButton) findViewById(R.id.player5);
        radplayer6 = (RadioButton) findViewById(R.id.player6);
        radplayer7 = (RadioButton) findViewById(R.id.player7);
        radplayer8 = (RadioButton) findViewById(R.id.player8);

        scoreTeamOne = t1player1 + t1player2 + t1player3 + t1player4 + t1player5 + t1player6 + t1player7 + t1player8;

        guyScored = (Button) findViewById(R.id.guyScored);
        faul2 = findViewById(R.id.fauls2);
        faul2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                teamonelist1.setText(t2p1);
                teamonelist2.setText(t2p2);
                teamonelist3.setText(t2p3);
                teamonelist4.setText(t2p4);
                teamonelist5.setText(t2p5);
                teamonelist6.setText(t2p6);
                teamonelist7.setText(t2p7);
                teamonelist8.setText(t2p8);


                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t2player1f = t2player1f + 1;
                        }
                        if (radplayer2.isChecked()) {
                            t2player2f = t2player2f + 1;
                        }
                        if (radplayer3.isChecked()) {
                            t2player3f = t2player3f + 1;
                        }
                        if (radplayer4.isChecked()) {
                            t2player4f = t2player4f + 1;
                        }
                        if (radplayer5.isChecked()) {
                            t2player5f = t2player5f + 1;
                        }
                        if (radplayer6.isChecked()) {
                            t2player6f = t2player6f + 1;
                        }
                        if (radplayer7.isChecked()) {
                            t2player7f = t2player7f + 1;
                        }
                        if (radplayer8.isChecked()) {
                            t2player8f = t2player8f + 1;
                        }
                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        buzzerMediaPlayer.start();

                    }
                });
            }
        });
        faul1 = findViewById(R.id.fauls1);
        faul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t1p1);
                teamonelist2.setText(t1p2);
                teamonelist3.setText(t1p3);
                teamonelist4.setText(t1p4);
                teamonelist5.setText(t1p5);
                teamonelist6.setText(t1p6);
                teamonelist7.setText(t1p7);
                teamonelist8.setText(t1p8);

                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (radplayer1.isChecked()) {
                            t1player1f = t1player1f + 1;
                        }
                        if (radplayer2.isChecked()) {
                            t1player2f = t1player2f + 1;
                        }
                        if (radplayer3.isChecked()) {
                            t1player3f = t1player3f + 1;
                        }
                        if (radplayer4.isChecked()) {
                            t1player4f = t1player4f + 1;
                        }
                        if (radplayer5.isChecked()) {
                            t1player5f = t1player5f + 1;
                        }
                        if (radplayer6.isChecked()) {
                            t1player6f = t1player6f + 1;
                        }
                        if (radplayer7.isChecked()) {
                            t1player7f = t1player7f + 1;
                        }
                        if (radplayer8.isChecked()) {
                            t1player8f = t1player8f + 1;
                        }
                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        buzzerMediaPlayer.start();
                    }
                });
            }
        });
        add3A = (Button) findViewById(R.id.add3A);
        add3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t1p1);
                teamonelist2.setText(t1p2);
                teamonelist3.setText(t1p3);
                teamonelist4.setText(t1p4);
                teamonelist5.setText(t1p5);
                teamonelist6.setText(t1p6);
                teamonelist7.setText(t1p7);
                teamonelist8.setText(t1p8);

                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (radplayer1.isChecked()) {
                            t1player1 = t1player1 + 3;
                        }
                        if (radplayer2.isChecked()) {
                            t1player2 = t1player2 + 3;
                        }
                        if (radplayer3.isChecked()) {
                            t1player3 = t1player3 + 3;
                        }
                        if (radplayer4.isChecked()) {
                            t1player4 = t1player4 + 3;
                        }
                        if (radplayer5.isChecked()) {
                            t1player5 = t1player5 + 3;
                        }
                        if (radplayer6.isChecked()) {
                            t1player6 = t1player6 + 3;
                        }
                        if (radplayer7.isChecked()) {
                            t1player7 = t1player7 + 3;
                        }
                        if (radplayer8.isChecked()) {
                            t1player8 = t1player8 + 3;
                        }
                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketa.setVisibility(View.VISIBLE);
                        scoreMediaPlayer.start();
                        dispTeamOne(scoreTeamOne = t1player1 + t1player2 + t1player3 + t1player4 + t1player5 + t1player6 + t1player7 + t1player8);
                    }
                });
            }
        });
        add2A = (Button) findViewById(R.id.add2A);
        add2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t1p1);
                teamonelist2.setText(t1p2);
                teamonelist3.setText(t1p3);
                teamonelist4.setText(t1p4);
                teamonelist5.setText(t1p5);
                teamonelist6.setText(t1p6);
                teamonelist7.setText(t1p7);
                teamonelist8.setText(t1p8);

                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t1player1 = t1player1 + 2;
                        }
                        if (radplayer2.isChecked()) {
                            t1player2 = t1player2 + 2;
                        }
                        if (radplayer3.isChecked()) {
                            t1player3 = t1player3 + 2;
                        }
                        if (radplayer4.isChecked()) {
                            t1player4 = t1player4 + 2;
                        }
                        if (radplayer5.isChecked()) {
                            t1player5 = t1player5 + 2;
                        }
                        if (radplayer6.isChecked()) {
                            t1player6 = t1player6 + 2;
                        }
                        if (radplayer7.isChecked()) {
                            t1player7 = t1player7 + 2;
                        }
                        if (radplayer8.isChecked()) {
                            t1player8 = t1player8 + 2;
                        }
                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketa.setVisibility(View.VISIBLE);
                        scoreMediaPlayer.start();
                        dispTeamOne(scoreTeamOne = t1player1 + t1player2 + t1player3 + t1player4 + t1player5 + t1player6 + t1player7 + t1player8);
                    }
                });
            }
        });
        add1A = (Button) findViewById(R.id.add1A);
        add1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t1p1);
                teamonelist2.setText(t1p2);
                teamonelist3.setText(t1p3);
                teamonelist4.setText(t1p4);
                teamonelist5.setText(t1p5);
                teamonelist6.setText(t1p6);
                teamonelist7.setText(t1p7);
                teamonelist8.setText(t1p8);


                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t1player1 = t1player1 + 1;
                        }
                        if (radplayer2.isChecked()) {
                            t1player2 = t1player2 + 1;
                        }
                        if (radplayer3.isChecked()) {
                            t1player3 = t1player3 + 1;
                        }
                        if (radplayer4.isChecked()) {
                            t1player4 = t1player4 + 1;
                        }
                        if (radplayer5.isChecked()) {
                            t1player5 = t1player5 + 1;
                        }
                        if (radplayer6.isChecked()) {
                            t1player6 = t1player6 + 1;
                        }
                        if (radplayer7.isChecked()) {
                            t1player7 = t1player7 + 1;
                        }
                        if (radplayer8.isChecked()) {
                            t1player8 = t1player8 + 1;
                        }
                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketa.setVisibility(View.VISIBLE);
                        scoreMediaPlayer.start();
                        dispTeamOne(scoreTeamOne = t1player1 + t1player2 + t1player3 + t1player4 + t1player5 + t1player6 + t1player7 + t1player8);
                    }
                });
            }
        });
        min3A = (Button) findViewById(R.id.subtract3A);
        min3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t1p1);
                teamonelist2.setText(t1p2);
                teamonelist3.setText(t1p3);
                teamonelist4.setText(t1p4);
                teamonelist5.setText(t1p5);
                teamonelist6.setText(t1p6);
                teamonelist7.setText(t1p7);
                teamonelist8.setText(t1p8);

                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t1player1 = t1player1 - 3;
                        }
                        if (radplayer2.isChecked()) {
                            t1player2 = t1player2 - 3;
                        }
                        if (radplayer3.isChecked()) {
                            t1player3 = t1player3 - 3;
                        }
                        if (radplayer4.isChecked()) {
                            t1player4 = t1player4 - 3;
                        }
                        if (radplayer5.isChecked()) {
                            t1player5 = t1player5 - 3;
                        }
                        if (radplayer6.isChecked()) {
                            t1player6 = t1player6 - 3;
                        }
                        if (radplayer7.isChecked()) {
                            t1player7 = t1player7 - 3;
                        }
                        if (radplayer8.isChecked()) {
                            t1player8 = t1player8 - 3;
                        }
                        if (scoreTeamOne < 0) {
                            dispTeamOne(scoreTeamOne = 0);
                        }
                        if (t1player1 < 0) {
                            t1player1 = 0;
                        }
                        if (t1player2 < 0) {
                            t1player2 = 0;
                        }
                        if (t1player3 < 0) {
                            t1player3 = 0;
                        }
                        if (t1player4 < 0) {
                            t1player4 = 0;
                        }
                        if (t1player5 < 0) {
                            t1player5 = 0;
                        }
                        if (t1player6 < 0) {
                            t1player6 = 0;
                        }
                        if (t1player7 < 0) {
                            t1player7 = 0;
                        }
                        if (t1player8 < 0) {
                            t1player8 = 0;
                        }

                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketa.setVisibility(View.INVISIBLE);
                        minusMediaPlayer.start();
                        dispTeamOne(scoreTeamOne = t1player1 + t1player2 + t1player3 + t1player4 + t1player5 + t1player6 + t1player7 + t1player8);
                    }
                });
            }
        });
        min2A = (Button) findViewById(R.id.subtract2A);
        min2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t1p1);
                teamonelist2.setText(t1p2);
                teamonelist3.setText(t1p3);
                teamonelist4.setText(t1p4);
                teamonelist5.setText(t1p5);
                teamonelist6.setText(t1p6);
                teamonelist7.setText(t1p7);
                teamonelist8.setText(t1p8);


                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t1player1 = t1player1 - 2;
                        }
                        if (radplayer2.isChecked()) {
                            t1player2 = t1player2 - 2;
                        }
                        if (radplayer3.isChecked()) {
                            t1player3 = t1player3 - 2;
                        }
                        if (radplayer4.isChecked()) {
                            t1player4 = t1player4 - 2;
                        }
                        if (radplayer5.isChecked()) {
                            t1player5 = t1player5 - 2;
                        }
                        if (radplayer6.isChecked()) {
                            t1player6 = t1player6 - 2;
                        }
                        if (radplayer7.isChecked()) {
                            t1player7 = t1player7 - 2;
                        }
                        if (radplayer8.isChecked()) {
                            t1player8 = t1player8 - 2;
                        }
                        if (scoreTeamOne < 0) {
                            dispTeamOne(scoreTeamOne = 0);
                        }
                        if (t1player1 < 0) {
                            t1player1 = 0;
                        }
                        if (t1player2 < 0) {
                            t1player2 = 0;
                        }
                        if (t1player3 < 0) {
                            t1player3 = 0;
                        }
                        if (t1player4 < 0) {
                            t1player4 = 0;
                        }
                        if (t1player5 < 0) {
                            t1player5 = 0;
                        }
                        if (t1player6 < 0) {
                            t1player6 = 0;
                        }
                        if (t1player7 < 0) {
                            t1player7 = 0;
                        }
                        if (t1player8 < 0) {
                            t1player8 = 0;
                        }

                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketa.setVisibility(View.INVISIBLE);
                        minusMediaPlayer.start();
                        dispTeamOne(scoreTeamOne = t1player1 + t1player2 + t1player3 + t1player4 + t1player5 + t1player6 + t1player7 + t1player8);
                    }
                });
            }
        });
        min1A = (Button) findViewById(R.id.subtract1A);
        min1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t1p1);
                teamonelist2.setText(t1p2);
                teamonelist3.setText(t1p3);
                teamonelist4.setText(t1p4);
                teamonelist5.setText(t1p5);
                teamonelist6.setText(t1p6);
                teamonelist7.setText(t1p7);
                teamonelist8.setText(t1p8);

                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t1player1 = t1player1 - 1;
                        }
                        if (radplayer2.isChecked()) {
                            t1player2 = t1player2 - 1;
                        }
                        if (radplayer3.isChecked()) {
                            t1player3 = t1player3 - 1;
                        }
                        if (radplayer4.isChecked()) {
                            t1player4 = t1player4 - 1;
                        }
                        if (radplayer5.isChecked()) {
                            t1player5 = t1player5 - 1;
                        }
                        if (radplayer6.isChecked()) {
                            t1player6 = t1player6 - 1;
                        }
                        if (radplayer7.isChecked()) {
                            t1player7 = t1player7 - 1;
                        }
                        if (radplayer8.isChecked()) {
                            t1player8 = t1player8 - 1;
                        }
                        if (scoreTeamOne < 0) {
                            dispTeamOne(scoreTeamOne = 0);
                        }
                        if (t1player1 < 0) {
                            t1player1 = 0;
                        }
                        if (t1player2 < 0) {
                            t1player2 = 0;
                        }
                        if (t1player3 < 0) {
                            t1player3 = 0;
                        }
                        if (t1player4 < 0) {
                            t1player4 = 0;
                        }
                        if (t1player5 < 0) {
                            t1player5 = 0;
                        }
                        if (t1player6 < 0) {
                            t1player6 = 0;
                        }
                        if (t1player7 < 0) {
                            t1player7 = 0;
                        }
                        if (t1player8 < 0) {
                            t1player8 = 0;
                        }

                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketa.setVisibility(View.INVISIBLE);
                        minusMediaPlayer.start();
                        dispTeamOne(scoreTeamOne = t1player1 + t1player2 + t1player3 + t1player4 + t1player5 + t1player6 + t1player7 + t1player8);
                    }
                });
            }
        });
        add3B = (Button) findViewById(R.id.add3B);
        add3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t2p1);
                teamonelist2.setText(t2p2);
                teamonelist3.setText(t2p3);
                teamonelist4.setText(t2p4);
                teamonelist5.setText(t2p5);
                teamonelist6.setText(t2p6);
                teamonelist7.setText(t2p7);
                teamonelist8.setText(t2p8);

                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t2player1 = t2player1 + 3;
                        }
                        if (radplayer2.isChecked()) {
                            t2player2 = t2player2 + 3;
                        }
                        if (radplayer3.isChecked()) {
                            t2player3 = t2player3 + 3;
                        }
                        if (radplayer4.isChecked()) {
                            t2player4 = t2player4 + 3;
                        }
                        if (radplayer5.isChecked()) {
                            t2player5 = t2player5 + 3;
                        }
                        if (radplayer6.isChecked()) {
                            t2player6 = t2player6 + 3;
                        }
                        if (radplayer7.isChecked()) {
                            t2player7 = t2player7 + 3;
                        }
                        if (radplayer8.isChecked()) {
                            t2player8 = t2player8 + 3;
                        }
                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketb.setVisibility(View.VISIBLE);
                        scoreMediaPlayer.start();
                        dispTeamTwo(scoreTeamTwo = t2player1 + t2player2 + t2player3 + t2player4 + t2player5 + t2player6 + t2player7 + t2player8);
                    }
                });
            }
        });
        add2B = (Button) findViewById(R.id.add2B);
        add2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t2p1);
                teamonelist2.setText(t2p2);
                teamonelist3.setText(t2p3);
                teamonelist4.setText(t2p4);
                teamonelist5.setText(t2p5);
                teamonelist6.setText(t2p6);
                teamonelist7.setText(t2p7);
                teamonelist8.setText(t2p8);


                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t2player1 = t2player1 + 2;
                        }
                        if (radplayer2.isChecked()) {
                            t2player2 = t2player2 + 2;
                        }
                        if (radplayer3.isChecked()) {
                            t2player3 = t2player3 + 2;
                        }
                        if (radplayer4.isChecked()) {
                            t2player4 = t2player4 + 2;
                        }
                        if (radplayer5.isChecked()) {
                            t2player5 = t2player5 + 2;
                        }
                        if (radplayer6.isChecked()) {
                            t2player6 = t2player6 + 2;
                        }
                        if (radplayer7.isChecked()) {
                            t2player7 = t2player7 + 2;
                        }
                        if (radplayer8.isChecked()) {
                            t2player8 = t2player8 + 2;
                        }
                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketb.setVisibility(View.VISIBLE);
                        scoreMediaPlayer.start();
                        dispTeamTwo(scoreTeamTwo = t2player1 + t2player2 + t2player3 + t2player4 + t2player5 + t2player6 + t2player7 + t2player8);
                    }
                });
            }
        });
        add1B = (Button) findViewById(R.id.add1B);
        add1B.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                teamonelist1.setText(t2p1);
                teamonelist2.setText(t2p2);
                teamonelist3.setText(t2p3);
                teamonelist4.setText(t2p4);
                teamonelist5.setText(t2p5);
                teamonelist6.setText(t2p6);
                teamonelist7.setText(t2p7);
                teamonelist8.setText(t2p8);


                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t2player1 = t2player1 + 1;
                        }
                        if (radplayer2.isChecked()) {
                            t2player2 = t2player2 + 1;
                        }
                        if (radplayer3.isChecked()) {
                            t2player3 = t2player3 + 1;
                        }
                        if (radplayer4.isChecked()) {
                            t2player4 = t2player4 + 1;
                        }
                        if (radplayer5.isChecked()) {
                            t2player5 = t2player5 + 1;
                        }
                        if (radplayer6.isChecked()) {
                            t2player6 = t2player6 + 1;
                        }
                        if (radplayer7.isChecked()) {
                            t2player7 = t2player7 + 1;
                        }
                        if (radplayer8.isChecked()) {
                            t2player8 = t2player8 + 1;
                        }
                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketb.setVisibility(View.VISIBLE);
                        scoreMediaPlayer.start();
                        dispTeamTwo(scoreTeamTwo = t2player1 + t2player2 + t2player3 + t2player4 + t2player5 + t2player6 + t2player7 + t2player8);
                    }
                });
            }
        });
        min3B = (Button) findViewById(R.id.subtract3B);
        min3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t2p1);
                teamonelist2.setText(t2p2);
                teamonelist3.setText(t2p3);
                teamonelist4.setText(t2p4);
                teamonelist5.setText(t2p5);
                teamonelist6.setText(t2p6);
                teamonelist7.setText(t2p7);
                teamonelist8.setText(t2p8);


                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t2player1 = t2player1 - 3;
                        }
                        if (radplayer2.isChecked()) {
                            t2player2 = t2player2 - 3;
                        }
                        if (radplayer3.isChecked()) {
                            t2player3 = t2player3 - 3;
                        }
                        if (radplayer4.isChecked()) {
                            t2player4 = t2player4 - 3;
                        }
                        if (radplayer5.isChecked()) {
                            t2player5 = t2player5 - 3;
                        }
                        if (radplayer6.isChecked()) {
                            t2player6 = t2player6 - 3;
                        }
                        if (radplayer7.isChecked()) {
                            t2player7 = t2player7 - 3;
                        }
                        if (radplayer8.isChecked()) {
                            t2player8 = t2player8 - 3;
                        }
                        if (scoreTeamTwo < 0) {
                            dispTeamOne(scoreTeamTwo = 0);
                        }
                        if (t2player1 < 0) {
                            t2player1 = 0;
                        }
                        if (t2player2 < 0) {
                            t2player2 = 0;
                        }
                        if (t2player3 < 0) {
                            t2player3 = 0;
                        }
                        if (t2player4 < 0) {
                            t2player4 = 0;
                        }
                        if (t2player5 < 0) {
                            t2player5 = 0;
                        }
                        if (t2player6 < 0) {
                            t2player6 = 0;
                        }
                        if (t2player7 < 0) {
                            t2player7 = 0;
                        }
                        if (t2player8 < 0) {
                            t2player8 = 0;
                        }

                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketb.setVisibility(View.INVISIBLE);
                        minusMediaPlayer.start();
                        dispTeamTwo(scoreTeamTwo = t2player1 + t2player2 + t2player3 + t2player4 + t2player5 + t2player6 + t2player7 + t2player8);
                    }
                });
            }
        });
        min2B = (Button) findViewById(R.id.subtract2B);
        min2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t2p1);
                teamonelist2.setText(t2p2);
                teamonelist3.setText(t2p3);
                teamonelist4.setText(t2p4);
                teamonelist5.setText(t2p5);
                teamonelist6.setText(t2p6);
                teamonelist7.setText(t2p7);
                teamonelist8.setText(t2p8);

                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t2player1 = t2player1 - 2;
                        }
                        if (radplayer2.isChecked()) {
                            t2player2 = t2player2 - 2;
                        }
                        if (radplayer3.isChecked()) {
                            t2player3 = t2player3 - 2;
                        }
                        if (radplayer4.isChecked()) {
                            t2player4 = t2player4 - 2;
                        }
                        if (radplayer5.isChecked()) {
                            t2player5 = t2player5 - 2;
                        }
                        if (radplayer6.isChecked()) {
                            t2player6 = t2player6 - 2;
                        }
                        if (radplayer7.isChecked()) {
                            t2player7 = t2player7 - 2;
                        }
                        if (radplayer8.isChecked()) {
                            t2player8 = t2player8 - 2;
                        }
                        if (scoreTeamTwo < 0) {
                            dispTeamOne(scoreTeamTwo = 0);
                        }
                        if (t2player1 < 0) {
                            t2player1 = 0;
                        }
                        if (t2player2 < 0) {
                            t2player2 = 0;
                        }
                        if (t2player3 < 0) {
                            t2player3 = 0;
                        }
                        if (t2player4 < 0) {
                            t2player4 = 0;
                        }
                        if (t2player5 < 0) {
                            t2player5 = 0;
                        }
                        if (t2player6 < 0) {
                            t2player6 = 0;
                        }
                        if (t2player7 < 0) {
                            t2player7 = 0;
                        }
                        if (t2player8 < 0) {
                            t2player8 = 0;
                        }

                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketb.setVisibility(View.INVISIBLE);
                        minusMediaPlayer.start();
                        dispTeamTwo(scoreTeamTwo = t2player1 + t2player2 + t2player3 + t2player4 + t2player5 + t2player6 + t2player7 + t2player8);
                    }
                });
            }
        });
        min1B = (Button) findViewById(R.id.subtract1B);
        min1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamonelist1.setText(t2p1);
                teamonelist2.setText(t2p2);
                teamonelist3.setText(t2p3);
                teamonelist4.setText(t2p4);
                teamonelist5.setText(t2p5);
                teamonelist6.setText(t2p6);
                teamonelist7.setText(t2p7);
                teamonelist8.setText(t2p8);

                shema.setVisibility(View.GONE);
                add3Ateam.setVisibility(View.VISIBLE);

                guyScored.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (radplayer1.isChecked()) {
                            t2player1 = t2player1 - 1;
                        }
                        if (radplayer2.isChecked()) {
                            t2player2 = t2player2 - 1;
                        }
                        if (radplayer3.isChecked()) {
                            t2player3 = t2player3 - 1;
                        }
                        if (radplayer4.isChecked()) {
                            t2player4 = t2player4 - 1;
                        }
                        if (radplayer5.isChecked()) {
                            t2player5 = t2player5 - 1;
                        }
                        if (radplayer6.isChecked()) {
                            t2player6 = t2player6 - 1;
                        }
                        if (radplayer7.isChecked()) {
                            t2player7 = t2player7 - 1;
                        }
                        if (radplayer8.isChecked()) {
                            t2player8 = t2player8 - 1;
                        }
                        if (scoreTeamTwo < 0) {
                            dispTeamOne(scoreTeamTwo = 0);
                        }
                        if (t2player1 < 0) {
                            t2player1 = 0;
                        }
                        if (t2player2 < 0) {
                            t2player2 = 0;
                        }
                        if (t2player3 < 0) {
                            t2player3 = 0;
                        }
                        if (t2player4 < 0) {
                            t2player4 = 0;
                        }
                        if (t2player5 < 0) {
                            t2player5 = 0;
                        }
                        if (t2player6 < 0) {
                            t2player6 = 0;
                        }
                        if (t2player7 < 0) {
                            t2player7 = 0;
                        }
                        if (t2player8 < 0) {
                            t2player8 = 0;
                        }

                        shema.setVisibility(View.VISIBLE);
                        add3Ateam.setVisibility(View.GONE);
                        basketb.setVisibility(View.INVISIBLE);
                        minusMediaPlayer.start();
                        dispTeamTwo(scoreTeamTwo = t2player1 + t2player2 + t2player3 + t2player4 + t2player5 + t2player6 + t2player7 + t2player8);
                    }
                });
            }
        });


        itisfun.setText(teamOneString);
        towritecodes.setText(teamTwoString);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);

        timer = findViewById(R.id.timer);

        play = findViewById(R.id.startChro);
        stop = findViewById(R.id.pauseChro);

        if(chronom.equals("8 mins / 4 quarters")){
            mTimeLeftInMillis = 480000;
            first.setVisibility(View.VISIBLE);
            second.setVisibility(View.VISIBLE);
            third.setVisibility(View.VISIBLE);
            fourth.setVisibility(View.VISIBLE);
        }
        if (chronom.equals("20 mins / 2 halves")){
            mTimeLeftInMillis = 1200000;
            first.setVisibility(View.VISIBLE);
            second.setVisibility(View.VISIBLE);
        }
        if (chronom.equals("12 mins / 4 quarters")){
            mTimeLeftInMillis= 720000;
            first.setVisibility(View.VISIBLE);
            second.setVisibility(View.VISIBLE);
            third.setVisibility(View.VISIBLE);
            fourth.setVisibility(View.VISIBLE);
        }

        //I got the main idea from here but arranged it for different set of rules aka. nba, college or other
        // https://codinginflow.com/code-examples/android/countdown-timer/part-1

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isRunning) {
                    startTimer();
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isRunning) {
                    pauseTimer();

                }
            }
        });

        updateCountDownText();

    }
    private void startTimer() {

            countDown = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                isRunning = false;

                stop.setVisibility(View.GONE);
                play.setVisibility(View.VISIBLE);
            }
        }.start();

        isRunning = true;
        stop.setVisibility(View.VISIBLE);
        play.setVisibility(View.GONE);
    }
    private void pauseTimer() {
        countDown.cancel();
        isRunning = false;
        play.setVisibility(View.VISIBLE);
        stop.setVisibility(View.GONE);
    }


    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        timer.setText(timeLeftFormatted);
    }


    public void reset (View view){

        String control = "Do you want to RESET?";
        String yes = "Yes";
        String no = "No";
        String dialogBoxTitle = "Final Check";


        {

            AlertDialog.Builder yesNo = new AlertDialog.Builder(CounterActivity.this, R.style.DialogTheme);
            yesNo.setMessage(control).setCancelable(false)
                    .setNegativeButton(no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    })
                    .setPositiveButton(yes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            scoreTeamOne=0;
                            scoreTeamTwo=0;
                            t2player1=0;
                            t2player2=0;
                            t2player3=0;
                            t2player4=0;
                            t2player5=0;
                            t2player6=0;
                            t2player7=0;
                            t2player8=0;
                            t1player1=0;
                            t1player2=0;
                            t1player3=0;
                            t1player4=0;
                            t1player5=0;
                            t1player6=0;
                            t1player7=0;
                            t1player8=0;
                            buzzerMediaPlayer.start();
                            dispTeamOne(scoreTeamOne=0);
                            dispTeamTwo(scoreTeamTwo=0);
                        }
                    });

            AlertDialog alert = yesNo.create();
            alert.setTitle(dialogBoxTitle);
            alert.show();

        }

    }
    public void reporter(View view) {
        Intent intent = getIntent();
        t1p1 = intent.getStringExtra("t1p1");
        t1p2 = intent.getStringExtra("t1p2");
        t1p3 = intent.getStringExtra("t1p3");
        t1p4 = intent.getStringExtra("t1p4");
        t1p5 = intent.getStringExtra("t1p5");
        t1p6 = intent.getStringExtra("t1p6");
        t1p7 = intent.getStringExtra("t1p7");
        t1p8 = intent.getStringExtra("t1p8");
        t2p1 = intent.getStringExtra("t2p1");
        t2p2 = intent.getStringExtra("t2p2");
        t2p3 = intent.getStringExtra("t2p3");
        t2p4 = intent.getStringExtra("t2p4");
        t2p5 = intent.getStringExtra("t2p5");
        t2p6 = intent.getStringExtra("t2p6");
        t2p7 = intent.getStringExtra("t2p7");
        t2p8 = intent.getStringExtra("t2p8");
        String teamOneString = intent.getStringExtra("teamOne");
        String teamTwoString = intent.getStringExtra("teamTwo");

        Intent intent2 = new Intent(CounterActivity.this, ReportActivity.class);
        intent2.putExtra("teamOne", teamOneString);
        intent2.putExtra("teamTwo", teamTwoString);
        intent2.putExtra("t1p1", t1p1);
        intent2.putExtra("t1p2", t1p2);
        intent2.putExtra("t1p3", t1p3);
        intent2.putExtra("t1p4", t1p4);
        intent2.putExtra("t1p5", t1p5);
        intent2.putExtra("t1p6", t1p6);
        intent2.putExtra("t1p7", t1p7);
        intent2.putExtra("t1p8", t1p8);
        intent2.putExtra("t2p1", t2p1);
        intent2.putExtra("t2p2", t2p2);
        intent2.putExtra("t2p3", t2p3);
        intent2.putExtra("t2p4", t2p4);
        intent2.putExtra("t2p5", t2p5);
        intent2.putExtra("t2p6", t2p6);
        intent2.putExtra("t2p7", t2p7);
        intent2.putExtra("t2p8", t2p8);

        intent2.putExtra("t1player1", t1player1);
        intent2.putExtra("t1player2", t1player2);
        intent2.putExtra("t1player3", t1player3);
        intent2.putExtra("t1player4", t1player4);
        intent2.putExtra("t1player5", t1player5);
        intent2.putExtra("t1player6", t1player6);
        intent2.putExtra("t1player7", t1player7);
        intent2.putExtra("t1player8", t1player8);
        intent2.putExtra("t2player1", t2player1);
        intent2.putExtra("t2player2", t2player2);
        intent2.putExtra("t2player3", t2player3);
        intent2.putExtra("t2player4", t2player4);
        intent2.putExtra("t2player5", t2player5);
        intent2.putExtra("t2player6", t2player6);
        intent2.putExtra("t2player7", t2player7);
        intent2.putExtra("t2player8", t2player8);

        intent2.putExtra("t1player1f", t1player1f);
        intent2.putExtra("t1player2f", t1player2f);
        intent2.putExtra("t1player3f", t1player3f);
        intent2.putExtra("t1player4f", t1player4f);
        intent2.putExtra("t1player5f", t1player5f);
        intent2.putExtra("t1player6f", t1player6f);
        intent2.putExtra("t1player7f", t1player7f);
        intent2.putExtra("t1player8f", t1player8f);
        intent2.putExtra("t2player1f", t2player1f);
        intent2.putExtra("t2player2f", t2player2f);
        intent2.putExtra("t2player3f", t2player3f);
        intent2.putExtra("t2player4f", t2player4f);
        intent2.putExtra("t2player5f", t2player5f);
        intent2.putExtra("t2player6f", t2player6f);
        intent2.putExtra("t2player7f", t2player7f);
        intent2.putExtra("t2player8f", t2player8f);

        intent2.putExtra("scOne", scoreTeamOne);
        intent2.putExtra("scTwo", scoreTeamTwo);

        startActivity(intent2);

    }

    public void counterPage(View view) {
        shema.setVisibility(View.VISIBLE);
        add3Ateam.setVisibility(View.GONE);
    }

    public void dispTeamTwo(int scoreTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.team_two);
        scoreView.setText(String.valueOf(scoreTeamTwo));
    }

    public void dispTeamOne(int scoreTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.team_one);
        scoreView.setText(String.valueOf(scoreTeamOne));
    }

}
