package org.example.lld.tictac.model;

public class Player {

    private String playerName;
    private PlayingPiece playingPiece;

    public Player(String playerName, PlayingPiece playingPiece) {
        this.playerName = playerName;
        this.playingPiece = playingPiece;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public PlayingPiece getPlayingPiece(){
        return this.playingPiece;
    }
}
