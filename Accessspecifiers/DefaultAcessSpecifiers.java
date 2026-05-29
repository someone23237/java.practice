package Accessspecifiers;

import java.util.Scanner;

import Practice.numberrangecheck;

class DefaultAcessSpecifiers {
    
    int rollNo;
    String name;
    int marks;
         void getData(){
        Scanner scn=new Scanner(System.in);
    

    System.out.println("Enter a roll number:");
    rollNo=scn.nextInt();

    scn.nextLine();

    System.out.println("Enter your name");
    name=scn.nextLine();

    System.out.println("enter your marks");
    marks=scn.nextInt();
    }

    void DisplayData(){
        System.out.println("\n---Student Details---");
        System.out.println("Roll number "+rollNo);
        System.out.println("Name "+name);
        System.out.println("Marks "+name);



        if(marks>=70){
            System.out.println("Ok so you have a good grade good job!");
        }
        else{
            System.out.println("Soory you don't have a good grade you failed! :(");
        }

    }
public static void main(String[] args) {
    DefaultAcessSpecifiers s=new DefaultAcessSpecifiers();

    s.getData();
    s.DisplayData();

}



}


