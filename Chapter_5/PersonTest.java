package Chapter_5;

import java.time.*;

public class PersonTest {
    public static void main(String[] args){
        Person[] per = new Person[2];
        per[0] = new Employee1("Anthony", 18000, 2021, 10, 18);
        per[1] = new Student("WenAndong", "chemistry");

        for (Person p: per){
            System.out.println(p.getDescription());
        }
    }
}
