package com.rcasia;

import org.springframework.stereotype.Component;

@Component
public class SumCommandHandler implements CommandHandler {

    private static final Class<? extends Command> COMMAND_CLASS = SumCommand.class;

    private final SumUseCase sumUseCase;
    
    public SumCommandHandler(CommandBus commandBus, SumUseCase sumUseCase){
        this.subscribe(commandBus);
        this.sumUseCase = sumUseCase;
    }

    private void subscribe(CommandBus commandBus) {
        commandBus.subscribe(this, COMMAND_CLASS);
    }

    @Override
    public void handle(Command command) {
        SumCommand sumCommand = (SumCommand) command; 
        this.sumUseCase.sum(sumCommand.getFirstNumber(), sumCommand.getSecondNumber());
    }
}
