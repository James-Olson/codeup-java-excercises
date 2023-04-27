public class Person {
    private String name;

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, from %s. %n", name);
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Andrew");
        Person person2 = new Person("Andrew");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        //Person person2 = person1;
        System.out.println(person1 == person2);

        person1.setName("Nikki");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person1.sayHello();
        person2.sayHello();
    }

}
