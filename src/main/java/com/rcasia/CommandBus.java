package com.rcasia;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class CommandBus {
    
    private final HashMap<Class<? extends Command>, CommandHandler> handlers =  new HashMap<>();
    

    public void subscribe(CommandHandler commandHandler, Class<? extends Command> command ){
        this.handlers.put(command, commandHandler);
    }

    public void route(Command command) {
        var handler = this.handlers.get(command.getClass());
        
        handler.handle(command);
    }
}
