package Class_Specific_Modifiers;

public class Example {
    public static class MathUtils {
        public static int add(int a, int b) {
            return a + b;
        }
    }

    public final class Circle {
        public static final double PI = 3.14159;
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * PI * radius;
        }
    }

    public abstract class Shape {
        public abstract double getArea();

        public abstract double getPerimeter();
    }

    public class Calculation {
        public double calculate(double x, double y) {
            return x / y;
        }
    }

}
