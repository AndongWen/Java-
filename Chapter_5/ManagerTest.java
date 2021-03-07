package Chapter_5;

public class ManagerTest {
    public static void main(String[] args){
        Manager leader = new Manager("Anthony", 40000, 2025, 8, 18);
        leader.setBonus(5000);
        Employee[] staff = new Employee[4];
        /* 此写法有问题
        staff[0] = new Manager("Anthony", 40000, 2025, 8, 18);
        staff[0].setBonus(5000);*/
        staff[0] = leader;
        staff[1] = new Employee(18000);
        staff[2] = new Employee();
        staff[3] = new Employee("wenandong", 13000, 2020, 8, 18);

        for (Employee e : staff){
            System.out.println("name=" + e.getName() + " salary=" + e.getSalary());
        }
    }
}
