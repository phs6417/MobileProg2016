package com.example.bbakki.quickcoding1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = (TextView) findViewById(R.id.textView2) ;
        Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassName m = new ClassName();
                int a = m.getAverage();
                text.setText("The result :" + a);


            }
        });


        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassName2 m = new ClassName2();
                int a = m.getMinimum();
                text.setText("The result :" + a);
            }
        });


    }


    public class ClassName {
        public int getAverage() {
            int ave;
            ave = (1 + 5 + 9 + 3 + 22 + 12 )/ 6;
            return ave;

        }
    }
    public class ClassName2{
        public int getMinimum(){
            int min=3;

            return min;





        }


    }
}
