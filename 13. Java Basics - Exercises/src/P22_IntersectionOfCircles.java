import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P22_IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Circle c1 = getCircle(scan);
        Circle c2 = getCircle(scan);

        System.out.println(c1.intersectWith(c2) ? "Yes" : "No");
    }

    private static Circle getCircle(Scanner scan) {
        double[] circleData = Arrays.stream(scan.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        return new Circle(
                new Point(circleData[0], circleData[1]),
                circleData[2]
        );
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean intersectWith(Circle circle) {
        double distance = this.center.DistanceTo(circle.getCenter());
        return distance <= this.radius + circle.getRadius();
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double DistanceTo(Point point) {
        double sideA = Math.abs(this.x - point.x);
        double sideB = Math.abs(this.y - point.y);
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
}
