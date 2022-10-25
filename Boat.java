public class Boat extends Vehicle {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return String.format("I am %s and I go glug glug!" , getBrand());
    }
    
}
