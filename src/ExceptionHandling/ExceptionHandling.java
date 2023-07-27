package ExceptionHandling;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
//        int[] numbers = {1, 2, 3};
        //Exception easy fix in program
        //System.out.println(numbers[999]); //Exception index out of bounds
//        System.out.println(numbers[1]);

        //Error not an immediate remedy for program
        //int[] secondArray = {"nik", 1};// Error incompatible types stored in an array

        try {
            System.out.println("Let's see...");
            // atm withrawal
            int result = 1 / 0; // 1. catch stops exception here
            // limit
            System.out.println("I can divide by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Math still works!"); // 2. runs exception here
            // if withrawal is greater than daily limit
            // throw exceptions here
        }

        int[] numbers = {1, 2, 3};
        int x;

        try {
            x = numbers[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an array index exception!"); // withdrawal past atm daily allowance
        } catch (Exception e) {
            System.out.println("Caught a generic exception!"); // withdrawal past account balance
        } finally {
            System.out.println("This will always run."); // print receipt
        }

        getIndentationPreference();

        String indentationPreference;

        try {
            indentationPreference = getIndentationPreference();
            System.out.println("Okay, " + indentationPreference + " is a great choice.");
        } catch (Exception e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
        }


    }

    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();
        Integer.valueOf(indentationPreference );

        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");

        }

        return indentationPreference;
    }




}
