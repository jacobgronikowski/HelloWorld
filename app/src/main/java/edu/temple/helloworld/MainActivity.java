package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button = findViewById(R.id.button);

        myOnClickListener onClickListener = new myOnClickListener();
        button.setOnClickListener(onClickListener);



    }
    public class myOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            TextView tv;
            tv = findViewById(R.id.textView);
            tv.setText("You have clicked the button");
        }
    }

}