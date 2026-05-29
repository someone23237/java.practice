class Rectangle{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double getlength(){
        return length;
    }
    
    public double getwidth() {
        return width;
    }

    public double getarea() {
        return length*width;
    }
    
    public double perimeter() {
        return 2*(length+width);
    }
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(24, 5);
        System.out.println("length is " +obj.getlength());
        System.out.println("width is "+obj.getwidth());
        System.out.println("area is "+obj.getarea());
        System.out.println("perimeter is "+obj.perimeter());
    }
}