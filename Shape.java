public class Shape {
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
    
    public float area(float length, float width) {
        return length * width;
    }
    
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        Shape shape = new Shape();
        
        double triangleArea = shape.area(10.0, 5.0);
        System.out.println("Area of triangle: " + triangleArea);
        
        double rectangleArea = shape.area(10.0, 5.0);
        System.out.println("Area of rectangle: " + rectangleArea);
        
        double circleArea = shape.area(5.0);
        System.out.println("Area of circle: " + circleArea);

    }
}
