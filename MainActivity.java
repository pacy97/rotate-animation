package com.example.Pacasian.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sumith on 16-10-2017.
 */

public class SimpleCamera extends AppCompatActivity {
    EditText ed1;
    Button btn,btn1,btn2,btn3,btn4;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_camera);
        btn=(Button)findViewById(R.id.btn);
        btn1=(Button)findViewById(R.id.btn1);
   
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ImageView imageView=(ImageView)findViewById(R.id.imv);
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
                imageView.startAnimation(animation);
            }
    });
         
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ImageView imageView=(ImageView)findViewById(R.id.imv);
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anti_clockwise);
                imageView.startAnimation(animation);
            }
    });
}
}
