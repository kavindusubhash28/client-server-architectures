

/**
 *
 * @author kavin
 */
public class Car {
    
    String make;
    String model;
    int year;
    
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
