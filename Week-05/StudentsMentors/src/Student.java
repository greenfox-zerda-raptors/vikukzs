import java.util.ArrayList;

/**
 * Created by Zsuzska on 2016. 11. 15..
 */
public class Student extends Person {
    private ArrayList<Integer> grades;


    public Student(String name, int age){
        super(name, age);

        grades = new ArrayList<>();
    }
    public void addGrade(int grade){
        grades.add(grade);

    }
    public double getAverage(){
        double sum = 0d;
        for (int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
    public String toString(){
        return super.toString() + "and his average is " + getAverage();
    }
}
