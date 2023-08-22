package com.example.dependency.model;

public class MidDeveloper  extends Developer{
    public MidDeveloper(int id, String name, String salary, Experience experience) {
        super(id, name, salary, experience);
        setExperience(Experience.MID);
    }
}
