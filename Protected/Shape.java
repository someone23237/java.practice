class Shape {
    // Protected method accessible to subclasses
    protected void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    // Public method to use the inherited draw()
    void show() {
        draw(); // Calls the protected method from Shape
        System.out.println("This is a circle");
    }
}

public class TestShape {
    // This is where the program starts
    public static void main(String[] args) {
        Circle c = new Circle(); // Create Circle object
        c.show(); // Call show method
    }
}
