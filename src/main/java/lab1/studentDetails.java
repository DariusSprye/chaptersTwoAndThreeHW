package lab1;

public class studentDetails {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Tyler, the Creator";
        student1.age = 32;
        student1.grade = 'A';

        student1.printStudentInfo();

        Student student2 = new Student();
        student2.name = "A$AP Rocky";
        student2.age = 34;
        student2.grade = 'A';

        student2.printStudentInfo();

    }
}
