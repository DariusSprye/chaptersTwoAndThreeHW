package lab1;

public class Student {

    public String name;
    public int age;
    public char grade;

    public void printStudentInfo(){

        System.out.println("This students name is " + this.name + " and they are " + this.age + " years old. " + "They have a(n) " + this.grade + " letter grade in lab1's class.");
    }

}