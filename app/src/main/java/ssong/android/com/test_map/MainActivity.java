package ssong.android.com.test_map;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import ssong.android.com.test_map.adapter.KingAdapter;
import ssong.android.com.test_map.data.ChulJong;
import ssong.android.com.test_map.data.Danjong;
import ssong.android.com.test_map.data.GoJong;
import ssong.android.com.test_map.data.GwangHaegoon;
import ssong.android.com.test_map.data.GyungJong;
import ssong.android.com.test_map.data.HunJong;
import ssong.android.com.test_map.data.Hyojong;
import ssong.android.com.test_map.data.HyunJong;
import ssong.android.com.test_map.data.Injo;
import ssong.android.com.test_map.data.Injong;
import ssong.android.com.test_map.data.Joongjong;
import ssong.android.com.test_map.data.JungJong;
import ssong.android.com.test_map.data.Jungjo;
import ssong.android.com.test_map.data.Mine;
import ssong.android.com.test_map.data.MoonJong;
import ssong.android.com.test_map.data.Myungjong;
import ssong.android.com.test_map.data.SeJong;
import ssong.android.com.test_map.data.Sejo;
import ssong.android.com.test_map.data.SookJong;
import ssong.android.com.test_map.data.Soonjo;
import ssong.android.com.test_map.data.Soonjong;
import ssong.android.com.test_map.data.SungJong;
import ssong.android.com.test_map.data.Sunjo;
import ssong.android.com.test_map.data.TaeJong;
import ssong.android.com.test_map.data.Taejo;
import ssong.android.com.test_map.data.Yejong;
import ssong.android.com.test_map.data.YeonSangoon;
import ssong.android.com.test_map.data.YoungChin;
import ssong.android.com.test_map.data.Youngjo;
import ssong.android.com.test_map.splash.SplashScreen;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    ArrayList<Kings> k_info_list;
    KingAdapter myAdapter;

    //뒤로 두번 클릭하면 꺼지게 만들자,
    private final long FINISH_INTERVAL_TIME = 2000;
    private long backPressTime = 0;


    //왕들의 정보가 들어갈 저장소
    Kings taejo,jungjong,taejong,sejong,moonjong,danjong,sejo,yejong,sungjong,yeonsangoon,joongjong,injong
            ,myungjong,sunjo,gwanghaegoon,injo,hyojong,hyungjong,sookjong,gyungjong,youngjo,jungjo,soonjo
            ,hunjong,chuljong,gojong,soonjong,jegook,jegook1,younchin,mine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);




        // splash screen
        startActivity(new Intent(this, SplashScreen.class));

        listView = (ListView) findViewById(R.id.listView);

        //리스트에 들어갈 왕들의 저장소
        taejo = new Kings("1대 태조", "이성계-이단", "1335년10월27일 ~ 1408년6월8일");
        jungjong = new Kings("2대 정종", "이방과-이경", "1357년7월8일 ~ 1419년9월6일");
        taejong = new Kings("3대 태종", "이방원", "1367년6월13일 ~ 1422년6월11");
        sejong = new Kings("4대 세종", "이막동-이도", "1397년5월7일 ~ 1450년3월30일");
        moonjong = new Kings("5대 문종", "이향", "1414년11월15일 ~ 1452년6월1일");
        danjong = new Kings("6대 단종","이홍위","1441년8월9일 ~ 1458년1월9일");
        sejo = new Kings("7대 세조","이유","1417년11월2일 ~ 1468년9월23일");
        yejong = new Kings("8대 예종","이황","1450년1월14일 ~ 1469년12월31일");
        sungjong = new Kings("9대 성종","이혈","1457년8월19일 ~ 1494년12월25");
        yeonsangoon = new Kings("10대 연산군","이융","1476년11월22일 ~ 1506년11월20일");
        joongjong = new Kings("11대 중종","이역","1488년4월16일 ~ 1544년11월29일");
        injong = new Kings("12대 인종","이호","1515년3월10일 ~ 1545년8월7일");
        myungjong = new Kings("13대 명종","이환","1534년7월3일 ~ 1567년8월2일");
        sunjo = new Kings("14대 선조","이연","1552년11월26일 ~ 1608년2월1일");
        gwanghaegoon = new Kings("15대 광해군","이혼","1575년6월4일 ~ 1641년8월7일");
        injo = new Kings("16대 인조","이종","1575년12월7일 ~ 1641년6월17일");
        hyojong = new Kings("17대 효종","이호","1619년7월3일 ~ 1659년6월23일");
        hyungjong = new Kings("18대 현종","이연","1641년2월4일 ~ 1674년8월18일");
        sookjong = new Kings("19대 숙종","이순","1610년10월7일 ~ 1720년7월12일");
        gyungjong = new Kings("20대 경종","이윤","1688년11월20일 ~ 1724년10월11일");
        youngjo = new Kings("21대 영조","이금","1694년10월31일 ~ 1776년4월22일");
        jungjo = new Kings("22대 정조","이산","1752년10월28일 ~ 1800년8월18일");
        soonjo = new Kings("23대 순조","이공","1790년7월29일 ~ 1834년11월13일");
        hunjong = new Kings("24대 헌종","이환","1827년9월8일 ~ 1849년7월25일");
        chuljong = new Kings("25대 철종","이변","1831년7월25일 ~ 1864년1월16일");
        gojong = new Kings("26대 고종","이명복/이재황-이형","1852년9월8일 ~ 1919년1월21일");
        jegook = new Kings("대한제국 선포","","1897년10월12 ~ 1910년 8월 29일");
        soonjong = new Kings("2대 순종","이척","1874년3월25일 ~ 1926년4월26일");
        jegook1 = new Kings("일본 이왕가로 왕실 격하","","1910년8월29일 ~ 1926년4월26일");
        younchin = new Kings("2대 이왕가 황태자 영친왕","이은","1897년10월20일 ~ 1970년5월1일");
        mine = new Kings("출저 및 후원","안녕하세요 붐브로스 입니다","");


        //리스트 저장소
        k_info_list = new ArrayList<Kings>();
        k_info_list.add(taejo);
        k_info_list.add(jungjong);
        k_info_list.add(taejong);
        k_info_list.add(sejong);
        k_info_list.add(moonjong);
        k_info_list.add(danjong);
        k_info_list.add(sejo);
        k_info_list.add(yejong);
        k_info_list.add(sungjong);
        k_info_list.add(yeonsangoon);
        k_info_list.add(joongjong);
        k_info_list.add(injong);
        k_info_list.add(myungjong);
        k_info_list.add(sunjo);
        k_info_list.add(gwanghaegoon);
        k_info_list.add(injo);
        k_info_list.add(hyojong);
        k_info_list.add(hyungjong);
        k_info_list.add(sookjong);
        k_info_list.add(gyungjong);
        k_info_list.add(youngjo);
        k_info_list.add(jungjo);
        k_info_list.add(soonjo);
        k_info_list.add(hunjong);
        k_info_list.add(chuljong);
        k_info_list.add(gojong);
        k_info_list.add(jegook);
        k_info_list.add(soonjong);
        k_info_list.add(jegook1);
        k_info_list.add(younchin);
        k_info_list.add(mine);



        myAdapter = new KingAdapter(getApplicationContext(), R.layout.dynasty_kings, k_info_list);
        listView.setAdapter(myAdapter);

        // 이후 서버 작업과 업데이트 (메인 화면에 전부 코딩하는 뻘짓 금지)
        //아이템 온클릭리스너 입니다.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //넘어갈 화면을 여기다 적어 준다

                switch (position){
                    case 0: Intent taejo = new Intent(getApplicationContext(), Taejo.class);
                        startActivity(taejo);
                        Toast.makeText(MainActivity.this, "무패의 무장, 조선의 건국자 태조", Toast.LENGTH_SHORT).show();
                        break;
                    case 1: Intent jungjong = new Intent(getApplicationContext(), JungJong.class);
                        startActivity(jungjong);
                        Toast.makeText(MainActivity.this, "동생을 사랑했던 정종", Toast.LENGTH_SHORT).show();
                        break;
                    case 2: Intent taejong = new Intent(getApplicationContext(), TaeJong.class);
                        startActivity(taejong);
                        Toast.makeText(MainActivity.this, "언터쳐블 태종", Toast.LENGTH_SHORT).show();
                        break;
                    case 3: Intent sejong = new Intent(getApplicationContext(), SeJong.class);
                        startActivity(sejong);
                        Toast.makeText(MainActivity.this, "나랏말싸미,농사직설 세종", Toast.LENGTH_SHORT).show();
                        break;
                    case 4: Intent moonjong = new Intent(getApplicationContext(), MoonJong.class);
                        startActivity(moonjong);
                        Toast.makeText(MainActivity.this, "공부벌래 문종", Toast.LENGTH_SHORT).show();
                        break;
                    case 5: Intent danjong = new Intent(getApplicationContext(), Danjong.class);
                        startActivity(danjong);
                        Toast.makeText(MainActivity.this, "소년왕 단종", Toast.LENGTH_SHORT).show();
                        break;
                    case 6: Intent sejo = new Intent(getApplicationContext(), Sejo.class);
                        startActivity(sejo);
                        Toast.makeText(MainActivity.this, "나쁜 숙부 세조", Toast.LENGTH_SHORT).show();
                        break;
                    case 7: Intent yejong = new Intent(getApplicationContext(), Yejong.class);
                        startActivity(yejong);
                        Toast.makeText(MainActivity.this, "집착왕 예종", Toast.LENGTH_SHORT).show();
                        break;
                    case 8: Intent sungjong = new Intent(getApplicationContext(), SungJong.class);
                        startActivity(sungjong);
                        Toast.makeText(MainActivity.this, "백성이 궁금한 성종", Toast.LENGTH_SHORT).show();
                        break;
                    case 9: Intent yeonsangoon = new Intent(getApplicationContext(), YeonSangoon.class);
                        startActivity(yeonsangoon);
                        Toast.makeText(MainActivity.this, "팔도의여자는 내것! 연산군", Toast.LENGTH_SHORT).show();
                        break;
                    case 10: Intent joongjong= new Intent(getApplicationContext(), Joongjong.class);
                        startActivity(joongjong);
                        Toast.makeText(MainActivity.this, "연산군을 몰아낸 중종", Toast.LENGTH_SHORT).show();
                        break;
                    case 11: Intent injong = new Intent(getApplicationContext(), Injong.class);
                        startActivity(injong);
                        Toast.makeText(MainActivity.this, "어진임금 인종", Toast.LENGTH_SHORT).show();
                        break;
                    case 12: Intent myungjong = new Intent(getApplicationContext(), Myungjong.class);
                        startActivity(myungjong);
                        Toast.makeText(MainActivity.this, "내시는 내친구 명종", Toast.LENGTH_SHORT).show();
                        break;
                    case 13: Intent sunjo = new Intent(getApplicationContext(), Sunjo.class);
                        startActivity(sunjo);
                        Toast.makeText(MainActivity.this, "발암왕 선조", Toast.LENGTH_SHORT).show();
                        break;
                    case 14: Intent gwanghaegoon = new Intent(getApplicationContext(), GwangHaegoon.class);
                        startActivity(gwanghaegoon);
                        Toast.makeText(MainActivity.this, "어릴적엔 뛰어났었던 광해군", Toast.LENGTH_SHORT).show();
                        break;
                    case 15: Intent injo = new Intent(getApplicationContext(), Injo.class);
                        startActivity(injo);
                        Toast.makeText(MainActivity.this, "쿠데타! 반정의 인조", Toast.LENGTH_SHORT).show();
                        break;
                    case 16: Intent hyojong = new Intent(getApplicationContext(), Hyojong.class);
                        startActivity(hyojong);
                        Toast.makeText(MainActivity.this, "북진의 효종", Toast.LENGTH_SHORT).show();
                        break;
                    case 17: Intent hyunjong = new Intent(getApplicationContext(), HyunJong.class);
                        startActivity(hyunjong);
                        Toast.makeText(MainActivity.this, "어려울때 왕이된 종", Toast.LENGTH_SHORT).show();
                        break;
                    case 18: Intent sookjong = new Intent(getApplicationContext(), SookJong.class);
                        startActivity(sookjong);
                        Toast.makeText(MainActivity.this, "환국정치 숙종", Toast.LENGTH_SHORT).show();
                        break;
                    case 19: Intent gyungjong = new Intent(getApplicationContext(), GyungJong.class);
                        startActivity(gyungjong);
                        Toast.makeText(MainActivity.this, "자식이 없는 경종", Toast.LENGTH_SHORT).show();
                        break;
                    case 20: Intent youngjo = new Intent(getApplicationContext(), Youngjo.class);
                        startActivity(youngjo);
                        Toast.makeText(MainActivity.this, "사도세자,탕평책 영조", Toast.LENGTH_SHORT).show();
                        break;
                    case 21: Intent jungjo = new Intent(getApplicationContext(), Jungjo.class);
                        startActivity(jungjo);
                        Toast.makeText(MainActivity.this, "마지막 개혁군주 정조", Toast.LENGTH_SHORT).show();
                        break;
                    case 22: Intent soonjo = new Intent(getApplicationContext(), Soonjo.class);
                        startActivity(soonjo);
                        Toast.makeText(MainActivity.this, "조선멸망에 기름친 순종", Toast.LENGTH_SHORT).show();
                        break;
                    case 23: Intent hunjong = new Intent(getApplicationContext(), HunJong.class);
                        startActivity(hunjong);Toast.makeText(MainActivity.this, "천주교 박해 헌종", Toast.LENGTH_SHORT).show();
                        break;
                    case 24: Intent chuljong = new Intent(getApplicationContext(), ChulJong.class);
                        startActivity(chuljong);
                        Toast.makeText(MainActivity.this, "강화도령 왕이되다 철종", Toast.LENGTH_SHORT).show();
                        break;
                    case 25: Intent gojong = new Intent(getApplicationContext(), GoJong.class);
                        startActivity(gojong);
                        Toast.makeText(MainActivity.this, "조선의 마지막왕 고종", Toast.LENGTH_SHORT).show();
                        break;
                    case 27: Intent soonjong = new Intent(getApplicationContext(), Soonjong.class);
                        startActivity(soonjong);
                        Toast.makeText(MainActivity.this, "병약한 황태자 순종", Toast.LENGTH_SHORT).show();
                        break;
                    case 29: Intent youngchin = new Intent(getApplicationContext(), YoungChin.class);
                        startActivity(youngchin);
                        Toast.makeText(MainActivity.this, "조선이 그리웠던 영친왕", Toast.LENGTH_SHORT).show();
                        break;
                    case 30: Intent mine = new Intent(getApplicationContext(), Mine.class);
                        startActivity(mine);
                        Toast.makeText(MainActivity.this, "출처 및 후원안내", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });


    }


    //뒤로가기 프레스 부분
    @Override
    public void onBackPressed() {
        long tempTime = System.currentTimeMillis();
        long intervalTime = tempTime - backPressTime;
        //한번 눌렸을때도 뒤로 가야한다

        if (0 <= intervalTime && FINISH_INTERVAL_TIME >= intervalTime) {

            super.onBackPressed();
        } else {
            backPressTime = tempTime;
            Toast.makeText(getApplicationContext(), "한번더 누르면 종료됩니", Toast.LENGTH_SHORT).show();

        }

    }

}
