import java.util.*;
public class Employee {
    Scanner sc=new Scanner(System.in);
    private int empId;
    private String name;
    private float salary;

    public

    void get(){
        System.out.println("Enter empId : "+empId);
        empId=sc.nextInt();
        System.out.println("Enter Name : "+name);
        name=sc.next();
        System.out.println("Enter Salary : "+salary);
        salary=sc.nextFloat();


    }

    void show(){
        System.out.println("Employee Id is : "+empId);
        System.out.println("Employee name  : "+name);
        System.out.println("Employee salary : "+salary);



    }
    float Salary(){
        return(salary);
    }
}
