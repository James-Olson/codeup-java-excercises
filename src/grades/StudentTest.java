package grades;


public class StudentTest {
    public static void main(String[] args) {
        Student jim = new Student("xavier");

        jim.addGrade(100);
        jim.addGrade(90);
        jim.addGrade(85);


        System.out.println(jim.getAverageGrade());
    }
}
