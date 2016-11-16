/**
 * Created by Zsuzska on 2016. 11. 15..
 */
public class Mentor extends Person {
    private String seniorityLevel;
    private String subject;

    public Mentor(String name, int age, String seniorityLevel, String subject){
        super(name, age);
        this.seniorityLevel = seniorityLevel;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + "is a " + subject + "" + seniorityLevel;
    }
}
