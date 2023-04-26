package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer musicPlayer =context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println("Player name: "+musicPlayer.getName());
        System.out.println("Player volume: "+musicPlayer.getVolume());
        context.close();
    }
}

