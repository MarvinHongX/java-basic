package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student("학생1", 15, 90);
        Student student2 = new Student("학생2", 16, 80);
//        Student[] students = new Student[]{ student1, student2 };
        Student[] students = { student1, student2 };

        System.out.println(students);
        System.out.println(students[0]);
        System.out.println(students[1]);

        for (Student s : students) {
            System.out.println("이름: " + s.getName() + ", 나이: " + s.getAge() + ", 성적: " + s.getGrade());
        }
    }
}
