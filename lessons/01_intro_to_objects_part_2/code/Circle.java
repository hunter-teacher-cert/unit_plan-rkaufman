public class Circle {

    // instance variables
    private double radius;

    // constructor
    public Circle(double rad) {
        radius = rad;
    }

    // method that calculates and prints the area
    public void printArea() {
        double area = 3.14 * radius * radius;
        System.out.println("My area is: " +  area);
    }

    // method that calculates and returns the area
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    // method that calculates and returns the volume of a cylinder
    // with a circular base with r equal to "radius" and h equal to
    // the "height" value passed in as the parameter
    public double calculateCylinderVolume(double height) {
        return 3.14 * radius * radius * height; // volume
    }
}
