package ref;

public class Student {
    String name;
    int age;
    int grade;

    public Student() {

    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void init(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void print() {
        System.out.println("이름:" + this.name + " 나이:" + this.age + " 성적:" + this.grade);
    }

}
