package Predicate;

import java.util.function.Function;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Test1 {
    public static void main(String[] args) {

        // Function to calculate grade based on marks
        Function<Student, String> f = s -> {
            int marks = s.marks;
            String grade = "";

            if (marks >= 80)
                grade = "A [Distinction]";
            else if (marks >= 60)
                grade = "B [First Class]";
            else if (marks >= 50)
                grade = "C [Second Class]";
            else if (marks >= 35)
                grade = "D [Third Class]";
            else
                grade = "E [Failed]";

            return grade;
        };

        // Student array
        Student[] students = {
                new Student("Durga", 100),
                new Student("Sunny", 65),
                new Student("Bunny", 55),
                new Student("Chinny", 45),
                new Student("Vinny", 25)
        };

        // Printing student details with grade
        for (Student s1 : students) {
            System.out.println("Student Name  : " + s1.name);
            System.out.println("Student Marks : " + s1.marks);
            System.out.println("Student Grade : " + f.apply(s1));
            System.out.println();
        }
    }
}
