public class Hangar {

    public static void main(String[] args) {
        Car clio = new Car("Renaud", 150000);
        Boat Concordia = new Boat("Costa", 100000000);

        System.out.println(clio.doStuff());
        System.out.println(Concordia.doStuff());
    }
    
}

 