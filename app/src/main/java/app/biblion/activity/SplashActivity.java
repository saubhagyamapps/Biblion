package app.biblion.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import app.biblion.R;

public class SplashActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler = new Handler();

        final Runnable r = new Runnable() {
            public void run() {

                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
                handler.postDelayed(this, 2500);
            }
        };

        handler.postDelayed(r, 2500);
    }
}
