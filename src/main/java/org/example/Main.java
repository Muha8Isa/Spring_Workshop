package org.example;

import org.example.config.ComponentScanConfig;
import org.example.data_access.StudentDao;
import org.example.userInput.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService userInputService =context.getBean(UserInputService.class);
    }
}