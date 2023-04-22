package com.rcasia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CalculatorCommandHandler {

    private SumUseCase sumUseCase;

    public void handle(SumCommand sumCommand) {
        this.sumUseCase.sum(sumCommand.getFirstNumber(), sumCommand.getSecondNumber());
    }
}
