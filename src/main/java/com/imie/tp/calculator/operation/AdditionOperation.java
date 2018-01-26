package com.imie.tp.calculator.operation;

/**
 *
 * @author Cyril
 *
 * Classe Addition
 *
 */
public class AdditionOperation extends OperationCommandBase {

    public AdditionOperation(String operandA, String operandB) {
        super(operandA, operandB);
        make();
        System.out.println("Result : " + getCurrentValue());
    }

    @Override
    public void make() {
        super.currentValue = super.operandA + super.operandB;
    }

    @Override
    public float getCurrentValue() {
        return super.currentValue;
    }

}
