package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> musicList;

    @Override
    public List<String> getSongs() {
        return Arrays.asList("ClassicalSong1", "ClassicalSong2", "ClassicalSong3");
    }
}


