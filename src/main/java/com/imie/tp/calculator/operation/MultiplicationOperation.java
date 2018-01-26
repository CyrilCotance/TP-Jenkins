package com.imie.tp.calculator.operation;

/**
 *
 * @author Cyril
 *
 * Classe Multiplication
 */
public class MultiplicationOperation extends OperationCommandBase{

    public MultiplicationOperation(String operandA, String operandB) {
        super(operandA, operandB);
        make();
        System.out.println("Result : " + getCurrentValue());
    }

    @Override
    public void make() {
        super.currentValue = super.operandA * super.operandB;
    }

    @Override
    public float getCurrentValue() {
        return super.currentValue;
    }


}
