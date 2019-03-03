package persons;

import java.time.LocalDate;

public abstract class Person implements IMyFirstDay {
    private int cc;
    private String name;
    private String lastName;
    private String email;
    private LocalDate birthday;

    public Person(int cc, String name, String lastName, String email, String birthday) {
        this.cc = cc;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.birthday = LocalDate.parse(birthday);
    }

    public int getCc() {
        return cc;
    }
}
