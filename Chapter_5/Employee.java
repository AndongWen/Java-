package Chapter_5;

import java.util.Objects;
import java.time.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(double salary){
        this("AndongWen", salary, 2020, 8, 18);
    }

    public Employee(){
        this("AndongWin", 25000, 2021, 10, 1);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject){
//        最先对比引用
        if (this == otherObject) return true;
//        判断otherObject是否为null
        if (otherObject == null) return false;
//        比较this和otherObject的类，如果equals的语义可以在子类中改变，则比较夫类
        if (getClass() != otherObject.getClass()) return false;
//        如果由父类决定相等性概念，就使用instanceof检测
//        if (!(otherObject instanceof ClassName)) return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    public String toSrting(){
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}

