package org.example.designpattern.adapter;

public class Mp4AdvanceMediaPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        // no implementation
    }

    @Override
    public void playMp3(String fileName) {
        System.out.println("Mp4 is playing ");
    }
}
