package model;

public class SeniorDeveloper extends Developer{
    public SeniorDeveloper(int id, String name, String salary, Enum experience) {
        super(id, name, salary, experience);
        setExperience(Experience.SENIOR);
    }
}
