package com.rcasia;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SubtractionCommand {
    
    private int firstNumber;
    private int secondNumber;
    
}
