package com.rcasia;

public class Calculator {
    
    private int current = 0;
    
    public void sum(int a) {
        this.current +=  a;
    }

    public int getCurrent() {
        return this.current;
    }
}
