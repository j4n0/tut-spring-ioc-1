
// BSD License. Created by jano@jano.com.es

package com.tut.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger("Main");

    public static void run(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "META-INF/spring/applicationContext.xml");

        User user = (User)context.getBean("user1");
        logger.debug(user);

        user = (User)context.getBean("user2");
        logger.debug(user);

        user = (User)context.getBean("user3");
        logger.debug(user);
    }

    public static void main(String[] args) {
        Main.run();
    }

}
