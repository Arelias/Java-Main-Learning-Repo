package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier beautifier = new PoemBeautifier();

        System.out.println("Beautifying");

        beautifier.beautify("My text to be beautified UpperCase", input -> input.toUpperCase());
        beautifier.beautify("My text to be beautified LowerCase", input -> input.toLowerCase());
        beautifier.beautify("My text to be beautified added letters", input -> input + " ABC");
        beautifier.beautify("My text to be beautified added letters", input -> "ABC " + input);
        beautifier.beautify("My text to be beautified my own way one", input -> {
            char[] test = input.toCharArray();
            for (int i = 0; i < test.length; i++) {
                if (i % 2 == 0) {
                    test[i] = Character.toLowerCase(test[i]);
                } else {
                    test[i] = Character.toUpperCase(test[i]);
                }
            }
            input = new String(test);
            return input;
        });
        beautifier.beautify("My text to be beautified my own way two", input -> {
            char[] test = input.toCharArray();
            for (int i = test.length - 1; i >= 0; i--) {
                test[i] = input.charAt(test.length-1 - i);
            }
            input = new String(test);
            return input;
        });


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}

//public class StreamMain {
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);
//    }
//}

//public class StreamMain {
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);
//    }
//}