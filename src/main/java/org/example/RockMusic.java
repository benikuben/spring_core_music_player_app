package org.example;

import java.util.Arrays;
import java.util.List;


public class RockMusic implements  Music{
    private List<String> list;

    public RockMusic(List<String> list) {
        this.list = list;
    }

    //default
    public RockMusic() {
        list = Arrays.asList("RockSong1", "RockSong2", "RockSong3");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}
