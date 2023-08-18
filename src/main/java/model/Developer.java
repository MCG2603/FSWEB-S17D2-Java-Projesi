package model;

public class Developer {

    private int id;
    private String name;
    private String salary;
    private Enum experience;


    public Developer(int id, String name, String salary, Enum experience) {
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

    public Enum getExperience() {
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

    public void setExperience(Enum experience) {
        this.experience = experience;
    }
}
