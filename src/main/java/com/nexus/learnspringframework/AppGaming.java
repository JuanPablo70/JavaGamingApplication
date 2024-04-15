package com.nexus.learnspringframework;

import com.nexus.learnspringframework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGaming {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GameRunner.class).run();

    }

}
