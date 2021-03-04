import java.time.*;

public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("wad", 13000, 2020, 8, 18);
        staff[1] = new Employee("Anthony", 18000, 2021, 8, 18);
        staff[2] = new Employee("Black.J", 20000, 2021, 10, 1);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e: staff)
            System.out.println("name=" + e.getName() + ", slaary=" + e.getSalary() + ", hireDay=" +
                    e.getHirDay());
    }
}

class Employee{
    private String name;
    private double salary;
    private LocalDate hirDay;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hirDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHirDay(){
        return hirDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}
