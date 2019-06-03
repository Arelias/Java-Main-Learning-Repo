package com.kodilla.stream.lambda;


//So we use interface that accepts 2 variables
//Math expression can be anything: - + * /
//So very nice way to make calculator
public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }
}