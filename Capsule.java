class Magma{
    private String name;
   public String getname(){
    return name;
   }
   public void setname(String name){
    this.name=name;

   } 

}

public class Capsule {
public static void main(String[] args) {
Magma obj=new Magma();
obj.setname("Sudeep");
System.out.println(obj.getname());
}    
}

