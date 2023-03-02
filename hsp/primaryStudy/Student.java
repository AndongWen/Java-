package hsp.primaryStudy;

public class Student extends Person{
    private double score;

    public Student(String name, int age,  double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        String msg;
        msg = "学生" + super.say()  + " 成绩为：" + score;
        return msg;
    }

    public void study(){
        System.out.println("学生" + getName() + "正在学习");
    }
}
