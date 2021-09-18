package com.example.newcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnNull;
    Button btnNulll;
    Button btnTitik;
    Button btnMinus;
    Button btnPlus;
    Button btnKali;
    Button btnBagi;
    Button btnModulus;
    Button btnC;
    Button btnX;
    Button btnResult;
    TextView textViewResult;
    TextView textViewInput;
    String text;
    String result;
    boolean dot_inserted;
    boolean operator_inserted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = "";
        result = "";
        dot_inserted = false;
        operator_inserted = false;

        btnOne = (Button)findViewById(R.id.btnOne);
        btnTwo = (Button)findViewById(R.id.btnTwo);
        btnThree = (Button)findViewById(R.id.btnThree);
        btnFour = (Button)findViewById(R.id.btnFour);
        btnFive = (Button)findViewById(R.id.btnFive);
        btnSix = (Button)findViewById(R.id.btnSix);
        btnSeven = (Button)findViewById(R.id.btnSeven);
        btnEight = (Button)findViewById(R.id.btnEight);
        btnNine = (Button)findViewById(R.id.btnNine);
        btnNull = (Button)findViewById(R.id.btnNull);
        btnNulll = (Button)findViewById(R.id.btnNulll);
        btnTitik =  (Button)findViewById(R.id.btnTitik);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnKali = (Button)findViewById(R.id.btnKali);
        btnBagi = (Button)findViewById(R.id.btnBagi);
        btnModulus = (Button)findViewById(R.id.btnModulus);
        btnC = (Button)findViewById(R.id.btnC);
        btnX = (Button) findViewById(R.id.btnX);
        btnResult = (Button)findViewById(R.id.btnResult);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        textViewInput = (TextView) findViewById(R.id.textViewInput);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"9");
            }
        });

        btnNull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"0");
            }
        });

        btnNulll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+"000");
            }
        });

        btnTitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                textViewInput.setText(text+".");
            }
        });


        btnTitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                if (text.isEmpty()){
                    text = "0.";
                    dot_inserted = true;
                }

                if (dot_inserted == false) {
                    text = text + ".";
                    dot_inserted = true;
                }

                textViewInput.setText(text);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " - ";
                        operator_inserted = true;
                    }
                }
                textViewInput.setText(text);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " + ";
                        operator_inserted = true;
                    }
                }
                textViewInput.setText(text);
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " * ";
                        operator_inserted = true;
                    }
                }
                textViewInput.setText(text);
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " / ";
                        operator_inserted = true;
                    }
                }
                textViewInput.setText(text);
            }
        });

        btnModulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " % ";
                        operator_inserted = true;
                    }
                }
                textViewInput.setText(text);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewInput.setText("");
                textViewResult.setText("");
                dot_inserted = false;
                operator_inserted = false;
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textViewInput.getText().toString();
                backspace();
                textViewInput.setText(text);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textViewInput.getText().toString();
                text = textViewInput.getText().toString();
                if (operator_inserted == true && !text.substring(text.length()-1, text.length()).equals(" ")) {
                    String [] tokens = text.split(" ");
                    switch (tokens[1].charAt(0)) {
                        case '+' :
                            result = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;

                        case '-' :
                            result = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;

                        case '*' :
                            result = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;

                        case '/' :
                            result = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;

                        case '%' :
                            result = Double.toString(Double.parseDouble(tokens[0]) % Double.parseDouble(tokens[2]));
                            break;
                    }
                    textViewResult.setText(result);
                }
            }
        });
    }
    public void threeOnClick(View view) {
        text = textViewInput.getText().toString();
        textViewInput.setText(text+"3");
    }

    public void backspace(){
        if (!text.isEmpty()) {
            if (text.substring(text.length()-1, text.length()).equals(".")) {
                dot_inserted = false;
            }

            if (text.substring(text.length()-1, text.length()).equals(" ")) {
                text = text.substring(0, text.length()-3);
                operator_inserted = false;
            }else {
                text = text.substring(0, text.length()-1);
            }
        }
    }
}
