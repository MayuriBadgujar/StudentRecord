public class Info {

    private int rollNo;
    private String name;
    private int salary;

    public

    void get(int rollNo,String name,int salary){
        this.rollNo=rollNo;
        this.name=name;
        this.salary=salary;
    }
    void show(){
        System.out.println("RollNo : "+rollNo);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }

}
