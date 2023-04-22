package com.rcasia;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
@AllArgsConstructor
public class CalculatorCommandLineRunner implements CommandLineRunner {
    
    private CommandBus commandBus;

    @Override
    public void run(String... args) {
        System.out.println("Suma y suma");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer número: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Segundo número: ");
        int secondNumber = scanner.nextInt();
        
        var sumCommand = SumCommand.builder()
                .firstNumber(firstNumber)
                .secondNumber(secondNumber)
                .build();
        
        this.commandBus.execute(sumCommand);
        
    }
}
