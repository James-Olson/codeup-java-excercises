import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a length: ");
        String lengthStr = sc.nextLine();
        int lengthNum = Integer.parseInt(lengthStr);



        System.out.println("Enter a width:");
        String widthStr = sc.nextLine();
        int widthNum = Integer.parseInt(widthStr);


        int area = lengthNum * widthNum;


        int perimeter = (2 * lengthNum) + (2 * widthNum);


        System.out.printf("Area: %s %n Perimeter: %s %n", area, perimeter);
        sc.useDelimiter("\n");

    }
};
