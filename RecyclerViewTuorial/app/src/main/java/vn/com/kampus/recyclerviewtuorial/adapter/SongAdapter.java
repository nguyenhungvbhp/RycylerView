package vn.com.kampus.recyclerviewtuorial.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import vn.com.kampus.recyclerviewtuorial.R;
import vn.com.kampus.recyclerviewtuorial.modell.Song;

/**
 * Created by ManhHung on 1/16/2017.
 */

public class SongAdapter extends  RecyclerView.Adapter<SongAdapter.SongViewHolder> {
    private ArrayList<Song> arrSong;
    private Context context;
    private LayoutInflater inflater;

    public SongAdapter(ArrayList<Song> arrSong, Context context) {
        this.arrSong = arrSong;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    //Thực hiện tạo các item View. Nếu nó đã tồn tại thì sẽ không tạo
    //Tương tự như sử dụng ViewHolder trong ListView
    @Override
    public SongAdapter.SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_song, parent, false);
        return new SongViewHolder(view);
    }

    //Phương thức Bind với mục đích gắn các đối tượng vào item
    @Override
    public void onBindViewHolder(SongAdapter.SongViewHolder holder, int position) {
        Song song = arrSong.get(position);
        String code = song.getCode();
        String name = song.getName();
        String lyric = song.getLyric();
        String artist = song.getArtist();
        holder.tvCode.setText(code);
        holder.tvName.setText(name);
        holder.tvLyric.setText(lyric);
        holder.tvArtist.setText(artist);
    }

    //Trả về số lượng item
    @Override
    public int getItemCount() {
        return arrSong.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCode;
        private TextView tvName;
        private TextView tvLyric;
        private TextView tvArtist;
        public SongViewHolder(View itemView) {
            super(itemView);
            tvCode = (TextView) itemView.findViewById(R.id.tvCode);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvLyric = (TextView) itemView.findViewById(R.id.tvLyric);
            tvArtist = (TextView) itemView.findViewById(R.id.tvArtist);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show();
                }
            });
        }


    }
}
