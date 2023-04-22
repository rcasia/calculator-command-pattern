package com.rcasia;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SumCommand {
    
    private int firstNumber;
    
    private int secondNumber;
}
