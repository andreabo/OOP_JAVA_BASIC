package programs;

import java.util.ArrayList;
import java.util.List;

public class Career {
    private String name;
    private String description;
    private List<Subject> subjects;

    public Career(String name, String description) {
        this.name = name;
        this.description = description;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}
