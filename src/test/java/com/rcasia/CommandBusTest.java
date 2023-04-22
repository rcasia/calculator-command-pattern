package com.rcasia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CommandBusTest {
    
    @Test
    void shouldSubscribeHandlersToCommands(){
        // given
        CommandBus commandBus = new CommandBus();
        
        // when
        commandBus.subscribe(CalculatorCommand.class, CalculatorCommandHandler.class);
        var actual = commandBus.getHandlers();
        
        // then
        assertThat(actual.get(CalculatorCommand.class)).isNotNull();
    }
    
}
