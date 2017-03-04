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
 * 태종 이방원 관련 클래스
 */

public class TaeJong extends AppCompatActivity {
    ImageButton title;
    ImageButton jung;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_taejong);


        //이방원 타이틀
        title = (ImageButton) this.findViewById(R.id.img_button_link_taejong_title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://navercast.naver.com/contents.nhn?rid=77&contents_id=2813"));
                startActivity(intent);
            }
        });

        //포은 정몽주 링크
        jung = (ImageButton) this.findViewById(R.id.img_button_link_poeun);
        jung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://namu.wiki/w/%EC%A0%95%EB%AA%BD%EC%A3%BC"));
                startActivity(intent);
            }
        });



    }
}
