package org.example.snakeAndLadder.service;

import org.example.snakeAndLadder.model.Dice;
import org.example.snakeAndLadder.model.Player;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BoardGame {

    private int boardSize;
    private Map<String, Player> playerMap;
    private Queue<Player> playerQueue;
    private Map<Integer, Integer> snakePositionMap;
    private Map<Integer, Integer> ladderPostionMap;
    private Map<Player, Integer> playerCurrentPosition;
    private Dice dice;

    public BoardGame(int boardSize) {
        this.boardSize = boardSize;
        this.ladderPostionMap = new HashMap<>();
        this.snakePositionMap = new HashMap<>();
        this.playerMap = new HashMap<>();
        this.playerQueue = new LinkedList<>();
        this.playerCurrentPosition = new HashMap<>();
        this.dice = new Dice(6);
    }

    public void registerPlayer(Player player) {
        playerQueue.add(player);
        playerCurrentPosition.putIfAbsent(player, 0);
    }

    public void startGame() {

        while (playerQueue.size() > 1) {
            Player player = playerQueue.poll();
            System.out.println("Player name is = " + player.getName());

            int currentPosition = playerCurrentPosition.get(player);

            int tempPos = currentPosition + dice.rollDice();
            if (ladderPostionMap.containsKey(tempPos)) {
                tempPos = ladderPostionMap.get(tempPos);
            }

            if (snakePositionMap.containsKey(tempPos)) {
                tempPos = snakePositionMap.get(tempPos);
            }

            if (tempPos == boardSize) {
                System.out.println("Player has won the match " + player);
            } else {
                playerCurrentPosition.put(player, tempPos);
                playerQueue.add(player);
            }
        }
    }
}
