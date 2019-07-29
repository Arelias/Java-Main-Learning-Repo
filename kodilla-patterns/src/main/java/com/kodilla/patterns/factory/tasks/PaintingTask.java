package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    boolean isDone;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isDone = false;
    }

    @Override
    public void exectuteTask() {
        this.isDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return isDone;
    }
}