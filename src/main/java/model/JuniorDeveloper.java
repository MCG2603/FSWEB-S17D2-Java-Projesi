package model;

public class JuniorDeveloper extends Developer{
    public JuniorDeveloper(int id, String name, String salary, Enum experience) {
        super(id, name, salary, experience);
        setExperience(Experience.JUNIOR);
    }
}
