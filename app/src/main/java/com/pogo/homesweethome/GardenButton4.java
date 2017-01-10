package com.pogo.homesweethome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class GardenButton4 extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden_button4);
        Switch onOffSwitch = (Switch)  findViewById(R.id.switch3);
        image = (ImageView) findViewById(R.id.imageView4) ;
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.v("Switch State=", ""+isChecked);
                if (isChecked==true)
                {
                    image.setImageResource(R.drawable.sprinkler_on);
                }
                else if (isChecked==false){
                    image.setImageResource(R.drawable.sprinkler_off);
                }
            }

        });    }


}
