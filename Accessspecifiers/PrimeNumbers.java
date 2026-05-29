package Accessspecifiers;
import java.util.Scanner;
public class PrimeNumbers {
    void checkPrime(int num){
        int count=0;

        for(int i=1;i <=num;i++){
            if(num%2==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("This number is sadly not prime.");
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();

        PrimeNumbers obj= new PrimeNumbers();
        obj.checkPrime(n);
        scn.close();
    }   
   
}
