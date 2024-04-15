package com.nexus.learnspringframework;

import com.nexus.learnspringframework.game.GameRunner;
import com.nexus.learnspringframework.game.GamingConsole;
import com.nexus.learnspringframework.game.MarioGame;
import com.nexus.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole pacmanGame() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    @Primary
    public GamingConsole marioGame() {
        var game = new MarioGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
