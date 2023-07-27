package OOP;

public class Student {
    private String name;
    public String cohort;

    // Constructor that accepts one argument
    public Student(String name) {
        // Take the one argument and pass it to the constructor that takes TWO.
        new Student(name, "Unassigned");
        System.out.println("Constructor with ONLY NAME has been called.");
    }

    public Student(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
        System.out.println("Constructor with NAME AND COHORT has been called.");
    }

    public String sayHello() {
        return "Hello from " + this.name + "!";
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student("CodeyThaDuck");
        Person p1 = new Person();

        p1.firstName = "Jayakjnweflaiejwf;aionef;oaiejnf;oaiwjef;oaiwejf;aowiejnf;oa";

        s1.setName("Jay");
        System.out.println(s1.name);
    }
}
