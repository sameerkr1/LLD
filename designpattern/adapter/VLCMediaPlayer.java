package org.example.designpattern.adapter;

public class VLCMediaPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMp3(String fileName) {
        // no implementation
    }
}
