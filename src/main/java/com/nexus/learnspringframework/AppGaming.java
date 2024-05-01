package com.nexus.learnspringframework;

import com.nexus.learnspringframework.game.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.nexus.learnspringframework.game")
public class AppGaming {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppGaming.class);

        context.getBean(GameRunner.class).run();

    }

}
