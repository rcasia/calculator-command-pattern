package com.rcasia;


public class SubtractionCommandHandler {

    private SubtractionUseCase subtractionUseCase;
    
    public void handle(Command command){
        SubtractionCommand subtractionCommand = (SubtractionCommand) command; 
        this.subtractionUseCase.subtract(subtractionCommand.getFirstNumber(), subtractionCommand.getSecondNumber());
    }
}
