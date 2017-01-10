package com.pogo.homesweethome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class GardenButton2 extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden_button2);
        Switch onOffSwitch = (Switch)  findViewById(R.id.switch1);
        image = (ImageView) findViewById(R.id.imageView2) ;
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.v("Switch State=", ""+isChecked);
                if (isChecked==true)
                {
                    image.setImageResource(R.drawable.light_on);
                }
                else if (isChecked==false)image.setImageResource(R.drawable.light_off);
            }

        });    }
}
