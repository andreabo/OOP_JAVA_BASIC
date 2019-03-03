package programs;

import persons.Professor;
import persons.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utils.Utils.calculateAverage;

public class Course extends Subject {
    private List<Student> students;
    private Professor professor;

    private Map<Integer, Map<Integer, double[]>> grades;
    private static final int PERIODS = 3;

    public Course(String name, String description, String content, int credits) {
        super(name, description, content, credits);
        students = new ArrayList<>();
        grades = new HashMap<>();
//        for (int i = 0; i < PERIODS; i++) {
//            grades.add(new HashMap<>());
//        }
    }

    public double[] getAverageByDuration(int cc) {
        double[] average = new double[PERIODS];
        for (int i = 0; i < PERIODS; i++) {
            average[i] = calculateAverage(grades.get(i + 1).get(cc));
        }
        return average;

    }

    public double getAverage(int cc) {
        double sum = 0;
        double[] averages = getAverageByDuration(cc);
        for (double grade : averages) {
            sum += grade;
        }
        return sum / PERIODS;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addGradesByPeriod(int cc, int period, double[] grades) {
        Map<Integer, double[]> map = new HashMap<>();
        map.put(cc, grades);

        if (this.grades.get(period) != null) {
            this.grades.get(period).put(cc, grades);
        } else {
            this.grades.put(period, map);
        }


    }
}
