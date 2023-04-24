import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Part 1. Loop Basics
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

        //        Part 2. Do While

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//
//        }while(i <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//
//        }while(i >= -10);

//    ------------- Number squared --------------
//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        }while(i <= 1_000_000);

        //    ------------- Refactor to use for loop --------------

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 1_000_000; i *= i){
//            System.out.println(i);
//        }

//        Fizzbuzz
//        for(int i = 1; i <= 100; i++){
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("Fizzbuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }


//        ------------- Table of powers ---------

        Scanner sc = new Scanner(System.in);
//
//        boolean confirm;
//
//        do {
//            System.out.println("Enter a integer: ");
//            int userInt = sc.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//
//            for (int i = 1; i <= userInt; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//
//                System.out.printf("%7s|%9s|%6s %n", i, square, cubed);
//            }
//
//            System.out.print("Continue? [y/n]");
//            confirm = sc.next().equalsIgnoreCase("y");
//
//        }while(confirm);
//        System.out.println("See you next time");


//        ------------- Number grades to letters ---------
//      A : 100 - 88
//      B : 87 - 80
//      C : 79 - 67
//      D : 66 - 60
//      F : 59 - 0

        boolean confirm;

        do {
            System.out.println("Enter a numerical grade from 0 to 100: ");
            int userGrade = sc.nextInt();

            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.print("Continue? [y/n]");
            confirm = sc.next().equalsIgnoreCase("y");
        } while (confirm);
        System.out.println("Ok bye!");
    }

}