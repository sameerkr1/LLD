package org.example.designpattern.adapter;

public class MediaPlayerAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VLCMediaPlayer();
        } else if (audioType.equalsIgnoreCase("mp3")) {
            advanceMediaPlayer = new Mp4AdvanceMediaPlayer();
        } else advanceMediaPlayer = null;
    }

    @Override
    public void play(String fileName, String audioType) {
        if (audioType.equalsIgnoreCase("mp3")) {
            advanceMediaPlayer.playMp3(fileName);
        }else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        }
    }
}
