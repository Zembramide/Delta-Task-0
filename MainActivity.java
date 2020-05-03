package com.example.delta1;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.widget.Toast;

import java.util.Random;



public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void confirm_click(View view) {


        EditText et1 = findViewById(R.id.editText1);

        if (et1.getText().toString().equals("0")) {
            et1.setError("Enter Valid Input");
        }
        else if (et1.length()==0){
            et1.setError("Enter Valid Input");
        }
        else if (et1.getText().toString().equals("1")){
            et1.setError("Put Bigger Number");
        }
        else if (et1.getText().toString().equals("2")) {
            et1.setError("Put Higher Number");
        }

        else {
            int a = Integer.parseInt(String.valueOf(et1.getText()));
            Button b1 = findViewById(R.id.button2);
            Button b2 = findViewById(R.id.button3);
            Button b3 = findViewById(R.id.button4);
            b1.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);

            Random random = new Random();
            int o1 =-1;
            int o2 =-1;
            int o3 =-1;

            while ((a % o1) != 0 || o1 == -1) {
                if (o1==0){
                    Toast var = Toast.makeText(MainActivity.this, "Click Again", Toast.LENGTH_SHORT);
                    var.show();
                }
                else {
                    o1 = random.nextInt(a-1)+1;
                }

            }
            while ((a % o2) == 0 || o2 == -1) {
                if (o2==0){
                    Toast var = Toast.makeText(MainActivity.this, "Click Again", Toast.LENGTH_SHORT);
                    var.show();
                }
                else {
                    o2 = random.nextInt(a-1)+1;
                }
            }
            while ((a % o3) == 0 || o3 == -1) {
                if (o3==0){
                    Toast var = Toast.makeText(MainActivity.this, "Click Again", Toast.LENGTH_SHORT);
                    var.show();
                }
                else {
                    o3 = random.nextInt(a-1)+1;
                }
            }
            b1.setText("" + o1);
            b2.setText("" + o2);
            b3.setText("" + o3);

        }
    }

    public void option1(View view) {


        EditText et1 = findViewById(R.id.editText1);
        Button b1 = findViewById(R.id.button2);

        if (et1.length() == 0) {
            b1.setError("Invalid Action");
        } else {
            b1.setError(null);
            int a = Integer.parseInt(String.valueOf(et1.getText()));
            int a1 = Integer.parseInt(String.valueOf(b1.getText()));
            TextView r1 = findViewById(R.id.result);
            TextView r2 = findViewById(R.id.result2);
            if (a % a1 == 0) {
                r1.setText("Answer 1 is correct");
                r1.setTextColor(Color.GREEN);
                b1.setBackgroundColor(Color.GREEN);
            } else {
                r1.setText("Answer 1 is incorrect");
                r2.setText("Choose Another Option");
                r1.setTextColor(Color.RED);
                b1.setBackgroundColor(Color.RED);
            }


        }


    }

    public void option2(View view) {

        EditText et1 = findViewById(R.id.editText1);
        Button b2 = findViewById(R.id.button3);

        if (et1.length() == 0) {
            b2.setError("Invalid Action");
        }

        else {
            b2.setError(null);
            int a = Integer.parseInt(String.valueOf(et1.getText()));
            int a2 = Integer.parseInt(String.valueOf(b2.getText()));
            TextView r3 = findViewById(R.id.result);
            TextView r4 = findViewById(R.id.result2);
            if (a % a2 == 0) {
                r3.setText("Answer 2 is correct");
                r3.setTextColor(Color.GREEN);
                b2.setBackgroundColor(Color.GREEN);
            } else {
                r3.setText("Answer 2 is incorrect");
                r3.setTextColor(Color.RED);
                r4.setText("Choose Another Option");
                b2.setBackgroundColor(Color.RED);

            }

        }
    }

    public void option3(View view) {

        EditText et1 = findViewById(R.id.editText1);
        Button b3 = findViewById(R.id.button4);

        if (et1.length() == 0) {
            b3.setError("Invalid Action");
        } else {

            b3.setError(null);
            int a = Integer.parseInt(String.valueOf(et1.getText()));
            int a3 = Integer.parseInt(String.valueOf(b3.getText()));
            TextView r5 = findViewById(R.id.result);
            TextView r6 = findViewById(R.id.result2);
            if (a % a3 == 0) {
                r5.setText("Answer 3 is correct");
                r5.setTextColor(Color.GREEN);
                b3.setBackgroundColor(Color.GREEN);
            } else {
                r5.setText("Answer 3 is incorrect");
                r6.setText("Choose Another Option");
                r5.setTextColor(Color.RED);
                b3.setBackgroundColor(Color.RED);
            }


        }
    }

    public void clear(View view){

        TextView t1 = findViewById(R.id.result);
        TextView t2 = findViewById(R.id.result2);
        EditText et1 = findViewById(R.id.editText1);
        Button b1 = findViewById(R.id.button2);
        Button b2 = findViewById(R.id.button3);
        Button b3 = findViewById(R.id.button4);
        b1.setError(null);
        b2.setError(null);
        b3.setError(null);
        et1.getText().clear();
        t1.setText("RESULT");
        t2.setText("");
        t1.setTextColor(Color.BLACK);
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
    }
}














