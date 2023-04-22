package com.rcasia;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SumCommand implements CalculatorCommand {
    
    private int firstNumber;
    
    private int secondNumber;
}
