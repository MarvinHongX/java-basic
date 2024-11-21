package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student("학생1", 15, 90);
        Student student2 = new Student("학생2", 16, 80);
        Student student3 = new Student();


        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.getName() + ", 나이: " + student.getAge() + ", 성적: " + student.getGrade());
    }
}