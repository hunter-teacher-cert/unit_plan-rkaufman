public class Point {

    // instance variables
    private int x;
    private int y;

    // constructor that takes x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // constructor that takes one value and sets x and y to that value
    public Point(int num) {
        x = num;
        y = num;
    }

    // constructor that has no parameters and sets x and y to 0
    public Point() {
        x = 0;
        y = 0;
    }

    // "getter" method for x instance variable
    public int getX() {
        return x;
    }

    // "getter" method for y instance variable
    public int getY() {
        return y;
    }

    // "setter" method for x instance variable
    public void setX(int newX) {
        x = newX;
    }

    // "setter" method for y instance variable
    public void setY(int newY) {
        y = newY;
    }

    // method that returns coordinate String
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    // method that returns quadrant of point
    public String quadrant() {
        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else if (x > 0 && y < 0) {
            quadrant = "IV";
        } else if (x == 0 && y == 0) {
            quadrant = "origin";
        } else {
            quadrant = "on an axis";
        }
        return quadrant;
    }
}
