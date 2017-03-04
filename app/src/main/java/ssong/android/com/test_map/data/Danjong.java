package ssong.android.com.test_map.data;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import ssong.android.com.test_map.R;

/**
 * Created by antaehyeong on 2017. 2. 4..
 */

public class Danjong extends AppCompatActivity{

    ImageButton umm;
    ImageButton exile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_danjong);

        //단종 유배지
        exile = (ImageButton) this.findViewById(R.id.img_button_link_dan_exile);
        exile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dan = new Intent(Intent.ACTION_VIEW);
                dan.setData(Uri.parse("http://terms.naver.com/entry.nhn?docId=947995&cid=42865&categoryId=42865"));
                startActivity(dan);
            }
        });


        // 엄흥도 링크
        umm = (ImageButton) this.findViewById(R.id.img_button_link_dan_umheungdo);
        umm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dan = new Intent(Intent.ACTION_VIEW);
                dan.setData(Uri.parse("https://ko.wikipedia.org/wiki/%EC%97%84%ED%9D%A5%EB%8F%84"));
                startActivity(dan);
            }
        });

    }
}
