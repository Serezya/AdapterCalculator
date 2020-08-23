package org.example;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return calc(Calculator.Operation.SUM, arg0, arg1);
    }

    @Override
    public int sub(int arg0, int arg1) {
        return calc(Calculator.Operation.SUB, arg0, arg1);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calc(Calculator.Operation.MULT, arg0, arg1);
    }

    @Override
    public int div(int arg0, int arg1) {
        return calc(Calculator.Operation.DIV, arg0, arg1);
    }

    @Override
    public int pow(int arg0, int arg1) {
        return calc(Calculator.Operation.POW, arg0, arg1);
    }

    private int calc(Calculator.Operation op, int arg0, int arg1) {
        return (int) target.newFormula()
                .addOperand(arg0).addOperand(arg1)
                .calculate(op)
                .result();
    }
}
