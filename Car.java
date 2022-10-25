public class Car extends Vehicle {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {        
        return String.format("I am %s and I go zoom zoom zoom!" , getBrand());
    }
    
}
