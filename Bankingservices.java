import java.util.Scanner;
class Bankingservices {
    public static void main(String[] args) {
        boolean infiniteloop =true;
         String[] accountName=new String[1000];
        int size=0;
        while (infiniteloop) {
            System.out.println("Welcome to banking services to insert money or deposit money, the best money banking to do.");
            System.out.println("Here's the menu:");
            System.out.println("1-> you can add the customer,");
            System.out.println("2-> You can change the customer's name,");
            System.out.println("3-> You can also check the account's balance");
            System.out.println("4-> You can also update the account balance");
            System.out.println("5-> And you can check the statement");
         
            System.out.println("6-> ANd finally you can quit( please dont! :( )");
            Scanner scn=new Scanner(System.in);
            System.out.print("ENter your option :) :");
            int option=scn.nextInt();
            if (option==1){
                System.out.println("Enter your name pls :) :");
                String name=scn.nextLine();
                accountName[size]=name;
                System.out.println("Accountname"+accountName[size] );
                size=size+1;

            }


            
        } 

        
    }
}
    

