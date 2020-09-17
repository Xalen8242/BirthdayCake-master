package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener,  CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeObject;
    private CakeModel cakeModelObject;

    public CakeController(CakeView object){

        this.cakeObject = object;
        cakeModelObject = this.cakeObject.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        cakeModelObject.candlesLit = false;
        cakeObject.invalidate();
        Log.d("CakeController", "FINd it");

    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModelObject.hasCandles = b;
        cakeObject.invalidate();
        Log.d("CakeController", "FINd it");

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModelObject.candlesNum = i;
        cakeObject.invalidate();



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
