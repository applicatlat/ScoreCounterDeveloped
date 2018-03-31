package com.leventalahan.android.developedcounter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.app.AlertDialog.Builder;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String teamNameOne;
    public String teamNameTwo;
    public String tOpO;
    public String tOpT;
    public String tOpTh;
    public String tOpF;
    public String tOpFi;
    public String tOpS;
    public String tOpSe;
    public String tOpEg;
    public String tTpO;
    public String tTpT;
    public String tTpTh;
    public String tTpF;
    public String tTpFi;
    public String tTpS;
    public String tTpSe;
    public String tTpEg;
    RadioButton hS,cL,nba;
    public String chronom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view) {

        EditText teamOne = findViewById(R.id.teamOne);
        teamNameOne = teamOne.getText().toString();

        String nameError1 = "Type a Name for Team 1";

        if (teamNameOne.matches("")) {
            Toast.makeText(this, nameError1, Toast.LENGTH_SHORT).show();
            return;
        }
        EditText tOpOne = findViewById(R.id.tOnePlayerOne);
        tOpO = tOpOne.getText().toString();

        String tOpOError = "Type a Name, if no ones playing 'Non', for Team 1 Player 1";

        if (tOpO.matches("")) {
            Toast.makeText(this, tOpOError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tOpTwo = findViewById(R.id.tOnePlayerTwo);
        tOpT = tOpTwo.getText().toString();

        String tOpTError = "Type a Name, if no ones playing 'Non', for Team 1 Player 2";

        if (tOpT.matches("")) {
            Toast.makeText(this, tOpTError, Toast.LENGTH_LONG).show();
            return;
        }

        EditText tOpThe = findViewById(R.id.tOnePlayerThree);
        tOpTh = tOpThe.getText().toString();

        String tOpThError = "Type a Name, if no ones playing 'Non', for Team 1 Player 3";

        if (tOpTh.matches("")) {
            Toast.makeText(this, tOpThError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tOpFo = findViewById(R.id.tOnePlayerFour);
        tOpF = tOpFo.getText().toString();

        String tOpFError = "Type a Name, if no ones playing 'Non', for Team 1 Player 4";

        if (tOpF.matches("")) {
            Toast.makeText(this, tOpFError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tOpFiv = findViewById(R.id.tOnePlayerFive);
        tOpFi = tOpFiv.getText().toString();

        String tOpFiError = "Type a Name, if no ones playing 'Non', for Team 1 Player 5";

        if (tOpFi.matches("")) {
            Toast.makeText(this, tOpFiError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tOpSi = findViewById(R.id.tOnePlayerSix);
        tOpS = tOpSi.getText().toString();

        String tOpSError = "Type a Name, if no ones playing 'Non', for Team 1 Substitute Player 1";

        if (tOpS.matches("")) {
            Toast.makeText(this, tOpSError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tOpSev = findViewById(R.id.tOnePlayerSeven);
        tOpSe = tOpSev.getText().toString();

        String tOpSeError = "Type a Name, if no ones playing 'Non', for Team 1 Substitute Player 2";

        if (tOpSe.matches("")) {
            Toast.makeText(this, tOpSeError, Toast.LENGTH_LONG).show();
            return;
        }

        EditText tOpEgI = findViewById(R.id.tOnePlayerEight);
        tOpEg = tOpEgI.getText().toString();

        String tOpEgError = "Type a Name, if no ones playing 'Non', for Team 1 Substitute Player 3";

        if (tOpEg.matches("")) {
            Toast.makeText(this, tOpEgError, Toast.LENGTH_LONG).show();
            return;
        }

        String nameError2 = "Type a Name for Team 2";

        EditText teamTwo = findViewById(R.id.teamTwo);
        teamNameTwo = teamTwo.getText().toString();

        if (teamNameTwo.matches("")) {
            Toast.makeText(this, nameError2, Toast.LENGTH_SHORT).show();
            return;
        }

        EditText tTpOne = findViewById(R.id.tTwoPlayerOne);
        tTpO = tTpOne.getText().toString();

        String tTpOError = "Type a Name, if no ones playing 'Non', for Team 2 Player 1";

        if (tTpO.matches("")) {
            Toast.makeText(this, tTpOError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tTpTwo = findViewById(R.id.tTwoPlayerTwo);
        tTpT = tTpTwo.getText().toString();

        String tTpTError = "Type a Name, if no ones playing 'Non', for Team 2 Player 2";

        if (tTpT.matches("")) {
            Toast.makeText(this, tTpTError, Toast.LENGTH_LONG).show();
            return;
        }

        EditText tTpThe = findViewById(R.id.tTwoPlayerThree);
        tTpTh = tTpThe.getText().toString();

        String tTpThError = "Type a Name, if no ones playing 'Non', for Team 2 Player 3";

        if (tTpTh.matches("")) {
            Toast.makeText(this, tTpThError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tTpFo = findViewById(R.id.tTwoPlayerFour);
        tTpF = tTpFo.getText().toString();

        String tTpFError = "Type a Name, if no ones playing 'Non', for Team 2 Player 4";

        if (tTpF.matches("")) {
            Toast.makeText(this, tTpFError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tTpFiv = findViewById(R.id.tTwoPlayerFive);
        tTpFi = tTpFiv.getText().toString();

        String tTpFiError = "Type a Name, if no ones playing 'Non', for Team 2 Player 5";

        if (tTpFi.matches("")) {
            Toast.makeText(this, tTpFiError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tTpSi = findViewById(R.id.tTwoPlayerSix);
        tTpS = tTpSi.getText().toString();

        String tTpSError = "Type a Name, if no ones playing 'Non', for Team 2 Substitute Player 1";

        if (tTpS.matches("")) {
            Toast.makeText(this, tTpSError, Toast.LENGTH_LONG).show();
            return;
        }
        EditText tTpSev = findViewById(R.id.tTwoPlayerSeven);
        tTpSe = tTpSev.getText().toString();

        String tTpSeError = "Type a Name, if no ones playing 'Non', for Team 2 Substitute Player 2";

        if (tTpSe.matches("")) {
            Toast.makeText(this, tTpSeError, Toast.LENGTH_LONG).show();
            return;
        }

        EditText tTpEgI = findViewById(R.id.tTwoPlayerEight);
        tTpEg = tTpEgI.getText().toString();

        String tTpEgError = "Type a Name, if no ones playing 'Non', for Team 2 Substitute Player 3";

        if (tTpEg.matches("")) {
            Toast.makeText(this, tTpEgError, Toast.LENGTH_LONG).show();
            return;
        }
         hS =  findViewById(R.id.highSchool);
         cL = findViewById(R.id.college);
         nba = findViewById(R.id.nba);

        String checkHsError = "Choose one rule. HighSchool, College or NBA";

        if((hS.isChecked() == false) && (cL.isChecked() == false) && (nba.isChecked() == false)) {
            Toast.makeText(this, checkHsError, Toast.LENGTH_LONG).show();
            return;
        }

        if(hS.isChecked()){
            chronom = "8 mins / 4 quarters";
        }
        if(cL.isChecked()){
            chronom = "20 mins / 2 halves";
        }
        if(nba.isChecked()){
            chronom = "12 mins / 4 quarters";
        }

        String control = "Do you want to continue?";
        String yes = "Yes";
        String no = "No";
        String dialogBoxTitle = "Final Check";

        if ((teamNameOne.matches("") == false) && (teamNameTwo.matches("") == false)
                && (tOpO.matches("") == false) && (tOpT.matches("") == false)
                && (tOpTh.matches("") == false) && (tOpF.matches("") == false)
                && (tOpFi.matches("") == false)  && (tOpS.matches("") == false)
                && (tOpSe.matches("") == false) && (tOpEg.matches("") == false)
                && (tTpO.matches("") == false) && (tTpT.matches("") == false)
                && (tTpTh.matches("") == false) && (tTpF.matches("") == false)
                && (tTpFi.matches("") == false)  && (tTpS.matches("") == false)
                && (tTpSe.matches("") == false) && (tTpEg.matches("") == false))



        {

            AlertDialog.Builder yesNo = new AlertDialog.Builder(MainActivity.this, R.style.DialogTheme);
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

                            EditText birinciTakim = (EditText) findViewById(R.id.teamOne);
                            EditText ikinciTakim = (EditText) findViewById(R.id.teamTwo);
                            EditText t1p1 = (EditText) findViewById(R.id.tOnePlayerOne);
                            EditText t1p2 = (EditText) findViewById(R.id.tOnePlayerTwo);
                            EditText t1p3 = (EditText) findViewById(R.id.tOnePlayerThree);
                            EditText t1p4 = (EditText) findViewById(R.id.tOnePlayerFour);
                            EditText t1p5 = (EditText) findViewById(R.id.tOnePlayerFive);
                            EditText t1p6 = (EditText) findViewById(R.id.tOnePlayerSix);
                            EditText t1p7 = (EditText) findViewById(R.id.tOnePlayerSeven);
                            EditText t1p8 = (EditText) findViewById(R.id.tOnePlayerEight);
                            EditText t2p1 = (EditText) findViewById(R.id.tTwoPlayerOne);
                            EditText t2p2 = (EditText) findViewById(R.id.tTwoPlayerTwo);
                            EditText t2p3 = (EditText) findViewById(R.id.tTwoPlayerThree);
                            EditText t2p4 = (EditText) findViewById(R.id.tTwoPlayerFour);
                            EditText t2p5 = (EditText) findViewById(R.id.tTwoPlayerFive);
                            EditText t2p6 = (EditText) findViewById(R.id.tTwoPlayerSix);
                            EditText t2p7 = (EditText) findViewById(R.id.tTwoPlayerSeven);
                            EditText t2p8 = (EditText) findViewById(R.id.tTwoPlayerEight);

// reference for passing strings https://stackoverflow.com/questions/18481516/passing-string-from-edit-text-to-another-activity

                            Intent intent = new Intent(MainActivity.this, CounterActivity.class);

                            intent.putExtra("teamOne", birinciTakim.getText().toString());
                            intent.putExtra("teamTwo",ikinciTakim.getText().toString());
                            intent.putExtra("t1p1",t1p1.getText().toString());
                            intent.putExtra("t1p2",t1p2.getText().toString());
                            intent.putExtra("t1p3",t1p3.getText().toString());
                            intent.putExtra("t1p4",t1p4.getText().toString());
                            intent.putExtra("t1p5",t1p5.getText().toString());
                            intent.putExtra("t1p6",t1p6.getText().toString());
                            intent.putExtra("t1p7",t1p7.getText().toString());
                            intent.putExtra("t1p8",t1p8.getText().toString());
                            intent.putExtra("t2p1",t2p1.getText().toString());
                            intent.putExtra("t2p2",t2p2.getText().toString());
                            intent.putExtra("t2p3",t2p3.getText().toString());
                            intent.putExtra("t2p4",t2p4.getText().toString());
                            intent.putExtra("t2p5",t2p5.getText().toString());
                            intent.putExtra("t2p6",t2p6.getText().toString());
                            intent.putExtra("t2p7",t2p7.getText().toString());
                            intent.putExtra("t2p8",t2p8.getText().toString());
                            intent.putExtra("chronom",chronom);

                            SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPref.edit();
                            editor.putString("teamNameOne", teamNameOne);
                            editor.putString("teamNameTwo", teamNameTwo);
                            editor.putString("team1Player1", tOpO);
                            editor.putString("team1Player2", tOpT);
                            editor.putString("team1Player3", tOpTh);
                            editor.putString("team1Player4", tOpF);
                            editor.putString("team1Player5", tOpFi);
                            editor.putString("team1Player6", tOpS);
                            editor.putString("team1Player7", tOpSe);
                            editor.putString("team1Player8", tOpEg);
                            editor.putString("team2Player1", tTpO);
                            editor.putString("team2Player2", tTpT);
                            editor.putString("team2Player3", tTpTh);
                            editor.putString("team2Player4", tTpF);
                            editor.putString("team2Player5", tTpFi);
                            editor.putString("team2Player6", tTpS);
                            editor.putString("team2Player7", tTpSe);
                            editor.putString("team2Player8", tTpEg);

                            editor.apply();

                            startActivity(intent);

                        }
                    });

            AlertDialog alert = yesNo.create();
            alert.setTitle(dialogBoxTitle);
            alert.show();

        }
    }
    public void submit1 (View view){
        SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        String teamNameOne = sharedPref.getString("teamNameOne", "");
        String teamNameTwo = sharedPref.getString("teamNameTwo", "");
        String tonepone = sharedPref.getString("team1Player1", "");
        String toneptwo = sharedPref.getString("team1Player2", "");
        String tonepthe = sharedPref.getString("team1Player3", "");
        String tonepfou = sharedPref.getString("team1Player4", "");
        String tonepfiv = sharedPref.getString("team1Player5", "");
        String tonepsix = sharedPref.getString("team1Player6", "");
        String tonepsev = sharedPref.getString("team1Player7", "");
        String tonepegi = sharedPref.getString("team1Player8", "");
        String ttwopone = sharedPref.getString("team2Player1", "");
        String ttwoptwo = sharedPref.getString("team2Player2", "");
        String ttwopthe = sharedPref.getString("team2Player3", "");
        String ttwopfou = sharedPref.getString("team2Player4", "");
        String ttwopfiv = sharedPref.getString("team2Player5", "");
        String ttwopsix = sharedPref.getString("team2Player6", "");
        String ttwopsev = sharedPref.getString("team2Player7", "");
        String ttwopegi = sharedPref.getString("team2Player8", "");
        EditText teamOne = findViewById(R.id.teamOne);
        EditText tOpOne = findViewById(R.id.tOnePlayerOne);
        EditText tOpTwo = findViewById(R.id.tOnePlayerTwo);
        EditText tOpThe = findViewById(R.id.tOnePlayerThree);
        EditText tOpFo = findViewById(R.id.tOnePlayerFour);
        EditText tOpFiv = findViewById(R.id.tOnePlayerFive);
        EditText tOpSi = findViewById(R.id.tOnePlayerSix);
        EditText tOpSev = findViewById(R.id.tOnePlayerSeven);
        EditText tOpEgI = findViewById(R.id.tOnePlayerEight);
        EditText teamTwo = findViewById(R.id.teamTwo);
        EditText tTpOne = findViewById(R.id.tTwoPlayerOne);
        EditText tTpTwo = findViewById(R.id.tTwoPlayerTwo);
        EditText tTpThe = findViewById(R.id.tTwoPlayerThree);
        EditText tTpFo = findViewById(R.id.tTwoPlayerFour);
        EditText tTpFiv = findViewById(R.id.tTwoPlayerFive);
        EditText tTpSi = findViewById(R.id.tTwoPlayerSix);
        EditText tTpSev = findViewById(R.id.tTwoPlayerSeven);
        EditText tTpEgI = findViewById(R.id.tTwoPlayerEight);
        teamOne.setText(teamNameOne);
        teamTwo.setText(teamNameTwo);
        tOpOne.setText(tonepone);
        tOpTwo.setText(toneptwo);
        tOpThe.setText(tonepthe);
        tOpFo.setText(tonepfou);
        tOpFiv.setText(tonepfiv);
        tOpSi.setText(tonepsix);
        tOpSev.setText(tonepsev);
        tOpEgI.setText(tonepegi);
        tTpOne.setText(ttwopone);
        tTpTwo.setText(ttwoptwo);
        tTpThe.setText(ttwopthe);
        tTpFo.setText(ttwopfou);
        tTpFiv.setText(ttwopfiv);
        tTpSi.setText(ttwopsix);
        tTpSev.setText(ttwopsev);
        tTpEgI.setText(ttwopegi);
    }
}
