package org.example.designpattern.adapter;

public class Client {


    public static void main(String[] args) {


        MediaPlayer mediaPlayer = new MediaPlayerAdapter("vlc");
        mediaPlayer.play("dsfsdg", "vlc");

    }
}
