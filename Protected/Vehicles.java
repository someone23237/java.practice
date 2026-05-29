package Protected;

class Vehicles {
   protected void run(){
    System.out.println("Vehicle is running");
   }
}

class Car extends Vehicles{
   public static void main(String[] args) {
    Car obj=new Car();
    obj.run();
    
   } 
}
