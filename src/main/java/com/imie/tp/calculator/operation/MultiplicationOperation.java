package com.imie.tp.calculator.operation;

/**
 *
 * @author Cyril
 *
 * Classe Multiplication
 */
public class MultiplicationOperation extends OperationCommandBase{

    public MultiplicationOperation(String operand_a, String operand_b) {
        super(operand_a, operand_b);
        make();
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
