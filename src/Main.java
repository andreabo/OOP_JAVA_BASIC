import persons.Professor;
import persons.Student;
import programs.Career;
import programs.Course;

public class Main {
    public static void main(String[] args) {
        Career systemsEngineering = new Career("Systems Engineering", "This is a good one");

        Professor profeSergio = new Professor(123123, "Sergio",
                "Forero",
                "sergio.forero@endava.com",
                "2019-07-24",
                123123);

        Course oop = new Course("Object Oriented Programming",
                "Pues ajá",
                "Encapsulamiento, Herencia, Polimorfismo, Abstraccion",
                10);

        Student lucho = new Student(123456,
                "Lucho",
                "Garzon",
                "lucho.garzon@endava.com",
                "2019-11-06");

        Student alejo = new Student(123567,
                "Alejo",
                "Barreto",
                "alejo.barreto@endava.com",
                "2019-10-12");

        lucho.assignCareer(systemsEngineering);
        alejo.assignCareer(systemsEngineering);

        oop.assignProfessor(profeSergio);
        oop.addStudent(lucho);
        oop.addStudent(alejo);

        oop.addGradesByPeriod(lucho.getCc(), 1, new double[]{3.5, 4.5, 3.7});
        oop.addGradesByPeriod(lucho.getCc(), 2, new double[]{3.5, 4.5, 4.7});
        oop.addGradesByPeriod(lucho.getCc(), 3, new double[]{2.5, 5, 4.2});

        oop.addGradesByPeriod(alejo.getCc(), 1, new double[]{2.5, 3.5, 3.7});
        oop.addGradesByPeriod(alejo.getCc(), 2, new double[]{4.5, 4.9, 2.7});
        oop.addGradesByPeriod(alejo.getCc(), 3, new double[]{3.5, 4.9, 2.8});

        double averageLucho = oop.getAverage(lucho.getCc());
        double averageAlejo = oop.getAverage(alejo.getCc());

        printMessageByAverage(averageLucho);
        printMessageByAverage(averageAlejo);
    }

    public static void printMessageByAverage(double average) {
        if (average <= 2.9) {
            System.out.println("Mediocre");
        } else if (average >= 3.0 && average <= 4.0) {
            System.out.println("Estas en el promedio");
        } else {
            System.out.println("La excelencia :D");
        }
        System.out.println("Average: " + average);
    }
}
