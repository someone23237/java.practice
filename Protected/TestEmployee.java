package Protected;

 class Employee {
    protected double salary=500000;
 }
    class Manager extends Employee{
        void showsalary(){
            System.out.println("Manager salary: "+salary);

        }
    }
        public class TestEmployee{
            public static void main(String[] args) {
                Manager m= new Manager();
                m.showsalary();
            }
        }

