package ssong.android.com.test_map.data;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import ssong.android.com.test_map.R;

/**
 * Created by antaehyeong on 2017. 2. 4..
 */

public class MoonJong extends AppCompatActivity {

    ImageButton moontitle;
    ImageButton moontomb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_moonjong);


        // 문종화차 타이틀 링크
        moontitle = (ImageButton) this.findViewById(R.id.img_button_link_moon_title);
        moontitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moon = new Intent(Intent.ACTION_VIEW);
                moon.setData(Uri.parse("https://namu.wiki/w/%ED%99%94%EC%B0%A8#s-2.2.3"));
                startActivity(moon);
            }
        });

        // 문종 동구릉

        moontomb = (ImageButton) findViewById(R.id.img_button_link_moon_tomb);
        moontomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tomb = new Intent(Intent.ACTION_VIEW);
                tomb.setData(Uri.parse("https://namu.wiki/w/%EB%8F%99%EA%B5%AC%EB%A6%89"));
                startActivity(tomb);
            }
        });
    }
}
