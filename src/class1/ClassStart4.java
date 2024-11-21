package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("학생1", 15, 90);
        students[1] = new Student("학생2", 16, 80);

        System.out.println(students);
        System.out.println(students[0]);
        System.out.println(students[1]);
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].getName() + ", 나이: " + students[i].getAge() + ", 성적: " + students[i].getGrade());
        }
    }
}
