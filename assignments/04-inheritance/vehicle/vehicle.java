public class vehicle {
    public static void main(String[] args) {
        System.out.println("Name: Faizan Ahmed Shaikha");
        System.out.println("Register Number: 25BTIT146");

        vehicle vehicle = new vehicle();
        vehicle.start();
        vehicle.new car().start();
        vehicle.new pagani().start();
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }
class car extends vehicle {

    public void start() {
        System.out.println("Car is starting");
    }
}
 class pagani extends vehicle {
    public void start() {
        System.out.println("Pagani is starting");
    }
   }
 }
