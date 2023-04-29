package org.example;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> songs;

    public MusicPlayer(List<Music> songs) {
        this.songs = songs;
    }

    public String playMusic() {
        Random random =new Random();
        int randomGenre = random.nextInt(3);
        switch (randomGenre){
            case 0:
                return "Playing: " + songs.get(0).getSongs().get(random.nextInt(3));
            case 1:
                return "Playing: " + songs.get(1).getSongs().get(random.nextInt(3));
            case 2:
                return "Playing: " + songs.get(2).getSongs().get(random.nextInt(3));
        }
        return null;
    }
}
