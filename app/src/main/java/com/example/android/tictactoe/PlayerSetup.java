package com.example.android.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText Player1,Player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup);

        Player1 = findViewById(R.id.player1);
        Player2 = findViewById(R.id.player2);

    }

    public void submitNames(View view) {
        String player1Name = Player1.getText().toString();
        String player2Name = Player2.getText().toString();

        Intent i = new Intent(this , GameDisplay.class);
        i.putExtra( "PLAYER_NAMES",new String[] {player1Name,player2Name});
        startActivity(i);
    }
}