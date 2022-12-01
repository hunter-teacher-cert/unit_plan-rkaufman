public class CastingOverview
{
  public static void main(String[] args)
  {
    int someInt = 45;
    double someDouble = 42.83;

    // it’s likely that, at some point in writing complex programs,
    // that you will want to convert a double value into an int value

    // as we have seen, something like this will cause an error:
//    someInt = someDouble;

    /* --------------------------------
       -- the (int) casting operator --
       --------------------------------
     */
    
    // you can "convert" a double to an int by CASTING from a double to
    // an int; "casting" is used for converting between number types and
    // can be done using the "casting" operator: (int)
    someInt = (int) someDouble;

    // this creates a temporary int value from the double value in someDouble and
    // assigns that value to someInt; this does NOT affect someDouble's type
    // OR value (someDouble is still a double with a value 52.83). when casting
    // from a double to an int, the new value is the double's value
    // TRUNCATED at the decimal (NOT rounded):
    System.out.println("someInt = " + someInt);
    System.out.println("someDouble = " + someDouble);
    
    // we often see casting used inside of mathematical expressions,
    // as shown in the examples below
    
    // IMPORTANT!
    // the casting operator applies only to the number IMMEDIATELY to the right,
    // so if you use the casting operator OUTISDE a set of ( ) in a mathematical
    // expression, the expression inside the ( ) evaluates FIRST, and THEN the
    // casting occurs on THAT result
    
    // EXAMPLES using (int)
    double num1 = 5.6;
    double num2 = 3.9;
        
    // what will each statements print?  an int or a double, and what value?
    // note: added whitespace (ignored) is to help show the expression clearly
    // CLICK "READY" in zoom poll when you have your predictions!
    System.out.println(  num1 + num2              ); // prints a double: 9.5
    System.out.println(  (int) num1 + num2        ); // prints a double: 8.9
    System.out.println(  num1 + (int) num2        ); // prints a double: 8.6
    System.out.println(  (int) num1 + (int) num2  ); // prints an int: 8
    System.out.println(  (int) (num1 + num2)      ); // prints an int: 9 

    /* -----------------------------------------
       ----- rounding by casting with (int) ----
       -----------------------------------------
     */
     
     // a common challenge when casting double -> int that the decimal is truncated
     // rather than rounded. fortunately, there is a cool way to use casting
     // in order to round a decimal to the nearest integer
     
     // CAN YOU FIGURE OUT WHAT IT IS?  a little programming challenge!
     
     // see if you can figure out a way to use CASTING to get
     // roundedAverage to be correct:
     
     double price = 4.85;
     
     int roundedPrice = //???  HINT: it involves a 0.5
     
     // SOLUTION:
     roundedPrice = (int) (price + 0.5);
     System.out.println("roundedPrice = " + roundedPrice);

     // this strategy can also be used for rounding negative numbers:
     
     double temperature = -15.6;
     
     int tempRounded = (int) (temperature - 0.5);
     System.out.println("tempRounded = " + tempRounded);
    
    /* --------------------------------
       -- the (double) casting operator --
       --------------------------------
     */
         
    // we can also use the related (double) operator to cast from an int to a double:
    int someInt2 = 60;
    double someDouble2 = 34.7;
        
    someDouble2 = (double) someInt2;
    System.out.println("someInt2 = " + someInt2);
    System.out.println("someDouble2 = " + someDouble2);
    
    // of course, recall Java can handle an int -> double conversion AUTOMATICALLY;
    // this "behind the scenes" process for int -> double is called "widening"
    // (does NOT work for double -> int)
    someDouble2 = someInt2;
    System.out.println("someDouble2 = " + someDouble2);
    
    // so why do we need a (double) casting operator?
    // it's mostly used to facilitate mathematical operations between ints and doubles,
    // particularly when we desire a double output but only have ints to work with
    
    // EXAMPLES using (double)
    int num3 = 8;
    int num4 = 9;
    
    // what will each statements print?  an int or a double, and what value?
    // note: added whitespace (ignored) is to help show the expression clearly
    System.out.println(  num3 + num4                   ); // prints an int: 17
    System.out.println(  (double) num3 + num4          ); // prints a double: 17.0
    System.out.println(  num3 + (double) num4          ); // prints a double: 17.0
    System.out.println(  (double) num3 + (double) num4 ); // prints an double: 17.0
    System.out.println(  (double) (num3 + num4)        ); // prints an double: 17.0 

        
    // a common example for (double) is finding an average of ints
    int score1 = 85;
    int score2 = 90;
    int sum = score1 + score2;
    double averageScore = sum / 2;
    
    System.out.println("sum = " + sum);
    System.out.println("average = " + averageScore);
    
    // but we get 87.0 and what we expect to see is 87.5... why?
    // (note: Java has automatically "widened" 87 to 87.0 to store as a double)
    
    // THINK AND SHARE!  what are some ways we could use casting to get 87.5?
    
    // what we can do is CAST either of those values to double so the
    // math involves at least one double (since math operations between
    // one double and one int OR two doubles results in a double)
    
    averageScore = (double) sum / 2; // casting applied only  to sum
    System.out.println("average = " + averageScore);
    
    // OR
    averageScore = sum / (double) 2; // casting applied only to 2
    System.out.println("average = " + averageScore);

    // OR
    averageScore = (double) sum / (double) 2; // casting applied to both
    System.out.println("average = " + averageScore);
    
    // again, casting does NOT affect the value or type of the variable being casted
    System.out.println("sum = " + sum);
    
    // CAREFUL THOUGH!  what happens here and why?
    averageScore = (double) (sum / 2);
    System.out.println("average = " + averageScore);
    
    // you might think: why not just use all doubles all the time to be safe so you
    // don't ever have to worry about casting?
    
    // any ideas why that may not be the best approach?
    
    // up until now, doing this may have seemed like a sensible "safe" approach.
    // but now, with casting, there is built-in flexibility between number types
    // so you can always use ints or doubles as appropriate (as you should!),
    // knowing you can easily convert between those types later on as needed
    
    /* --------------------------------
       --- max and min value of int ---
       --------------------------------
     */
     
     // recall that an integer variable takes up 32-bits (4-bytes) of memory
     // and the value is stored in binary, so you would think the max possible
     // integer that could be stored would be 2^32 = 4,294,967,296.
     // however, we are able to store positive AND negative integer values,
     // because one of those 32-bits acts like a "sign" bit, and so we can effectively
     // store a max value HALF that size (2^31), with either a positive or negative
     // sign.  we call this "32-bit signed two's complement" and the way this is
     // actually internally implemented (we won't go into details here),
     // results in us being able to store an integer with a MAX value
     // of (2^31 - 1) = 2,147,483,647 and a MIN value of (-2^31) = -2,147,483,648
     
     // you don't need to memorize these exact values, but it's important
     // to be aware of this upper and lower bound with int values;
     // if you try to store a value that is GREATER than the MAX or LESS
     // than the MIN, you will get an OVERFLOW error:
     
     int someBigPosNum = 2147483600;  // could also use _ for a comma: 2_147_483_600
     int someBigNegNum = -2147483600; // could also use _ for a comma: -2_147_483_600
     
     System.out.println("big pos num = " + someBigPosNum);
     System.out.println("big neg num = " + someBigNegNum);
     
     // now lets do an operation that would result in a value too big or too small:
 
     someBigPosNum += 50;  // this causes value to exceed max of 2,147,483,647
     someBigNegNum -= 50;  // this causes value to be less than min of -2,147,483,648

     // this will produce an OVERFLOW ERROR, however this DOES NOT LEAD TO AN EXCEPTION
     // like divide by 0 wirh the program stopping (it does in some languages, but not Java);
     // INSTEAD, it just wraps around!!!
     System.out.println("big pos num = " + someBigPosNum);
     System.out.println("big neg num = " + someBigNegNum);
     
     // we are discussing this now, because it CAN be an issue when casting doubles
     // to ints, because doubles CAN hold much larger values:
     double someBigDouble = 35900000000000000.8;
     System.out.println("big double = " + someBigDouble);
     
     int bigInt = (int) someBigDouble;
     System.out.println("big int = " + bigInt);
          
     // you don't need to memorize these values; Java has them accessible
     // in these two constants (static fields of the Integer class), which
     
     int maxInt = Integer.MAX_VALUE;
     int minInt = Integer.MIN_VALUE;
     System.out.println("max int = " + maxInt);
     System.out.println("min int = " + minInt);
     
     // moral of the story: if you are working on a program that uses VERY LARGE
     // numbers (particular 
  }
}
