package polymorphism;
// refers to the act of represeinting things is  multiple ways.
public class Maiin {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        // Square object override the 'area' method in the Shapes class with the
        // 'area' method in the Square class.
        // known as dynamic polymorphism.
        square. greeting();

        
    }
}
