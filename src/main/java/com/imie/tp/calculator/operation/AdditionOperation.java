package com.imie.tp.calculator.operation;

public class AdditionOperation extends OperationCommandBase {

    public AdditionOperation(String operand_a, String operand_b) {
		super(operand_a, operand_b);
		make();
        System.out.println("Result : " + getCurrentValue());
	}

	@Override
    public void make() {
		super.current_value = super.operand_a + super.operand_b;
    }

	@Override
    public float getCurrentValue() {
        return super.current_value;
    }

}
