package org.example;
import org.springframework.context.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> listOfGenres(){
        List<Music> list=new ArrayList<>();
        list.add(classicalMusic());
        list.add(rockMusic());
        list.add(jazzMusic());
        return list;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listOfGenres());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
