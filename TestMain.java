interface MyInterface {
    public void method1();
    public void method2();
}
public class TestMain implements MyInterface{
    @Override
    public void method1(){
        System.out.println("Implements method1");
    }
    @Override
    public void method2(){
        System.out.println("Implements method2");


    }

    public static void main(String[] args) {
        MyInterface obj=new TestMain();
        obj.method1();
        obj.method2();
        
    }
}