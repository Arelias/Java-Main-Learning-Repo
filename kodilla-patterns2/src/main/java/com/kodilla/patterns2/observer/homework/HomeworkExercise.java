package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkExercise implements Observable {
    private final List<Observer> mentors;
    private final List<String> exercises;
    private final String trainee;

    public HomeworkExercise(String trainee) {
        this.mentors = new ArrayList<>();
        this.exercises = new ArrayList<>();
        this.trainee = trainee;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getName() {
        return trainee;
    }

    public void addExercise(String exercise){
        exercises.add(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : mentors){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }
}
