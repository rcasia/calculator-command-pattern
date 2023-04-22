package com.rcasia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp(){
        this.calculator = new Calculator();
    }
    
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,2,4",
            "5,4,9",
            "100,349,449",
            "90,13,103"
    })
    void sumAPlusBEqualsC(int a, int b, int expected){
        // when
        this.calculator
                .sum(a)
                .sum(b);
        
        int actual = this.calculator.getCurrent();
        
        // then
        assertThat(actual).isEqualTo(expected);
    }
    
    @ParameterizedTest
    @CsvSource({
            "1,1,0",
            "2,1,1",
            "9,3,6",
            "100,23,77"
    })
    void subtractAMinusBEqualsC(int a, int b, int expected){
        // when
        this.calculator
                .sum(a)
                .substract(b);
        
        int actual = this.calculator.getCurrent();
        
        // then
        assertThat(actual).isEqualTo(expected);
        
    }
}
