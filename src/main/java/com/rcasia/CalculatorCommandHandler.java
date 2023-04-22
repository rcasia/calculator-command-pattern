package com.rcasia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CalculatorCommandHandler {

    private SumUseCase sumUseCase;
    
    private SubtractionUseCase subtractionUseCase;

    public void handle(SumCommand sumCommand) {
        this.sumUseCase.sum(sumCommand.getFirstNumber(), sumCommand.getSecondNumber());
    }
    
    public void handle(SubtractionCommand subtractionCommand){
        this.subtractionUseCase.subtract(subtractionCommand.getFirstNumber(), subtractionCommand.getSecondNumber());
    }
}
