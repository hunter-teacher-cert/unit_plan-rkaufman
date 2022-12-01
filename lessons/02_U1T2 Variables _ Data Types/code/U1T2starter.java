/* Author: R. Kaufman & Y. Levels
   Sample Program for U1T2
*/
public class Main
{
    public static void main(String[] args)
    {
        // declare and initialize a constant
        final double GRAMS_PER_POUND = 453.59237;

        // declare and initialize variables
        String firstName = "Adam";
        String lastName = "Smith";
        double height = 79.5; // inches
        int weight = 165; // pounds
        int age = 23;
        boolean isAdult = true;
        
        // print out information using string concatentation
        System.out.println(firstName + " " + lastName + " is " + height + " inches tall.");
        System.out.println(firstName + " weighs " + weight + " pounds.");

        double gramWeight = weight * GRAMS_PER_POUND; // converting Adam's weight to grams
        System.out.println("There are " + GRAMS_PER_POUND + " grams in one pound.");
        System.out.println(firstName + " weighs " + gramWeight + " grams.");
        
        System.out.println(firstName + " is " + age + " years old.");
        System.out.println("True or false? Adam is an adult: " + isAdult);
    }
}