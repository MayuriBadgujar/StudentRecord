/*

write a program create student class with member
rollNo,name,percentage of 10 student
and print list of 3 topper student information

 */

import java.util.*;

public class Student {
    Scanner sc=new Scanner(System.in);
    private int rollNo;
    private String name;
    private float percentage;

    public
    void get(){
        System.out.println("Enter rollNo of student : ");
        rollNo=sc.nextInt();
        System.out.println("Enter Name of student : ");
        name=sc.next();
        System.out.println("Enter Percentage of student : ");
        percentage=sc.nextFloat();
    }
    void show(){
        System.out.print("         RollNo       ");
        System.out.print("          Name  ");
        System.out.print("         Pecentage  ");
    }
    void showdata(){
        System.out.println(" ");
        System.out.println("             "+rollNo+"                  "+name+"               "+percentage);
    }
    float max(){


        return(percentage);
    }
}
