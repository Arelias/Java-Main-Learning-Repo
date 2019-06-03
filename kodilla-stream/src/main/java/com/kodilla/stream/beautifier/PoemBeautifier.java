package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    //add method beautify
    public void beautify(String input, PoemDecorator decorator){

        String result = decorator.decorate(input);

        System.out.println("Decorated text: " + result);
    }
}
