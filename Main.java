class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }
}

class students extends person {
    String major;

    public students(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getmajor() {
        return major;
    }
}
// public class Main {
// public static void main(String[] args) {
// students obj= new students("Sudeep", 11, "Soccer");
// System.out.println("name"+obj.getname());
// System.out.println("age"+ obj.getage());
// System.out.println("major" + obj.getmajor`());
// }
// }