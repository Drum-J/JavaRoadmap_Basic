package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 29, 90);
        printStudent(student1);

        Student student2 = new Student("학생2", 25, 100);
        student2.print();
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
