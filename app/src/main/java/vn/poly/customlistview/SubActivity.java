package vn.poly.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SubActivity extends AppCompatActivity {

    private ListView lvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        Bundle bundle = getIntent().getBundleExtra("data");

        String number = bundle.getString("number", "KO CO DU LIEU");

        lvList = findViewById(R.id.lvList);

        List<Music> musicList = new ArrayList<>();




        for (int i = 0; i < 20; i++) {
            Music music1 = new Music();
            music1.setTime("12-04-2019");
            music1.setName("Chill phet!!!");
            musicList.add(music1);
        }


        MusicAdapter musicAdapter = new MusicAdapter(SubActivity.this, musicList);

        lvList.setAdapter(musicAdapter);


    }
}
