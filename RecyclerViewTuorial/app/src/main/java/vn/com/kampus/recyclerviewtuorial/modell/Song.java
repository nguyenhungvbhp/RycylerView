package vn.com.kampus.recyclerviewtuorial.modell;

/**
 * Created by ManhHung on 1/16/2017.
 */

public class Song {
    private String code;
    private String name;
    private String lyric;
    private String artist;

    public Song(String code, String name, String lyric, String artist) {
        this.code = code;
        this.name = name;
        this.lyric = lyric;
        this.artist = artist;
    }

    public Song() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
