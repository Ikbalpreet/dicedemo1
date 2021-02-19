package com.example.dicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we have two images left dice and right dice
        // link the code to those two image view inside your layout.....(activity main)
        final ImageView leftDie = findViewById(R.id.Left_dice);
        final ImageView rightDie = findViewById(R.id.right_dice);
        Button rollButtonH = findViewById(R.id.btnHigher);
        Button rollButtonL = findViewById(R.id.btnLower);
        final TextView txt = findViewById(R.id.txtResult);
        //-------------------------------------------------------------------

        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        // we want to pick one of the dices in array randomly and replace it with left and right
        // image view inside your app!
        // Click listener look for an event on your view components.
        rollButtonH.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Random rand = new Random();
               int randLeftDie = rand.nextInt(6);
               int randRightDie = rand.nextInt(6);
               Log.d("left die",String.valueOf(randLeftDie));
               Log.d("right die",String.valueOf(randRightDie));


               leftDie.setImageResource(diceArray[randLeftDie]);
               rightDie.setImageResource(diceArray[randRightDie]);
               if(randLeftDie>randRightDie)
               {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("USER WIN!");
               }
               else if(randLeftDie<randRightDie)
               {
                   txt.setVisibility(View.VISIBLE);
                   txt.setText("COMPUTER WIN!");
               }
               else if(randLeftDie==randRightDie)
               {
                   txt.setVisibility(View.VISIBLE);
                   txt.setText("IT'S A TIE");
               }


           }
       });

        // Click listener look for an event on your view components.
        rollButtonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int randLeftDie = rand.nextInt(6);
                int randRightDie = rand.nextInt(6);
                Log.d("left die",String.valueOf(randLeftDie));
                Log.d("right die",String.valueOf(randRightDie));

                leftDie.setImageResource(diceArray[randLeftDie]);
                rightDie.setImageResource(diceArray[randRightDie]);

                if(randLeftDie<randRightDie)
                {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("USER WIN!");
                }
                else if(randLeftDie>randRightDie)
                {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("COMPUTER WIN!");
                }
                else if(randLeftDie==randRightDie)
                {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("IT'S A TIE");
                }

            }
        });
    }



}
