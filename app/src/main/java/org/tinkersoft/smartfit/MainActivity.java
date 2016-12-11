package org.tinkersoft.smartfit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private int seconds,minutes,hours;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate() has been initiated");
        text = (TextView)findViewById(R.id.welcome_text);
        text.setText("00:00:00");

        for(int i = 0; i<=10;i++){
            //text.setText("count:"+i);
        }

    }

    public void startTimer(View view){
        seconds+=1;
        text.setText("t="+seconds);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, NavigationDrawerActivity.class);
        startActivity(intent);
    }

}
