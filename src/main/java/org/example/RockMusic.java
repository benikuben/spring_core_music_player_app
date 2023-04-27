package org.example;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements  Music{
    @Override
    public List<String> getSongs() {
        return Arrays.asList("RockSong1", "RockSong2", "RockSong3");
    }
}
