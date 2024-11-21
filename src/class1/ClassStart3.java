package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("학생1");
        student1.setAge(15);
        student1.setGrade(90);

        Student student2 = new Student("학생2", 16, 80);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println("이름: " + student1.getName() + ", 나이: " + student1.getAge() + ", 성적: " + student1.getGrade());
        System.out.println("이름: " + student2.getName() + ", 나이: " + student2.getAge() + ", 성적: " + student2.getGrade());
    }
}