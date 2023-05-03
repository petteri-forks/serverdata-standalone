package com.example.servermaintenance.interpreter.evaluator;

public record EvalInteger(int value) implements EvalObject {
    @Override
    public EvalObjectType getType() {
        return EvalObjectType.INTEGER;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    public int getValue() {
        return value;
    }
}
