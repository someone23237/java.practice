interface Shape{
    double getarea();
}
class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

@Override
    public double getarea(){
      return width*height;
      
    }
}
class Circle implements Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
@Override
    public double getarea(){
        return Math.PI*radius*radius;
    }

}
class AreaCalculator{
    public double sumarea(Shape [] shapes){
        double totalarea=0;
        for(Shape shape:shapes){
            totalarea+=shape.getarea();
        }
        return totalarea;

    }

}
public class Poly{
    public static void main(String[] args) {
        Shape[] shapes=new Shape[2];
        shapes[0]=new Rectangle(2,4);
        shapes[1]=new Circle(67);
        AreaCalculator calculator=new AreaCalculator();
        double totalarea=calculator.sumarea(shapes);
    System.out.println("total area"+totalarea);


    }
}

