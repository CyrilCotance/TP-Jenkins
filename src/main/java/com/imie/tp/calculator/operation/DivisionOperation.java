package com.imie.tp.calculator.operation;

/**
 *
 * @author Cyril
 *
 * Classe Division
 *
 */
public class DivisionOperation extends OperationCommandBase {

    public DivisionOperation(String operandA, String operandB) {
        super(operandA, operandB);
        make();
        System.out.println("Result : " + getCurrentValue());
    }

    @Override
    public void make() {
        if (super.operandB == 0) {
            super.currentValue = Integer.MIN_VALUE;
        } else {
            super.currentValue = super.operandA / super.operandB;
        }
    }

    @Override
    public float getCurrentValue() {
        return super.currentValue;
    }

}
