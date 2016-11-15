/**
 * Created by Zsuzska on 2016. 11. 14..
 */
// Car.java
public class Car {
    //Add somethings here to create a car and some fields
    private int sizeEngine;
    private String color;
    private int kmOdometer;
    private String typeCar;

    public Car(){
        sizeEngine = 1600;
        color = "red";
    }

    public Car(String typeCar, String color){
        this.typeCar = typeCar;
        this.color = color;
        this.sizeEngine = 1600;
        this.kmOdometer = 10;
    }

    public Car(int sizeEngine, int kmOdometer){
        this.typeCar = "Mazda";
        this.color = "red";
        this.sizeEngine = sizeEngine;
        this.kmOdometer = kmOdometer;
    }

    public Car(String typeCar, String color, int sizeEngine, int kmOdometer){
        this.typeCar = typeCar;
        this.color = color;
        this.sizeEngine = sizeEngine;
        this.kmOdometer = kmOdometer;
    }
    public Car(String typeCar, String color, int sizeEngine) {
        this.typeCar = typeCar;
        this.color = color;
        this.sizeEngine = sizeEngine;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getSizeEngine() {
        return sizeEngine;
    }

    public void setSizeEngine(int sizeEngine) {
        this.sizeEngine = sizeEngine;
    }

    public int getKmOdometer() {
        return kmOdometer;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return  String.format("This %s is %s, has %s cc engine and clocked %s km's.",
                typeCar,
                color,
                sizeEngine,
                kmOdometer
        );

    }

    public void drive(int km){
        if (km < 20){
            kmOdometer = kmOdometer + km;
            System.out.printf( "brrm, %s just drove around town %s clicks.\n",
                   typeCar,
                    km);
        }
        if (km < 50){
            kmOdometer = kmOdometer + km;
            System.out.printf( "brrm, screech, brrm, screech; %s commuted %s clicks.\n",
                    typeCar,
                    km);
        }

    }
}

