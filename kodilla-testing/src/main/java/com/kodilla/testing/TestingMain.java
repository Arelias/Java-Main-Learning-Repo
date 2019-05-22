package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        if(Calculator.add(5, 10) == (5+10)){
            System.out.println("addition test OK");
        } else  {
            System.out.println("addition test failed");
        }
        if(Calculator.subtract(5, 10) == (5-10)){
            System.out.println("subtraction test OK");
        } else  {
            System.out.println("subtraction test failed");
        }
    }
}