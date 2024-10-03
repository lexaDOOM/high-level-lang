package edu.penzgtu;

import java.time.LocalDate;
import java.time.Period;

public class App 
{
    public static void main( String[] args )
    {
        Student student1 = new Student("Alexey", LocalDate.of(2005, 1, 1), "23IS", 1, 4.2);
        Student student2 = new Student("Genadiy", LocalDate.of(2003, 8, 22), "21IP", 2, 4.8);

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        student1.setBirthDate(LocalDate.of(2006, 3, 8));
        student2.setBirthDate(LocalDate.of(2001, 4, 4));

        student1.setAverageScore(4.4);
        student2.setAverageScore(3.7);

        student1.setGroup("23IS");
        student2.setGroup("17PP");

        student1.setStudentId(9999);
        student2.setStudentId(8888);
        
        student1.setName("Roman");
        student2.setName("Grigoriy");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    
    }
}
