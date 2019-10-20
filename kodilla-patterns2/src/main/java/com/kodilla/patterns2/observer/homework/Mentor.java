package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(HomeworkExercise homeworkExercise) {
        System.out.println(username + ": New exercise by: " + homeworkExercise.getName() + "\n" +
                " (total : " +  homeworkExercise.getExercises().size() + " exercises)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
