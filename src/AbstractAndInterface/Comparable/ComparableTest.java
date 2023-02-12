package AbstractAndInterface.Comparable;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        Student student1 = new Student(54,"Emre");
        Student student2 = new Student(12,"Hasan");
        Student student3 = new Student(3,"Ayşe");

        Student[] students = {student1,student2,student3};

        System.out.println("Dizi sıralanmadan önceki hali : ");
        for(Student student : students)
        {
            System.out.println(student);
        }
        Arrays.sort(students);
        System.out.println("*******************************");
        System.out.println("Dizi sıralanmadan sonraki hali : ");
        for(Student student : students)
        {
            System.out.println(student);
        }
    }
}
