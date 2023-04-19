

import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args){


        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f %n", pi);

        Scanner question = new Scanner(System.in);
        System.out.print("enter a integer" + "\n");
        int userint = question.nextInt();
        System.out.println(3 + userint);

        System.out.println("pick three words");
        String wordone = question.next();
        String wordtwo = question.next();
        String wordthree = question.next();
        System.out.printf("you entered %s %s %s",wordone,wordtwo,wordthree);





    }
}
