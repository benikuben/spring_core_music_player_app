package org.example;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music {
    private List<String> list;

    public ClassicalMusic(List<String> list) {
        this.list = list;
    }

    //default
    public ClassicalMusic() {
        list = Arrays.asList("ClassicalSong1", "ClassicalSong2", "ClassicalSong3");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}


