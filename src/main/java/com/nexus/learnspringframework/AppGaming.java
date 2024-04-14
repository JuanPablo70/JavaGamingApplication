package com.nexus.learnspringframework;

import com.nexus.learnspringframework.game.GameRunner;
import com.nexus.learnspringframework.game.MarioGame;

public class AppGaming {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }

}
