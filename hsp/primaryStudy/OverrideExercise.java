package hsp.primaryStudy;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("Jack", 45);
        System.out.println(person.say());
        Student student = new Student("Anthony", 27, 98);
        System.out.println(student.say());

    }
}
