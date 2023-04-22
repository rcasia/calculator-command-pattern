package com.rcasia;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class SubtractionCommandHandlerTest {
    
    @InjectMocks
    private SubtractionCommandHandler undertest;
    
    @Mock
    private SubtractionUseCase subtractionUseCase;
    
    @Mock
    private CommandBus commandBus;
    
    
    @Test
    void shouldSubscribeWhenInstantiated(){
        verify(this.commandBus, times(1)).subscribe(undertest, SubtractionCommand.class);
    }
    
    @Test
    void shouldAcceptSubtractCommand(){
        // given
        SubtractionCommand subtractionCommand = SubtractionCommand.builder()
                .firstNumber(10)
                .secondNumber(5)
                .build();
        
        // when
        this.undertest.handle(subtractionCommand);
        
        // then
        verify(this.subtractionUseCase, times(1)).subtract(10, 5);
    }
}
