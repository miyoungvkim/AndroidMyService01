package sample.app.android.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private Button start, stop;
    private static final String TAG = "KMI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "created");

        start = (Button) findViewById(R.id.buttonStart);
        stop = (Button) findViewById(R.id.buttonStop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == start) {
            Log.i(TAG, "stop button clicked");
            startService(new Intent(this, MyService.class));
        } else if (view == stop) {
            Log.i(TAG, "stop button clicked");
            stopService(new Intent(this, MyService.class));
        }

    }
}

