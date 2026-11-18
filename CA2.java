abstract class Shape {
    
    int width = 14;
    int length = 18;
    double radius = 10;

   
     abstract void calculateArea();
}


class Circle extends Shape {
    
    void calculateArea() {
        double area = Math.PI * radius * radius; // πr²
        System.out.println("Circle Area: " + area);
    }
}


class Rectangle extends Shape {
    
    void calculateArea() {
        int area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

public class CA2 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();       
        circle.calculateArea();
        rectangle.calculateArea();
    }
}

