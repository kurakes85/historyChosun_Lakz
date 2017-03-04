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

public class Sejo extends AppCompatActivity {

    ImageButton sooyang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_sejo);


//        수양대군 이미지
        sooyang = (ImageButton) this.findViewById(R.id.img_button_link_sejo_title);
        sooyang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://blog.naver.com/antasan/220863754141"));
                startActivity(intent);
            }
        });

    }
}
