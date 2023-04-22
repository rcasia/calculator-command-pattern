package com.rcasia;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
public class CommandBus {
    
    private final HashMap<Class<CalculatorCommand>, Class<CalculatorCommandHandler>> handlers =  new HashMap<>();

    public void subscribe(Class<CalculatorCommand> calculatorCommandClass, Class<CalculatorCommandHandler> calculatorCommandHandlerClass) {
        this.handlers.put(calculatorCommandClass, calculatorCommandHandlerClass);
    }

}
