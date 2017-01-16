package vn.com.kampus.recyclerviewtuorial.acticity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import vn.com.kampus.recyclerviewtuorial.R;
import vn.com.kampus.recyclerviewtuorial.adapter.SongAdapter;
import vn.com.kampus.recyclerviewtuorial.modell.Song;

public class Main extends AppCompatActivity {
    private RecyclerView rvSong;
    private ArrayList<Song> arrSong;
    private SongAdapter songAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initViews();
    }

    private void initViews() {
        rvSong = (RecyclerView) findViewById(R.id.rvSong);
        arrSong = new ArrayList<>();
        arrSong.add(new Song("00001", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00002", "Đêm đông", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00003", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00004", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00005", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00006", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00007", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00008", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00009", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00010", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00001", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00002", "Đêm đông", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00003", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00004", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00005", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00006", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00007", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00008", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00009", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));
        arrSong.add(new Song("00010", "Lạc trôi", "Lạc trôi giữa bầu trời", "Sơn tùng"));

        songAdapter =new SongAdapter(arrSong, this);
        rvSong.setAdapter(songAdapter);
//        RecyclerView scroll vertical
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvSong.setLayoutManager(linearLayoutManager);
    }
}
