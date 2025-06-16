import src.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s);

        Shape s1 = new Shape("red", false);
        System.out.println(s1);
    }
}
