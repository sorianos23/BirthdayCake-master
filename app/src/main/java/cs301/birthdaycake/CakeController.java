package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener,
                                        CompoundButton.OnCheckedChangeListener,
                                        SeekBar.OnSeekBarChangeListener {

    private CakeView cakeV;
    private CakeModel cakeM;

    /* ctor expects to recieve a reference to a CakeView object.
       This reference is used to initialized the private instance variable.
     */
    public CakeController(CakeView cv)
    {
        cakeV = cv;
        cakeM = cakeV.getCakeModel();
    }


    @Override //button
    public void onClick(View v)
    {
        this.cakeM.litCandles = false;
        this.cakeV.invalidate();
    }

    @Override //switch
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b == false){
            this.cakeM.hasCandles = false;
        }
        else{
            this.cakeM.hasCandles = true;
        }
        this.cakeV.invalidate();
    }

    @Override //seekBar
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeM.numCandles = i;
        this.cakeV.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //method not required
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //method not required
    }
}
