import src.Rectangle;

public class TestRetangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5, 4.5);
        System.out.println(rectangle);

        rectangle = new Rectangle("red", false, 3.5, 4.5);
        System.out.println(rectangle);
    }
}
