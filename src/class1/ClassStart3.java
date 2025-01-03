package class1;

/**
 * Student 클래스 사용
 */
public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // 변수 선언
        student1 = new Student(); // Student 인스턴스(객체) 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 변수 선언 및 객체 생성
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 참조값 확인
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);


    }
}
