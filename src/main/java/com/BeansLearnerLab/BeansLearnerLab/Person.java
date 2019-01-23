package com.BeansLearnerLab.BeansLearnerLab;

public class Person {

    private Long id;
    private String name;


    public Person(long id, String name) {


        this.id = id;
    }

    public long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

}
