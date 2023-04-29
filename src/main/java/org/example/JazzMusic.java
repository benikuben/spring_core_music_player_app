package org.example;
import java.util.Arrays;
import java.util.List;

public class JazzMusic implements Music{
    private List<String> list;

    public JazzMusic(List<String> list) {
        this.list = list;
    }

    //default
    public JazzMusic() {
        list = Arrays.asList("JazzSong1", "JazzSong2", "JazzSong3");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}
