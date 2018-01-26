package com.imie.tp.calculator.operation;

public abstract class OperationCommandBase implements OperationCommand {

	public float operand_a;
	public float operand_b;
	public float current_value;

	public OperationCommandBase(String operand_a, String operand_b){
		this.operand_a = Float.parseFloat(operand_a);
		this.operand_b = Float.parseFloat(operand_b);
	}
}
