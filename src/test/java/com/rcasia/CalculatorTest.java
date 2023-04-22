package com.rcasia;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorTest {
    
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,2,4",
            "5,4,9",
            "100,349,449",
            "90,13,103"
    })
    void sumAPlusBEqualsC(int a, int b, int expected){
        // given
        Calculator calculator = new Calculator();
        
        // when
        calculator.sum(a);
        calculator.sum(b);
        int actual = calculator.getCurrent();
        
        // then
        assertThat(actual).isEqualTo(expected);
        
    }
}
