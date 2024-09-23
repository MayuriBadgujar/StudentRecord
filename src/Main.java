import java.util.*;
public class Main {
    public static void main(String[] args) {
/*
        Info i=new Info();
        i.get(1,"Anu",200000);
        i.show();

 */




      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number employee : ");
        int n=sc.nextInt();
        float sum=0.0f;
        float average=0.0f;
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++){
            e[i]=new Employee();
            e[i].get();
           // e[i].show();
            sum=sum+e[i].Salary();
        }
        System.out.println("Total salary is : "+sum);

        average=sum/n;
        System.out.println("Average salary is : "+average);

        int max=0;
        for(int i=0;i<n;i++){
            if(e[i].Salary()>max){
                max= (int) e[i].Salary();
            }
        }
        for(int i=0;i<n;i++){
            if(max == (int) e[i].Salary()) {
                System.out.println("Maximum salary is : " + max);
                e[i].show();
            }
        }*/
        Scanner sc=new Scanner(System.in);
        System.out.println("How many students : ");
        int n=sc.nextInt();
        Student s[]=new Student[n];
        for(int i=0;i<n;i++){
            s[i]=new Student();
            s[i].get();
           // s[i].show();
           // s[i].showdata();
        }
        System.out.print("         RollNo       ");
        System.out.print("         Name  ");
        System.out.print("         Pecentage  ");
        for(int i=0;i<n;i++){

            //s[i].show();
            s[i].showdata();
        }
        int max1=0;
        int max2=0;
        int max3=0;
        for(int i=0;i<n;i++) {
            if (s[i].max() > max1) {
                max3 = max2;
                max2 = max1;
                max1 = (int) s[i].max();
               // s[i].showdata();
                //System.out.println("Topper student  : "+s[i].showdata());
            } else if (s[i].max() > max2) {
                max3 = max2;
                max2 = (int) s[i].max();
            } else if (s[i].max() > max3) {
                max3 = (int) s[i].max();

            }
        }

        for(int i=0;i<n;i++){
            if(s[i].max()==max1){
                System.out.println("Topper student Percentage : "+max1);
                s[i].show();
                s[i].showdata();
            }
            if(s[i].max()==max2){
                System.out.println("Second student Percentage : "+max2);
                s[i].show();
                s[i].showdata();
            }
            if(s[i].max()==max3){
                System.out.println("Third student Percentage : "+max3);
                s[i].show();
                s[i].showdata();
            }
        }
           // System.out.println("Topper student Percentage : "+max1);
           // System.out.println("Second student Percentage : "+max2);
          //  System.out.println("Third student Percentage : "+max3);
/*
How many students :
5
Enter rollNo of student :
1
Enter Name of student :
anu
Enter Percentage of student :
80
Enter rollNo of student :
2
Enter Name of student :
mayu
Enter Percentage of student :
92
Enter rollNo of student :
3
Enter Name of student :
adi
Enter Percentage of student :
97
Enter rollNo of student :
4
Enter Name of student :
anya
Enter Percentage of student :
91
Enter rollNo of student :
5
Enter Name of student :
adu
Enter Percentage of student :
98
         RollNo                Name           Pecentage
             1                  anu               80.0

             2                  mayu               92.0

             3                  adi               97.0

             4                  anya               91.0

             5                  adu               98.0
Third student Percentage : 92
         RollNo                 Name           Pecentage
             2                  mayu               92.0
Second student Percentage : 97
         RollNo                 Name           Pecentage
             3                  adi               97.0
Topper student Percentage : 98
         RollNo                 Name           Pecentage
             5                  adu               98.0

Process finished with exit code 0

 */
    }
}