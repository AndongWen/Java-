package Chapter_5;

import java.time.*;

public class Employee1 extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee1(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("an employee with a salary of RMB%.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double rasie = this.salary * byPercent / 100;
        salary += rasie;
    }
}
