package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"1234567890", "John", "Smith"},
            {"2234567890", "Peter", "Parker"},
            {"3234567890", "Barrack", "Obama"},
            {"4234567890", "Fizz", "Buzz"}};
    private double[] salaries = {
            4500.00,
            1254.00,
            6000.00,
            5250.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        } else {
            return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
        }
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
