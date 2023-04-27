package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component("musicPlayer")
public class MusicPlayer {

    private ClassicalMusic classicalMusicList;
    private RockMusic rockMusicList;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic classicalMusicList,
                       @Qualifier("rockMusic") RockMusic rockMusicList) {
        this.classicalMusicList = classicalMusicList;
        this.rockMusicList = rockMusicList;
    }

    public String playMusic(Enum<MusicGenres> MusicGenre) {
        Random random = new Random();
        if (MusicGenre == MusicGenres.CLASSICAL)
            return "Playing: " + classicalMusicList.getSongs().get(random.nextInt(3));
        else if (MusicGenre == MusicGenres.ROCK)
            return "Playing: " + rockMusicList.getSongs().get(random.nextInt(3));
        return null;
    }

}
