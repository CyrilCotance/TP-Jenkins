package com.imie.tp.calculator.operation;

public abstract class OperationCommandBase implements OperationCommand {

    public float operandA;
    public float operandB;
    public float currentValue;

    public OperationCommandBase(String operand_a, String operand_b){
        this.operandA = Float.parseFloat(operand_a);
        this.operandB = Float.parseFloat(operand_b);
    }
}
