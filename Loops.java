import  java.util.Scanner;

public class Loops {
    public static  void  main (String [] args) {

        int number = 0;

       // System.out.println("Give me a degree in number");
       // Scanner input = new Scanner(System.in);

// I want to do like the user give a number and there has a random formula in the system. So as the user put a number in the formula if it not over 100. User need to give another number just keep doing it. When is over 100 then is the end of the loop.

       while (number <100) {
            System.out.println(number);
           number = number + 1;
        }

        System.out.println("This is the end of this loop.");
    }
}
