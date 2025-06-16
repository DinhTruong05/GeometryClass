package src;

import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];

        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 3.5);

        System.out.println("Before sorting:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After sorting:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(getRadius(), o.getRadius());
    }
}
