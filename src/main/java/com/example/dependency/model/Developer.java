package com.example.dependency.model;

public class Developer {

    private int id;
    private String name;
    private String salary;
    private Experience experience;


    public Developer(int id, String name, String salary, Experience experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
