package org.example.snakeAndLadder.model;

import lombok.Data;

@Data
public class Dice {

    private int number;

    public Dice(int number) {
        this.number = number;
    }

    public int rollDice() {
        return (int) (Math.random() * (number) + 1);
    }
}
