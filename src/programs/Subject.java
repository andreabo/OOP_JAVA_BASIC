package programs;

public abstract class Subject {
    protected String name;
    protected String description;
    protected String content;
    protected int credits;

    public Subject(String name, String description, String content, int credits) {
        this.name = name;
        this.description = description;
        this.content = content;
        this.credits = credits;
    }
}
