package com.xpfarm.exam3;

import com.xpfarm.exam3.helper.Bot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Exam3Application {
    static final Logger logger = LoggerFactory.getLogger(Exam3Application.class);

    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("cli")) {
            Bot bot = new Bot();
            logger.info(bot.play());
        } else {
            SpringApplication.run(Exam3Application.class, args);
        }

    }
}
