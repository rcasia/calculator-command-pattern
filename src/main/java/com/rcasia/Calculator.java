package com.rcasia;

public class Calculator {
    
    private int current = 0;
    
    public Calculator sum(int a) {
        this.current +=  a;
        return this;
    }

    public int getCurrent() {
        return this.current;
    }
}
