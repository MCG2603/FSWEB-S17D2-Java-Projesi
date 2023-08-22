package com.example.dependency.model;

public class SeniorDeveloper extends Developer{
    public SeniorDeveloper(int id, String name, String salary, Experience experience) {
        super(id, name, salary, experience);
        setExperience(Experience.SENIOR);
    }
}
