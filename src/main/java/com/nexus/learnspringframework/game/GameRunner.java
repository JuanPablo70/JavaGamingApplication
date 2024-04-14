package com.nexus.learnspringframework.game;

public class GameRunner {

    MarioGame game;
    public GameRunner(MarioGame marioGame) {
        game = marioGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
