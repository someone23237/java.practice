import java.util.ArrayList;
 

class Magic{
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Gorrlia");
        animals.add("dogs");
        System.out.println(animals);
        animals.clear();
        animals.add("lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Gorrlia");
        animals.add("dogs");
        System.out.println(animals);
        if(animals.isEmpty()){
            System.out.println("Animals are empty");
        
        }
        else{
        System.out.println("animal is not empty");
                }
                animals.add("chipmunk");
                System.out.println(animals);
                animals.remove(2);
                System.out.println("tiger is out of the index....here are the animals! "+animals);
        } 


}