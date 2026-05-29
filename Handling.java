import java.util.Scanner;
class Handling{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        try{
            System.out.println("Pls enter a number:");
            int x=scn.nextInt();
            System.out.println("Pls enter another number");
            int y=scn.nextInt();
            int z=x/y;
            System.out.println(" z="+z);
}
catch(ArithmeticException ex){
    System.out.println("Exception"+ex.toString());

}
finally{
    System.out.println("THis code is ofically done!");
    scn.close();
}       
}
}