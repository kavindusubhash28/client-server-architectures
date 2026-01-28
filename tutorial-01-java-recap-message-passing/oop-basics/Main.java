

/**
 *
 * @author kavin
 */
public class Main {
    public static void main(String[] args){
        
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic",2021);
        
        car1.displayInfo();
        
        car2.year = 2022;
        
        car2.displayInfo();
    }
}
