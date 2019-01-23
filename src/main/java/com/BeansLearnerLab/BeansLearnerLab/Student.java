package com.BeansLearnerLab.BeansLearnerLab;

public class Student extends Person implements Learner {

    private double totalStudyTime;


    public Student(long ID, String name) {

        super(ID, name);

    }

    @Override
    public void learn(double numberOfHours) {

        totalStudyTime += numberOfHours;

    }

    public double getTotalStudyTime() {

        return this.totalStudyTime;
    }


}
