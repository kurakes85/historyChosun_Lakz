package ssong.android.com.test_map.splash;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import ssong.android.com.test_map.R;

/**
 * Created by antaehyeong on 2017. 1. 30..
 * Splash Screen class.
 */

public class SplashScreen extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_first);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },3000);
    }
}
