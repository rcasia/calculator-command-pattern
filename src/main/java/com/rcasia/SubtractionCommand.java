package com.rcasia;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SubtractionCommand implements CalculatorCommand {
    
    private int firstNumber;
    private int secondNumber;
    
}
