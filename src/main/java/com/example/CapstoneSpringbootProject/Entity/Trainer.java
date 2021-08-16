package com.example.CapstoneSpringbootProject.Entity;

public class Trainer {
    private String exercise;
    private int weight;

    public Trainer(String exercise, int weight) {
        this.exercise = exercise;
        this.weight = weight;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
