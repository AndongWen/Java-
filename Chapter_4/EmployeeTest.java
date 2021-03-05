package Chapter_4;
import java.time.*;

public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("wad", 13000, 24,2020, 8, 18);
        staff[1] = new Employee("Anthony", 18000, 25,2021, 8, 18);
        staff[2] = new Employee("Black.J", 20000, 25,2021, 10, 1);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e: staff)
            System.out.println("name=" + e.getName() + ", slaary=" + e.getSalary() + ", hireDay=" +
                    e.getHirDay());

        staff[0].setId();
        System.out.println(staff[0].getId());
        System.out.println(Employee.getNextId());
    }
}

class Employee{
//    静态字段，可以理解为类字段；非静态字段都每个实例都有自己得副本
    private static int nextId = 1;
//    final 字段 构造对象时必须初始化，一旦初始化就不能被修改
    private final String name;
    private int id;
    private double salary;
    private LocalDate hirDay;

    public Employee(String n, double s, int i, int year, int month, int day){
        name = n;
        salary = s;
        id = i;
        hirDay = LocalDate.of(year, month, day);
    }
//    静态方法访问静态字段 无需访问对象状态；只需要访问类得静态字段
    public static int getNextId(){
        return nextId;
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

    public LocalDate getHirDay(){
        return hirDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;

/*        this 指示隐式参数
        double raise = this.salary * byPercent / 100;
        this.salary += raise;*/
    }

    public void setId(){
        id = nextId;
        nextId++;
    }
}
