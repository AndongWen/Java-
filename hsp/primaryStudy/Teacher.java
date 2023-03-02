package hsp.primaryStudy;

public class Teacher extends Person{
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Teacher(String name, int age, String subject, String duty) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String say() {
        String msg;
        msg = "老师" + super.say() + " 学科为：" + subject;
        return msg;
    }

    public void teach(){
        System.out.println("老师" + getName() + "正在教" + getSubject());
    }
}
