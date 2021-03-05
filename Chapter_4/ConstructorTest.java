package Chapter_4;
import java.util.*;

public class ConstructorTest{
    public static void main(String[] args){
        Employee2[] staff = new Employee2[3];
        staff[0] = new Employee2("wad", 13000);
        staff[1] = new Employee2(18000);
        staff[2] = new Employee2();
        for (Employee2 e : staff){
            System.out.println("姓名：" + e.getName() + " 工号 ：" + e.getId() + "薪水： " + e.getSalary());
        }
    }
}

class Employee2{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;
//    静态初始化块
    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }
//    对象初始化块
    {
        id = nextId;
        nextId++;
    }
//    3种重载构造器
    public Employee2(String aname, double asalary){
        name = aname;
        salary = asalary;
    }

    public Employee2(double asalary){
        this("Employee # " + nextId, asalary);
    }

    public Employee2(){
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }
}
