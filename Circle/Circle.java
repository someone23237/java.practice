class CircleShape {
    public double radius;
    public CircleShape(double radius){
        this.radius=radius;

    }
public double getradius(){
    return radius;

}
public double area(){
    return Math.PI*radius*radius;

}

public double circumference(){
    return 2*Math.PI*radius;  
}
    
    
}
