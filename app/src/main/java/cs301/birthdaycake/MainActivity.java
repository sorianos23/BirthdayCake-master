package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.SurfaceView;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //get CakeView reference and use it to create a CakeController
        CakeView cView = findViewById(R.id.cakeview);
        CakeController cController = new CakeController(cView);

        Button bo = findViewById(R.id.bobutton);
        bo.setOnClickListener(cController);

        Switch c = findViewById(R.id.cswitch);
        c.setOnCheckedChangeListener(cController);

        SeekBar candels = findViewById(R.id.cseekBar);;
        candels.setOnSeekBarChangeListener(cController);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }

}
