public class Dog extends animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getbreed() {
        return breed;
    }

    @Override
    public void makesound() {
        System.out.println("BARKK BARK BARK!!!!!!!!!!! BARK BARK BARK!!!!!!!!!!!!!!!!!!!!!");
    }
}