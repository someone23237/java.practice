class subtraction {
    static int number1 = 0;
    static int number2 = 0;
    static int result;

    subtraction(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        result=number1-number2;
    }

public static void main(String[] args) {
    subtraction obj= new subtraction(6,7);
    System.out.println("The subtraction of two numbers is: " + result);
    
}
}