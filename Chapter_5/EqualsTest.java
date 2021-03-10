package Chapter_5;

public class EqualsTest {
    public static void main(String[] args){
        Employee wad = new Employee("wad", 13000, 2020, 8, 18);
        Manager andongwin = new Manager("AndongWin", 30000, 2022,10,18);
        Employee wenandong = new Employee("wenandong", 18000, 2021,10,18);
        Employee blackj = wad;

        System.out.println("wad == andongwin " + (wad == andongwin));
        System.out.println("wad == wenandong " + (wad == wenandong));
        System.out.println("wad == blackj " + (wad == blackj));

        System.out.println("wad.equals(andongwin) " + wad.equals(andongwin));
        System.out.println("wad.equals(wenandong) " + wad.equals(wenandong));
        System.out.println("wad.equals(blackj) " + wad.equals(blackj));

        System.out.println("andongwin.toString():" + andongwin.toString());
        System.out.println("andongwin.toString():" + andongwin);

        System.out.println("wad.hasCode():" + wad.hashCode());
        System.out.println("blackj.hasCode():" + blackj.hashCode());

        Manager j = new Manager("BlackJ", 50000, 2027, 10, 18);
        Manager k = new Manager("BlackJ", 50000, 2027, 10, 18);
        System.out.println("j.equals(k):" + j.equals(k));
        System.out.println("k.equals(j):" + k.equals(j));
        System.out.println("j.hasCode():" + j.hashCode());
        System.out.println("k.hasCode():" + k.hashCode());
        k.raiseSalary(5);
        k.setBonus(12000);
        System.out.println("j.equals(k):" + j.equals(k));
        System.out.println("k.equals(j):" + k.equals(j));
        System.out.println("j.hasCode():" + j.hashCode());
        System.out.println("k.hasCode():" + k.hashCode());
    }
}
