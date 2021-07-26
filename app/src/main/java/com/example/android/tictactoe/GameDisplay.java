package com.example.android.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameDisplay extends AppCompatActivity {

    private TicTacToeBoard ticTacToeBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);

        Button playAgainBtn = findViewById(R.id.playBtn);
        Button homeBtn = findViewById(R.id.homeBtn);
        TextView playerTurn = findViewById(R.id.player_display);

        String[] playerNames = getIntent().getStringArrayExtra("PLAYER_NAMES");

        playAgainBtn.setVisibility(View.INVISIBLE);
        homeBtn.setVisibility(View.INVISIBLE);

        if(playerNames != null){
            playerTurn.setText((playerNames[0] + "'s Turn"));
        }

        ticTacToeBoard = findViewById(R.id.ticTacToeBoard);

        ticTacToeBoard.setUpGame(playAgainBtn,homeBtn,playerTurn,playerNames);
    }

    public void homeActivity(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void playAgain(View view) {
        ticTacToeBoard.resetGame();
        ticTacToeBoard.invalidate();
    }
}