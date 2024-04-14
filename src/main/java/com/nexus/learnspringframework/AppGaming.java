package com.nexus.learnspringframework;

import com.nexus.learnspringframework.game.GameRunner;
import com.nexus.learnspringframework.game.MarioGame;
import com.nexus.learnspringframework.game.PacmanGame;
import com.nexus.learnspringframework.game.SuperContraGame;

public class AppGaming {

    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
