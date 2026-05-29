class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(5.0);
        System.out.println("Area"+circle.area());
        System.out.println("radius"+circle.getradius());
        System.out.println("circumference"+circle.circumference());

    }
    
}

 class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getradius() {
        return radius;

    }

    public double area() {
        return Math.PI * radius * radius;

    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

}
