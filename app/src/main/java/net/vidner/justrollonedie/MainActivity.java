package net.vidner.justrollonedie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void roll(View view) {
        int rolled_i = 1 + (int) (Math.random() * 6);

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(String.valueOf(rolled_i));
    }

}
