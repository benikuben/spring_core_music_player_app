package org.example;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id=1;
        this.musicPlayer = musicPlayer;
    }

    public String turnOnPlayer(){
        return "Computer " + id +" "+ musicPlayer.playMusic();
    }
}
