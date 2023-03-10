package org.example.userInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{

    Scanner scanner;

    @Autowired //Constructor injection
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        return null;
    }

    @Override
    public int getInt() {
        return 0;
    }
}
