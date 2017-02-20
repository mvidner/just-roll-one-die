package net.vidner.justrollonedie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean paddingAtLeft = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // A random number in the interval [lower, upper)
    // That is, NOT including the upper bound
    protected int random(int lower, int upper) {
        return lower + (int) (Math.random() * (upper - lower));
    }

    public void roll(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);

        int rolled_i = random(1, 7);
        String rolled_s = String.valueOf(rolled_i);

        // we make the resulting number "jump" back and forth
        // to indicate that we did roll a new number
        // even if it comes out the same
        if (paddingAtLeft) {
            rolled_s = "   " + rolled_s;
        }
        else {
            rolled_s = rolled_s + "   ";
        }
        paddingAtLeft = ! paddingAtLeft;

        tv.setText(String.valueOf(rolled_s));
    }

}
