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
class CalculatorCommandHandlerTest {
    
    @InjectMocks
    private CalculatorCommandHandler undertest;
    
    @Mock
    private SumUseCase sumUseCase;
    
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
