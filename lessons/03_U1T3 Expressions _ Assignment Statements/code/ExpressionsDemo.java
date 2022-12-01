public class ExpressionsDemo
{
    public static void main(String[] args)
    {
        /* --------------------------------
            * ASSIGNMENT STATEMENTS
            * The expression on the right is evaluated,
            * and the resulting value is assigned
            */

        // Assigning a literal to a variable
        int x = 5;
        int y = 10;
        System.out.println("x = " + x + " and y = " + y);

        // Assigning a variable to a variable; the VALUE of the variable is assigned
        x = y;
        System.out.println("x = " + x + " and y = " + y);

        // Updating the value of y doesn't affect x
        y = 20;
        System.out.println("x = " + x + " and y = " + y);


        // YOU TRY: come up with some code to swap the values in two variables (hint: use a 3rd "temp" variable!)
        int my1stNum = 10;
        int my2ndNum = 15;
        System.out.println("my1stNum = " + my1stNum + " my2ndNum = " + my2ndNum);

        // SOLUTION:
        int temp = my2ndNum;
        my2ndNum = my1stNum;
        my1stNum = temp;
        System.out.println("my1stNum = " + my1stNum + " my2ndNum = " + my2ndNum);

            
        /* MATH OPERATORS & EXPRESSIONS
            * Operators: * / % + -  (% = mod, or modulo, aka "remainder operator")
            * Operator precedence (same as math): first (), then * / % (L to R), then + - (L to R)
            */
            
        int a = 3;
        int b = 4;
        int c = 5;

        a = b + 2 * c - 10 / 5;
        System.out.println("a = " + a);

        a = (b + 2) * (c - 10) / 5;
        System.out.println("a = " + a);

        // Division by zero gives an ArithmeticException, which is
        // a runtime error (as opposed to compile-time error)
        c = (5 * b) / 0;
        c = (5 * b) / (a - 3); //always be careful when dividing by an expression involving a variable that might change in your program!

        // Let's practice with modulo (remainder)
        // TRY THESE ON YOUR OWN: Pencil & Paper!
        int e = 17 % 5;
        int f = 18 % 5;
        int g = 19 % 5;
        int h = 20 % 5; 
        int i = 7 % 5;
        int j = 3 % 5;
        int k = 0 % 5;
        int m = 5 % 0;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);    
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("m = " + m);

        /* ------------------------
            * MATH WITH INTS & DOUBLES
            *
            * RUN a few statements like this to determine:
            * what are the rules for math between two integers, two doubles, and one of each?
            * int + int = ?   double + double = ?   int + double = ?
            * try each of the operators
            */
        System.out.println(3 + 2);
        System.out.println(3 + 2.0);
        System.out.println(3.0 + 2);
        System.out.println(3.0 + 2.0);


        // careful with division between integers!
        System.out.println(10 / 5);
        System.out.println(10 / 4);
        System.out.println(10 / 3);
        System.out.println(3 / 2);
        System.out.println(1 / 3);
        System.out.println(2 / 3);
        System.out.println(9 / 10);

        System.out.println(10.0 / 5);
        System.out.println(10.0 / 4.0);
        System.out.println(10 / 3.0);
        System.out.println(3.0 / 2.0);
        System.out.println(1.0 / 3);
        System.out.println(2 / 3.0);
        System.out.println(9.0 / 10.0);

        /* CONCLUSION! MATH WITH INTS & DOUBLES
            math expressions using any operator that use TWO ints will result in an INT
            math expressions using any operator that use TWO doubles will result in a DOUBLE
            math expressions using any operator that uses ONE int and ONE double will result in a DOUBLE!
            */
            
        double s = 8.25;
        int t = 2;
        int u = 10;

        // Will the code below compile?  if not, why not?
        double z = t + u;
        int d = s + t;  // s + t results in double, but you can't store a double in an int
        double v = s / (t + 0.75);
        int w = 2 * s;  // 2 * s results in double, but you can't store a double in an int

        // if so, what's the output?
        System.out.println("z = " + z + ", w = " + w);


        // Expressions with mod: pencil & paper!
        int num1 = 5;
        int num2 = 9;
        System.out.println(4 + num1 * 6 % num2);
        System.out.println(num2 % num1 / 5);

        int p = 3 / (5 % 3);
        int q = (2 + 4) * 3;
        double r = 2 * p + q;
        System.out.println("p = " + p + ", q = " + q + ", r = " + r);


        // Expressions involving the variable with itself
        int score = 0;

        score = score + 1;  // "increment by 1" --> so popular we have a shortcut for this!
        System.out.println("score = " + score);

        score = score + 5;
        System.out.println("score = " + score);

        score = 5 * score;
        System.out.println("score = " + score);

        // what prints here?  why?
        System.out.println(score);
        System.out.println(score + 1);
        System.out.println("score = " + score);
        System.out.println("score = " + score + 1); 

        /* UPDATING VARIABLES (revisiting this idea from beginning) */
        double cost = 0.50;
        int numFruit = 5;
        double totalPrice =  cost * numFruit;
            
        System.out.print("Total price = " + totalPrice);

        // hey! we got 8 pieces of fruit now so
        // let's update our cost. will this output an updated price?
        numFruit = 8;
        System.out.print("Total price = " + totalPrice);

        // What do we need to do in order to "update the price with the new value?"
        totalPrice =  cost * numFruit;
        System.out.print("Total price = " + totalPrice);
    }
}