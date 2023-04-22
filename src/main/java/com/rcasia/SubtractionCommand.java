package com.rcasia;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SubtractionCommand implements Command {
    
    private int firstNumber;
    private int secondNumber;
    
}
