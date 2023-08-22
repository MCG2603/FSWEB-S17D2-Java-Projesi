package com.example.dependency.model;

public class JuniorDeveloper extends Developer{
    public JuniorDeveloper(int id, String name, String salary, Experience experience) {
        super(id, name, salary, experience);
        setExperience(Experience.JUNIOR);
    }
}
