package Chapter_6;

public class CloneTest {
    public static void main(String[] args) {
//        引用的clone,副本的改动会改变本体
        Employee staff1 = new Employee("WAD", 13000);
        Employee staff2 = staff1;

        staff2.raiseSalary(50);
        System.out.println(staff1.getSalary());
        System.out.println(staff2.getSalary());

        Employee staff3 = new Employee("Anhotny", 20000);
//        Employee staff4 = staff3.clone(); // clone方法是Object类中protected方法 使用会出错
//
//        staff4.raiseSalary(50);
//        System.out.println(staff4.getSalary());
//        System.out.println(staff3.getSalary());
    }
}
