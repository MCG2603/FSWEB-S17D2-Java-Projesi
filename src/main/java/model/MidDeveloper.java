package model;

public class MidDeveloper  extends Developer{
    public MidDeveloper(int id, String name, String salary, Enum experience) {
        super(id, name, salary, experience);
        setExperience(Experience.MID);
    }
}
