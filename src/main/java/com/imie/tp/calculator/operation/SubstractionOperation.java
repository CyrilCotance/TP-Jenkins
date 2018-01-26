package com.imie.tp.calculator.operation;

/**
 *
 * @author Cyril
 *
 * Classe multiplication
 *
 */
public class SubstractionOperation extends OperationCommandBase {

    public SubstractionOperation(String operandA, String operandB) {
        super(operandA, operandB);
        make();
    }

    @Override
    public void make() {
        super.currentValue = super.operandA - super.operandB;
    }

    @Override
    public float getCurrentValue() {
        return super.currentValue;
    }

}
