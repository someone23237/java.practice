public class Main{
    public static void main(String[] args) {
        animal A=new animal("BOB", 67);
        Monkey M=new Monkey("Sudeep", 11, "my breed SIX SEVEN!!");
        Dog D = new Dog("SudeepDog", 11, "my breed SIX Eight!!");
        A.makesound();
        System.out.println(A.getname()+  "is" + A.getage()+"Years old");
        M.makesound();
        System.out.println(M.getname() + "is" + M.getage() + "Years old"+M.getbreed()+"Breed");
        D.makesound();
        System.out.println(D.getname() + "is" + D.getage() + "Years old"+D.getbreed()+"Breed");
        
    }
    
}
