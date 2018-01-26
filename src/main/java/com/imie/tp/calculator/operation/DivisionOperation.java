package com.imie.tp.calculator.operation;

public class DivisionOperation extends OperationCommandBase {


	public DivisionOperation(String operand_a, String operand_b) {
		super(operand_a, operand_b);
		make();
	}

	@Override
	public void make() {
		if(super.operand_b == 0) {
			super.current_value = Integer.MIN_VALUE;
		}else {
			super.current_value = super.operand_a / super.operand_b;
		}
	}

	@Override
	public float getCurrentValue() {
        return super.current_value;
	}

}
