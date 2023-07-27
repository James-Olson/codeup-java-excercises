
package OOP;

public class Person {
    protected String firstName;
    public String lastName;
    public String occupation;
    public String sayHello() {
        return String.format("Hello from %s %s! My current occupation is: %s", firstName, lastName, occupation);
    }

    public Person() {}


    // Constructor Method
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = "TBD";
    }

    public Person(String firstName) {
        this.firstName = firstName;
        System.out.println("I don't have a last name..");
    }

    public static void main(String[] args) {
        // Instantiate a new OOP.Person object
        Person rick = new Person();
        // Assigning firstName field a value
//        rick.firstName = "Rick";
        // Assigning lastName field a value
//        rick.lastName = "Sanchez";

        Person person = new Person("Jay", "Arredondo");
        Person morty = new Person("Morty", "Smith");
        Person p2 = new Person("Farrukh");

//        System.out.println(person.sayHello());
        System.out.println(rick.sayHello());

        System.out.println(Math.PI);

        // Executing the sayHello method.
//        System.out.println(rick.sayHello());

//        OOP.Person morty = new OOP.Person();
//        morty.firstName = "Rick";
//        morty.lastName = "Sanchez";

//        OOP.Person morty = rick;

//        System.out.println(morty.sayHello());
//
//        System.out.println("morty: " + morty);
//        System.out.println("rick: " + rick);

//        sayHello();
//
//        System.out.println(morty == rick);
//        System.out.println(morty.equals(rick));
//
//        System.out.println(rick.firstName.equals(morty.firstName));

        // prints "Hello from Rick Sanchez!"

        // Reference in a static context
//        System.out.println(OOP.Person.firstName);
//        System.out.println(OOP.Person.sayHello());


        Person test = new Person();

        test.firstName = "Jay";

        Config config = new Config("jayman123", "password");

        System.out.println(config.getUsername());
        config.setUsername("bumblebee123");
        System.out.println(config.getUsername());
//        System.out.println(config.username);
//        System.out.println(config.password);


    }
}