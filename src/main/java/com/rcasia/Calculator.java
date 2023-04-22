package com.rcasia;

public class Calculator {
    
    private int current = 0;
    
    public int getCurrent() {
        return this.current;
    }
    
    public Calculator sum(int a) {
        this.current +=  a;
        return this;
    }

    public Calculator substract(int b) {
        this.current -= b;
        return this;
    }
}
