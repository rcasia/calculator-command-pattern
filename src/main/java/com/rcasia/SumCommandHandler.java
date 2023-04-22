package com.rcasia;

public class SumCommandHandler implements CommandHandler {


    private SumUseCase sumUseCase;

    @Override
    public void handle(Command command) {
        SumCommand sumCommand = (SumCommand) command; 
        this.sumUseCase.sum(sumCommand.getFirstNumber(), sumCommand.getSecondNumber());
    }
}
