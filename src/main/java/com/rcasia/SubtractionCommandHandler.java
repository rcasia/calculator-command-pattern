package com.rcasia;


public class SubtractionCommandHandler implements CommandHandler {
    
    private static final Class<? extends Command> COMMAND_CLASS = SubtractionCommand.class;

    private SubtractionUseCase subtractionUseCase;
    
    public SubtractionCommandHandler(CommandBus commandBus, SubtractionUseCase subtractionUseCase){
        this.subscribe(commandBus);
        this.subtractionUseCase = subtractionUseCase;
    }
    
    public void handle(Command command){
        SubtractionCommand subtractionCommand = (SubtractionCommand) command; 
        this.subtractionUseCase.subtract(subtractionCommand.getFirstNumber(), subtractionCommand.getSecondNumber());
    }

    private void subscribe(CommandBus commandBus) {
        commandBus.subscribe(this, COMMAND_CLASS);
    }
}
