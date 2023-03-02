package hsp.primaryStudy;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Jack", 45);
        persons[1] = new Student("Smith", 19, 100);
        persons[2] = new Student("Andy", 21, 85);
        persons[3] = new Teacher("Edison", 36, "math");
        persons[4] = new Teacher("Kevin", 29, "Computer Science");
        "hello".equals("abc");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student){ //instanceof 判断运行类型 进行向下转型
                Student student = (Student) persons[i];
                student.study();
            }
            else if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }
        }
    }
}
