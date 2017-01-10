package com.pogo.homesweethome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class GarageButton1 extends AppCompatActivity {
ImageView image;
    RadioButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_button1);
        Switch onOffSwitch = (Switch)  findViewById(R.id.switch2);
        image = (ImageView) findViewById(R.id.imageView3) ;
        button = (RadioButton) findViewById(R.id.radioButton);
        button.setEnabled(false);

        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.v("Switch State=", ""+isChecked);
                if (isChecked==true)
                {
                    image.setImageResource(R.drawable.garage_open);
                    button.setEnabled(true);
                    button.setChecked(false);
                }
                else if (isChecked==false){
                    image.setImageResource(R.drawable.garage_closed);
                    button.setEnabled(false);
                    button.setChecked(false);
                }
            }

        });    }
    public void Radioclick(View v){
        Toast.makeText(this, "Auto doors closure turned on",
                Toast.LENGTH_LONG).show();
    }

}
