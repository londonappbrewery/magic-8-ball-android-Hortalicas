package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button;
        ask_button = (Button) findViewById(R.id.button_ask);

        final ImageView ball = (ImageView) findViewById(R.id.Ball);

        final int[] ballArray =
                {
                        R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                        R.drawable.ball4, R.drawable.ball5, R.drawable.ball6
                };

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Ball Button Action","Button was pressed - Ok Message"); // Log message for debug.

                Random ballNumber = new Random();
                int number = ballNumber.nextInt(6);                             // Generates a random number and assigns it to ballNumber , 0-5

                Log.d("Ball Number","Button was pressed - Number generated : " + number); // Log message for debug.

                ball.setImageResource(ballArray[number]);                              // Sets the number generated for the ball resurce from the array
            }
        });
    }
}
