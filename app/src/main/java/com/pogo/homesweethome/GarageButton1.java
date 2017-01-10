package com.pogo.homesweethome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class GarageButton1 extends AppCompatActivity {
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_button1);
        Switch onOffSwitch = (Switch)  findViewById(R.id.switch2);
        image = (ImageView) findViewById(R.id.imageView3) ;
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.v("Switch State=", ""+isChecked);
                if (isChecked==true)
                {
                    image.setImageResource(R.drawable.garage_open);
                }
                else if (isChecked==false)image.setImageResource(R.drawable.garage_closed);
            }

        });    }
}
