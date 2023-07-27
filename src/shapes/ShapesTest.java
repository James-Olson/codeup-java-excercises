package shapes;

public class ShapesTest {
    public static void main(String[] args) {



      Measurable myShape = new Square(6);

      Measurable yourShape = new Rectangle(5, 10);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(yourShape.getArea());
        System.out.println(yourShape.getPerimeter());



    }
}