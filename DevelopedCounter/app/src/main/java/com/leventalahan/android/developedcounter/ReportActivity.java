package com.leventalahan.android.developedcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {
    int t1playera, t1playerb, t1playerc, t1playerd, t1playere, t1playerf, t1playerg, t1playerh, tscore1;
    int t2playera, t2playerb, t2playerc, t2playerd, t2playere, t2playerf, t2playerg, t2playerh, tscore2;
    int t1playeraf, t1playerbf, t1playercf, t1playerdf, t1playeref, t1playerff, t1playergf, t1playerhf, tscore1f;
    int t2playeraf, t2playerbf, t2playercf, t2playerdf, t2playeref, t2playerff, t2playergf, t2playerhf, tscore2f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        TextView team1 = (TextView) findViewById(R.id.team1);
        TextView team2 = (TextView) findViewById(R.id.team2);
        TextView t1p1 = (TextView) findViewById(R.id.team1player1);
        TextView t1p2 = (TextView) findViewById(R.id.team1player2);
        TextView t1p3 = (TextView) findViewById(R.id.team1player3);
        TextView t1p4 = (TextView) findViewById(R.id.team1player4);
        TextView t1p5 = (TextView) findViewById(R.id.team1player5);
        TextView t1p6 = (TextView) findViewById(R.id.team1player6);
        TextView t1p7 = (TextView) findViewById(R.id.team1player7);
        TextView t1p8 = (TextView) findViewById(R.id.team1player8);
        TextView t2p1 = (TextView) findViewById(R.id.team2player1);
        TextView t2p2 = (TextView) findViewById(R.id.team2player2);
        TextView t2p3 = (TextView) findViewById(R.id.team2player3);
        TextView t2p4 = (TextView) findViewById(R.id.team2player4);
        TextView t2p5 = (TextView) findViewById(R.id.team2player5);
        TextView t2p6 = (TextView) findViewById(R.id.team2player6);
        TextView t2p7 = (TextView) findViewById(R.id.team2player7);
        TextView t2p8 = (TextView) findViewById(R.id.team2player8);

        TextView t1p1s = (TextView) findViewById(R.id.team1score1);
        TextView t1p2s = (TextView) findViewById(R.id.team1score2);
        TextView t1p3s = (TextView) findViewById(R.id.team1score3);
        TextView t1p4s = (TextView) findViewById(R.id.team1score4);
        TextView t1p5s = (TextView) findViewById(R.id.team1score5);
        TextView t1p6s = (TextView) findViewById(R.id.team1score6);
        TextView t1p7s = (TextView) findViewById(R.id.team1score7);
        TextView t1p8s = (TextView) findViewById(R.id.team1score8);
        TextView t2p1s = (TextView) findViewById(R.id.team2score1);
        TextView t2p2s = (TextView) findViewById(R.id.team2score2);
        TextView t2p3s = (TextView) findViewById(R.id.team2score3);
        TextView t2p4s = (TextView) findViewById(R.id.team2score4);
        TextView t2p5s = (TextView) findViewById(R.id.team2score5);
        TextView t2p6s = (TextView) findViewById(R.id.team2score6);
        TextView t2p7s = (TextView) findViewById(R.id.team2score7);
        TextView t2p8s = (TextView) findViewById(R.id.team2score8);

        TextView t1p1sf = (TextView) findViewById(R.id.team1f1);
        TextView t1p2sf = (TextView) findViewById(R.id.team1f2);
        TextView t1p3sf = (TextView) findViewById(R.id.team1f3);
        TextView t1p4sf = (TextView) findViewById(R.id.team1f4);
        TextView t1p5sf = (TextView) findViewById(R.id.team1f5);
        TextView t1p6sf = (TextView) findViewById(R.id.team1f6);
        TextView t1p7sf = (TextView) findViewById(R.id.team1f7);
        TextView t1p8sf = (TextView) findViewById(R.id.team1f8);
        TextView t2p1sf = (TextView) findViewById(R.id.team2f1);
        TextView t2p2sf = (TextView) findViewById(R.id.team2f2);
        TextView t2p3sf = (TextView) findViewById(R.id.team2f3);
        TextView t2p4sf = (TextView) findViewById(R.id.team2f4);
        TextView t2p5sf = (TextView) findViewById(R.id.team2f5);
        TextView t2p6sf = (TextView) findViewById(R.id.team2f6);
        TextView t2p7sf = (TextView) findViewById(R.id.team2f7);
        TextView t2p8sf = (TextView) findViewById(R.id.team2f8);

        TextView score1 = (TextView) findViewById(R.id.score1);
        TextView score2 = (TextView) findViewById(R.id.score2);

        Intent intent = getIntent();

        String teamOneString = intent.getStringExtra("teamOne");
        String teamTwoString = intent.getStringExtra("teamTwo");

        String btbo = intent.getStringExtra("t1p1");
        String btio = intent.getStringExtra("t1p2");
        String btuo = intent.getStringExtra("t1p3");
        String btdo = intent.getStringExtra("t1p4");
        String btbeo = intent.getStringExtra("t1p5");
        String btao = intent.getStringExtra("t1p6");
        String btyo = intent.getStringExtra("t1p7");
        String btso = intent.getStringExtra("t1p8");
        String itbo = intent.getStringExtra("t2p1");
        String itio = intent.getStringExtra("t2p2");
        String ituo = intent.getStringExtra("t2p3");
        String itdo = intent.getStringExtra("t2p4");
        String itbeo = intent.getStringExtra("t2p5");
        String itao = intent.getStringExtra("t2p6");
        String ityo = intent.getStringExtra("t2p7");
        String itso = intent.getStringExtra("t2p8");

        // integer to string values got it from here http://javadevnotes.com/java-integer-to-string-examples#p1

        int t1player1s = intent.getIntExtra("t1player1", t1playera);
        int t1player2s = intent.getIntExtra("t1player2", t1playerb);
        int t1player3s = intent.getIntExtra("t1player3", t1playerc);
        int t1player4s = intent.getIntExtra("t1player4", t1playerd);
        int t1player5s = intent.getIntExtra("t1player5", t1playere);
        int t1player6s = intent.getIntExtra("t1player6", t1playerf);
        int t1player7s = intent.getIntExtra("t1player7", t1playerg);
        int t1player8s = intent.getIntExtra("t1player8", t1playerh);
        int t2player1s = intent.getIntExtra("t2player1", t2playera);
        int t2player2s = intent.getIntExtra("t2player2", t2playerb);
        int t2player3s = intent.getIntExtra("t2player3", t2playerc);
        int t2player4s = intent.getIntExtra("t2player4", t2playerd);
        int t2player5s = intent.getIntExtra("t2player5", t2playere);
        int t2player6s = intent.getIntExtra("t2player6", t2playerf);
        int t2player7s = intent.getIntExtra("t2player7", t2playerg);
        int t2player8s = intent.getIntExtra("t2player8", t2playerh);

        int t1player1sf = intent.getIntExtra("t1player1f", t1playeraf);
        int t1player2sf = intent.getIntExtra("t1player2f", t1playerbf);
        int t1player3sf = intent.getIntExtra("t1player3f", t1playercf);
        int t1player4sf = intent.getIntExtra("t1player4f", t1playerdf);
        int t1player5sf = intent.getIntExtra("t1player5f", t1playeref);
        int t1player6sf = intent.getIntExtra("t1player6f", t1playerff);
        int t1player7sf = intent.getIntExtra("t1player7f", t1playergf);
        int t1player8sf = intent.getIntExtra("t1player8f", t1playerhf);
        int t2player1sf = intent.getIntExtra("t2player1f", t2playeraf);
        int t2player2sf = intent.getIntExtra("t2player2f", t2playerbf);
        int t2player3sf = intent.getIntExtra("t2player3f", t2playercf);
        int t2player4sf = intent.getIntExtra("t2player4f", t2playerdf);
        int t2player5sf = intent.getIntExtra("t2player5f", t2playeref);
        int t2player6sf = intent.getIntExtra("t2player6f", t2playerff);
        int t2player7sf = intent.getIntExtra("t2player7f", t2playergf);
        int t2player8sf = intent.getIntExtra("t2player8f", t2playerhf);

        int tscore1int = intent.getIntExtra("scOne", tscore1);
        int tscore2int = intent.getIntExtra("scTwo", tscore2);

        String t1player1scr = Integer.toString(t1player1s);
        String t1player2scr = Integer.toString(t1player2s);
        String t1player3scr = Integer.toString(t1player3s);
        String t1player4scr = Integer.toString(t1player4s);
        String t1player5scr = Integer.toString(t1player5s);
        String t1player6scr = Integer.toString(t1player6s);
        String t1player7scr = Integer.toString(t1player7s);
        String t1player8scr = Integer.toString(t1player8s);
        String t2player1scr = Integer.toString(t2player1s);
        String t2player2scr = Integer.toString(t2player2s);
        String t2player3scr = Integer.toString(t2player3s);
        String t2player4scr = Integer.toString(t2player4s);
        String t2player5scr = Integer.toString(t2player5s);
        String t2player6scr = Integer.toString(t2player6s);
        String t2player7scr = Integer.toString(t2player7s);
        String t2player8scr = Integer.toString(t2player8s);

        String t1player1scrf = Integer.toString(t1player1sf);
        String t1player2scrf = Integer.toString(t1player2sf);
        String t1player3scrf = Integer.toString(t1player3sf);
        String t1player4scrf = Integer.toString(t1player4sf);
        String t1player5scrf = Integer.toString(t1player5sf);
        String t1player6scrf = Integer.toString(t1player6sf);
        String t1player7scrf = Integer.toString(t1player7sf);
        String t1player8scrf = Integer.toString(t1player8sf);
        String t2player1scrf = Integer.toString(t2player1sf);
        String t2player2scrf = Integer.toString(t2player2sf);
        String t2player3scrf = Integer.toString(t2player3sf);
        String t2player4scrf = Integer.toString(t2player4sf);
        String t2player5scrf = Integer.toString(t2player5sf);
        String t2player6scrf = Integer.toString(t2player6sf);
        String t2player7scrf = Integer.toString(t2player7sf);
        String t2player8scrf = Integer.toString(t2player8sf);

        String t1score = Integer.toString(tscore1int);
        String t2score = Integer.toString(tscore2int);

        score1.setText(t1score);
        score2.setText(t2score);
        t1p1s.setText(t1player1scr);
        t1p2s.setText(t1player2scr);
        t1p3s.setText(t1player3scr);
        t1p4s.setText(t1player4scr);
        t1p5s.setText(t1player5scr);
        t1p6s.setText(t1player6scr);
        t1p7s.setText(t1player7scr);
        t1p8s.setText(t1player8scr);
        t2p1s.setText(t2player1scr);
        t2p2s.setText(t2player2scr);
        t2p3s.setText(t2player3scr);
        t2p4s.setText(t2player4scr);
        t2p5s.setText(t2player5scr);
        t2p6s.setText(t2player6scr);
        t2p7s.setText(t2player7scr);
        t2p8s.setText(t2player8scr);

        t1p1sf.setText(t1player1scrf);
        t1p2sf.setText(t1player2scrf);
        t1p3sf.setText(t1player3scrf);
        t1p4sf.setText(t1player4scrf);
        t1p5sf.setText(t1player5scrf);
        t1p6sf.setText(t1player6scrf);
        t1p7sf.setText(t1player7scrf);
        t1p8sf.setText(t1player8scrf);
        t2p1sf.setText(t2player1scrf);
        t2p2sf.setText(t2player2scrf);
        t2p3sf.setText(t2player3scrf);
        t2p4sf.setText(t2player4scrf);
        t2p5sf.setText(t2player5scrf);
        t2p6sf.setText(t2player6scrf);
        t2p7sf.setText(t2player7scrf);
        t2p8sf.setText(t2player8scrf);

        team1.setText(teamOneString);
        team2.setText(teamTwoString);

        t1p1.setText(btbo);
        t1p2.setText(btio);
        t1p3.setText(btuo);
        t1p4.setText(btdo);
        t1p5.setText(btbeo);
        t1p6.setText(btao);
        t1p7.setText(btyo);
        t1p8.setText(btso);
        t2p1.setText(itbo);
        t2p2.setText(itio);
        t2p3.setText(ituo);
        t2p4.setText(itdo);
        t2p5.setText(itbeo);
        t2p6.setText(itao);
        t2p7.setText(ityo);
        t2p8.setText(itso);

    }
}
