package com.imie.tp.calculator.operation;

public class MultiplicationOperation extends OperationCommandBase{

	public MultiplicationOperation(String operand_a, String operand_b) {
		super(operand_a, operand_b);
		make();
	}

	@Override
	public void make() {
		super.current_value = super.operand_a * super.operand_b;
	}

	@Override
	public float getCurrentValue() {
        return super.current_value;
	}


}
