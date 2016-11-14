/**
 * Created by Zsuzska on 2016. 11. 14..
 */
public class Workshop01 {
    public static void main(String[] args){
        Car myCar1 = new Car();
        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                "puke" , 1 // replace this stuff with the way we get those attributes about myCar1
        );
        myCar1.setTypeCar("Mazda");
        myCar1.setKmOdometer(12312);

        Car myCar2 = new Car();
        myCar2.setColor("silver");
        myCar2.setTypeCar("Ford");
        myCar2.setSizeEngine(2500);
        myCar2.setKmOdometer(152312);

        Car myCar3 = new Car();
        myCar3.setColor("green");
        myCar3.setTypeCar("Beamer");
        myCar3.setSizeEngine(2800);
        myCar3.setKmOdometer(42521);

        System.out.printf(myCar1.toString());
        System.out.printf(myCar2.toString());
        System.out.printf(myCar3.toString());

        Car myCar05 = new Car("Opel", "white", 1400, 25);
        Car myCar06 = new Car("VW", "grey");
        Car myCar07 = new Car(1100, 15);

        System.out.printf(myCar05.toString());
        System.out.printf(myCar06.toString());
        System.out.printf(myCar07.toString());



    }
}
