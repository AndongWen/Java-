package Chapter_6;

import java.util.*;

public class EmployeeSortTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("wad", 13000);
        staff[2] = new Employee("blackj", 18000);
        staff[1] = new Employee("Anthony", 22000);

        Arrays.sort(staff);
        for (Employee e : staff) System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
