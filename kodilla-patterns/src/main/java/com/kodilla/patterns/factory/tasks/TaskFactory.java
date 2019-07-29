package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving task","Poland", "Audi TT");
            case PAINTING:
                return new PaintingTask("Painting task", "Blue","Bathroom");
            case SHOPPING:
                return new ShoppingTask("Shopping task", "Apples", 20.0);
            default:
                return null;
        }

    }
}
