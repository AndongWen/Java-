package hsp.primaryStudy;

public class OopExer01 {

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[0].setAge(35);
        persons[1] = new Person();
        persons[1].setAge(27);
        persons[2] = new Person();
        persons[2].setAge(78);
        sortPersonByAge(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getAge());
        }
    }

    public static void sortPersonByAge(Person[] persons) {
        int length = persons.length;
        Person tempPerson = new Person();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    tempPerson = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = tempPerson;
                }
        }
    }
}
