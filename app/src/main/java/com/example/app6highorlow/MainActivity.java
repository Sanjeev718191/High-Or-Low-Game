package com.example.app6highorlow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNum;
    public void generateRangomNum(){
        Random r = new Random();
        randomNum = r.nextInt(30)+1;
    }
    public void guessNumber(View view){

        EditText enteredNum = (EditText) findViewById(R.id.editTextNumber);
        int num = Integer.parseInt(enteredNum.getText().toString());
        String message ;
        if(randomNum > num)
            message = "Higher!";
        else if(randomNum < num)
            message = "Lower";
        else {
            message = "You Got it! Try again!";
            generateRangomNum();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.i("Info", "Random Num "+randomNum);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRangomNum();
    }
}