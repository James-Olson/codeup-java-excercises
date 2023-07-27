import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

       boolean confirm;

       do {
           System.out.println("Enter a integer: ");
           int userInt = sc.nextInt();
           System.out.println("Here is your table!");
           System.out.println("number | squared | cubed");
           System.out.println("------ | ------- | -----");


           for (int i = 1; i <= userInt; i++) {
               int square = i * i;
               int cubed = i * i * i;

               System.out.printf("%7s|%9s|%6s %n", i, square, cubed);
           }

           System.out.print("Continue? [y/n]");
           confirm = sc.next().equalsIgnoreCase("y");

       }while(confirm);
       System.out.println("See you next time");


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