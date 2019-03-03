package persons;

public class Professor extends Person{
    private int salary;

    public Professor(int cc, String name, String lastName, String email, String birthday, int salary) {
        super(cc, name, lastName, email, birthday);
        this.salary = salary;
    }

    @Override
    public String sayHello() {
        return "Good morning alumnitos :D ";
    }
}
