package com.pogo.homesweethome;


import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashScreen extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);


        new PrefetchData().execute();

    }


    private class PrefetchData extends AsyncTask<Void, Void, Void> {


        protected void onPreExecute() {
            super.onPreExecute();


        }

        @Override
        protected Void doInBackground(Void... arg0) {
            /*
            dzialania w tle, ladowanko ,
            pobieranie danych z serwera itp.
             */

            //to taka symulacja że coś się dzieje,
            //jak dodamy pobieranie danych to try-catch leci do kosza
            try {
Thread.sleep(1500);

            }catch (Exception e){

            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // jak skonczylismy pobierac to lecimy do mainactivity
            Intent i = new Intent(SplashScreen.this, LoginActivity.class);
            SplashScreen.this.startActivity(i);
            SplashScreen.this.finish();
        }

    }
}
