/**
 * Created by Zsuzska on 2016. 11. 15..
 */
public class Person {

    String name;
    int age;

    public Person(){
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return String.format("Name: %s, Age: %s ",
               name,
                age
        );
    }
}
