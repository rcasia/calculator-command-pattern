package com.rcasia;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class SumCommandHandlerTest {
    
    @InjectMocks
    private SumCommandHandler undertest;
    
    @Mock
    private SumUseCase sumUseCase;
    
    @Mock
    private CommandBus commandBus;

    @Test
    void shouldSubscribeWhenInstantiated(){
        verify(this.commandBus, times(1)).subscribe(undertest, SumCommand.class);
    }
    
    @Test
    void shouldAcceptSumCommand(){
        // given
        SumCommand sumCommand = SumCommand.builder()
                .firstNumber(5)
                .secondNumber(5)
                .build();
        
        // when
        this.undertest.handle(sumCommand);
        
        // then
        verify(this.sumUseCase, times(1)).sum(5,5);
        
    }
    
}
