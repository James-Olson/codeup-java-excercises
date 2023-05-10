package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }
    //you can "construct" an object many ways this is constructing "instance" of an object.
    public Input(){
        scanner = new Scanner(System.in);
    }
    public String getString(){
        System.out.println("Please input string: ");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public Boolean yesNo(){
        String userInput = getString("Please enter yes or no: ");
        if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
            return true;
        }
        else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Please enter a number between" + min + "and" + max);
        int userInput = scanner.nextInt();
        if(userInput < min || userInput > max){
            return getInt(min, max);
        }
        return userInput;
    }
    public int getInt(){
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        return userInput;

    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a number between " + min + " and " + max);
        try {
            double userInput = Double.valueOf(getString());
            if(userInput < min || userInput > max){
                return getDouble(min, max);
            }
        } catch (NumberFormatException){

        }



        return userInput;
    }

    public double getDouble(){
        System.out.println("Please enter a number: ");
        double userInput = scanner.nextDouble();
        return userInput;
    }

}