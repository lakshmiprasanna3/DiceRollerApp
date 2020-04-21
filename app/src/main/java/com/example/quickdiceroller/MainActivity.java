package com.example.quickdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonviewdicy;
    private Random myRandomNumber = new Random();

    private ImageView imageviewdicy1;
    private ImageView imageviewdicy2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageviewdicy1 = findViewById(R.id.imageView2);
        imageviewdicy2 = findViewById(R.id.imageView3);
        buttonviewdicy = findViewById(R.id.button1);
        buttonviewdicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollOurDice();
            }
        });


    }

        private  void rollOurDice(){

        int myRanNumber1 = myRandomNumber.nextInt(6)+1;
        int myRanNumber2 = myRandomNumber.nextInt(6)+1;


        switch (myRanNumber1){

            case 1:
                imageviewdicy1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageviewdicy1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageviewdicy1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageviewdicy1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageviewdicy1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageviewdicy1.setImageResource(R.drawable.dice6);
                break;




        }

            switch (myRanNumber2){

                case 1:
                    imageviewdicy2.setImageResource(R.drawable.dice1);
                    break;
                case 2:
                    imageviewdicy2.setImageResource(R.drawable.dice2);
                    break;
                case 3:
                    imageviewdicy2.setImageResource(R.drawable.dice3);
                    break;
                case 4:
                    imageviewdicy2.setImageResource(R.drawable.dice4);
                    break;
                case 5:
                    imageviewdicy2.setImageResource(R.drawable.dice5);
                    break;
                case 6:
                    imageviewdicy2.setImageResource(R.drawable.dice6);
                    break;




            }




        }















}
