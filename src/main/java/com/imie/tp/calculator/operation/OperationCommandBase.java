package com.imie.tp.calculator.operation;

/**
 *
 * @author Cyril
 *
 * Abstract class OperationCommandBase
 *
 */
public abstract class OperationCommandBase implements OperationCommand {

    public float operandA;
    public float operandB;
    public float currentValue;

    public OperationCommandBase(String operandA, String operandB){
        this.operandA = Float.parseFloat(operandA);
        this.operandB = Float.parseFloat(operandB);
    }
}
