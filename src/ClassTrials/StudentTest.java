package ClassTrials;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci numarası giriniz : ");
        int no = scanner.nextInt();
        System.out.print("Öğrenci adını giriniz :");
        String name = scanner.next();
        System.out.print("Öğrenci soyadını giriniz : ");
        String surname = scanner.next();
        int note = (int)(Math.random() * 100 + 1);
        Student student = new Student(no,name,surname,note);


        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNote());

        System.out.println("\n**************************************************\n");

        Student[] students = new Student[100];

        for(int i = 0; i < students.length; i++)
        {
            int idNumber = i + 1;
            String stdName = idNumber + ".\t";
            String stdSurname = "öğrenci";
            int stdNote = (int) (Math.random()*100 + 1);
            students[i] = new Student(idNumber,stdName,stdSurname,stdNote);
        }

        for(Student s : students)
        {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getNote());
        }
        System.out.println("\n**************************************************\n");

        Student.sortNote(students);
        for(Student s : students)
        {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getNote());
        }
    }
}
