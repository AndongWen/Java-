package Chapter_6;

import java.util.Date;

public class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
       double raise = salary * byPercent / 100;
       this.salary += raise;
    }

    public int compareTo(Employee other){
        return Double.compare(salary, other.salary);
    }
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone(); /*父类提供的浅拷贝 **/
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }
}
