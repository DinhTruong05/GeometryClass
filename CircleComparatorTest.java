import src.Circle;
import src.CircleComparator;
import java.util.Arrays;
import java.util.Comparator;


public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo", false, 3.5);

        System.out.println("Before sorting:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After sorting:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
