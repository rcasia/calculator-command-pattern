package com.rcasia;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class CommandBusTest {
    
    @Test
    void shouldSubscribeHandlersToCommands(){
        // given
        CommandBus commandBus = new CommandBus();
        SumCommandHandler sumCommandHandler =  mock(SumCommandHandler.class);
        
        // when
        commandBus.subscribe(sumCommandHandler, Command.class);
        var actual = commandBus.getHandlers();
        
        // then
        assertThat(actual.get(Command.class)).isNotNull();
    }
    
    @Test
    void shouldRouteCommands(){
        // given
        CommandBus commandBus = new CommandBus();
        SumCommandHandler sumCommandHandler =  mock(SumCommandHandler.class);
        SumCommand command = SumCommand.builder().build();
        commandBus.subscribe(sumCommandHandler, SumCommand.class);
        
        // when
        commandBus.execute(command);
        
        // then
        verify(sumCommandHandler, times(1)).handle(command);
        
    }
    
}
