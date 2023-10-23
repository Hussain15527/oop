package polymorphism;

public class Square extends Shapes {
    // @Override
    static void greeting() {
        System.out.println("i am in the Square class");
    }

    @Override
    void area() {
        System.out.println("square");
    }
}
