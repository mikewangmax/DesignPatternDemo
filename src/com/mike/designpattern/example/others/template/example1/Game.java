package com.mike.designpattern.example.others.template.example1;

public abstract class Game {
    protected int playerCount;
    abstract void initializeGame();
    abstract void makePlayer(int player);
    abstract boolean endOfGame();
    abstract void printWinner();


    /**
     *
     * the modifier final makes this method can not be overrided
     */
    public final void playOneGame(int playersCount) {
        this.playerCount = playersCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()) {
            makePlayer(j);
            j = (j + 1) % playersCount;
        }

        printWinner();
    }
}
