public class ParamTest {
    public static void main(String[] args){
//        不能修改基本数据类型得参数
        System.out.println("====尝试改变基本数据类型得参数====");
        double salary = 14;
        doubleVale(14);
        System.out.println("加倍后  x = " + salary);

//        方法可以改变对象参数得状态
        System.out.println("====尝试改变对象参数得状态====");
        Employee1[] staff = new Employee1[2];
        staff[0] = new Employee1("wad", 13000);
        staff[1] = new Employee1("Anthony", 18000);
        System.out.println("====加倍之前 薪水为：" + staff[0].getSalary());
        doubleSalary(staff[0]);
        System.out.println("====加倍之后 薪水为：" + staff[0].getSalary());
        System.out.println("====加倍之前 薪水为：" + staff[1].getSalary());
        doubleSalary(staff[1]);
        System.out.println("====加倍之后 薪水为：" + staff[1].getSalary());

//        方法不能让一个对象参数引用另一个对象
        System.out.println("====尝试让一个对象参数引用另一个对象====");
        System.out.println("====交换之前 a为：" + staff[0].getName());
        System.out.println("====交换之前 b为：" + staff[1].getName());
        swap(staff[0], staff[1]);
        System.out.println("====交换之后 a为：" + staff[0].getName());
        System.out.println("====交换之后 b为：" + staff[1].getName());
    }

    public static void doubleVale(double x){
        x = x * 2;
        System.out.println("===测试结束==== x = " + x);
    }

    public static void doubleSalary(Employee1 x){
        x.raiseSalary(100);
        System.out.println("====测试结束==== 薪水 = " + x.getSalary());
    }

    public static void swap(Employee1 a, Employee1 b){
        Employee1 tmp = a;
        a = b;
        b = tmp;
        System.out.println("====方法测试结束==== a = " + a.getName());
        System.out.println("====方法测试结束==== b = " + b.getName());
    }
}

class Employee1{
    private String name;
    private double salary;

    public Employee1(String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
