package ssong.android.com.test_map.data;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import ssong.android.com.test_map.R;

/**
 * 세종대왕 데이터
 */

public class SeJong extends AppCompatActivity {

    //이미지버튼 변수선언
    ImageButton jang;
    ImageButton title;
    ImageButton yeomin;

    //그냥 버튼 변수선언
    Button unbo;
    Button upjuk;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_sejong);

        //타이틀 세종대왕 용안 관련 링크
        title = (ImageButton) this.findViewById(R.id.img_button_link_title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://namu.wiki/w/%EC%84%B8%EC%A2%85%EB%8C%80%EC%99%95#s-7"));
                startActivity(intent);
            }
        });

        //여민동락 링크
        yeomin = (ImageButton) this.findViewById(R.id.img_button_link_yeomindongrak);
        yeomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://terms.naver.com/entry.nhn?docId=1670483&cid=50801&categoryId=50804"));
                startActivity(intent);
            }
        });


        //운보김기창 관련 나무위키 링크 버튼
        unbo = (Button) this.findViewById(R.id.text_link_unbo);
        unbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://namu.wiki/w/%EA%B9%80%EA%B8%B0%EC%B0%BD"));
                startActivity(intent);
            }
        });

        //세종 대왕 관련 업적 링크

        upjuk = (Button) this.findViewById(R.id.text_link_upjuk);
        upjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://namu.wiki/w/%EC%84%B8%EC%A2%85%EB%8C%80%EC%99%95/%EC%97%85%EC%A0%81"));
                startActivity(intent);
            }
        });

        jang = (ImageButton) this.findViewById(R.id.img_button_link_jangyoungsil);
        jang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://navercast.naver.com/contents.nhn?rid=77&contents_id=2824"));
                startActivity(intent);
            }
        });

    }
}
