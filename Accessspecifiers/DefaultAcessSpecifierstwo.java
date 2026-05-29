package Accessspecifiers;
import java.util.Scanner;
class DefaultAcessSpecifierstwo {
    void checkNumber(int num){
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scn.nextInt();

        DefaultAcessSpecifierstwo obj= new DefaultAcessSpecifierstwo();
        obj.checkNumber(n);
        scn.close();
    }
}
