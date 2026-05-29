public class Monkey extends animal{
    private String breed;
    public Monkey(String name, int age, String breed){
        super(name,age);
        this.breed=breed;  
    }
    public String getbreed(){
        return breed;
    }
    @Override
    public void makesound(){
        System.out.println("OOO----AAAA---OAA-OO----AAAAAAAAAAAA");
    }
}

