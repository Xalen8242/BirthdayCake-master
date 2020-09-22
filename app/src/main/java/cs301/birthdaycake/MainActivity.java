package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView retrieve = findViewById(R.id.cakeview);
        CakeController cakeControllerObject = new CakeController(retrieve);
        Button butt = findViewById(R.id.button);
        butt.setOnClickListener(cakeControllerObject);
        Switch candlesT = findViewById(R.id.Can);
        candlesT.setOnCheckedChangeListener(cakeControllerObject);
        SeekBar seekN = findViewById(R.id.seekBar);
        seekN.setOnSeekBarChangeListener(cakeControllerObject);
        retrieve.setOnTouchListener(cakeControllerObject);




    }
    public void goodbye(View button) {
        System.out.println("Goodbye");

    }

}
