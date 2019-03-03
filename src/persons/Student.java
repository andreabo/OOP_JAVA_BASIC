package persons;

import programs.Career;

public class Student extends Person {
    private int average;
    private Career career;

    public Student(int cc, String name, String lastName, String email, String birthday) {
        super(cc, name, lastName, email, birthday);
    }

    public int getAverage() {
        return this.average;
    }

    public void assignCareer(Career career) {
        this.career = career;
    }

    @Override
    public String sayHello() {
        return "Good morning profe";
    }
}
