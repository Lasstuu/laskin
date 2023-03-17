package main.laskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput1;
    private EditText numberInput2;
    private Button minus;
    private Button plus;
    private Button multiply;
    private Button distribute;
    private TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput1 = findViewById(R.id.editTextNumber1);
        numberInput2 = findViewById(R.id.editTextNumber2);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        multiply = findViewById(R.id.multiply);
        distribute = findViewById(R.id.distribute);
        output = findViewById(R.id.textView);

    }

    public void calculateMinus(View view){
        int number1 = Integer.parseInt(numberInput1.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        String result = String.valueOf(number1 - number2);
        output.setText(result);
    }
    public void calculatePlus(View view){
        int number1 = Integer.parseInt(numberInput1.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        String result = String.valueOf(number1 + number2);
        output.setText(result);
    }
    public void calculateMultiply(View view){
        int number1 = Integer.parseInt(numberInput1.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        String result = String.valueOf(number1 * number2);
        output.setText(result);
    }
    public void calculateDistribute(View view){
        int number1 = Integer.parseInt(numberInput1.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        String result = String.valueOf(number1 / number2);
        output.setText(result);
    }
}