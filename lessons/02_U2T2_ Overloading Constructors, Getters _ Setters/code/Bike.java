public class Bike {

    // instance variables
    private String model;
    private int speed;

    // constructor
    public Bike(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void printInfo() {
        System.out.println("model: " + model + ", speed: " + speed);
    }
}
