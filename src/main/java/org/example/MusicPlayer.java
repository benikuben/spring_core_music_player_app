package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: ");
        musicList.stream().forEach(music-> System.out.println(music.getSong()));
    }

    //IoC
    public void setMusicList(Music[] music) {
        musicList.addAll(Arrays.asList(music));
    }
}
