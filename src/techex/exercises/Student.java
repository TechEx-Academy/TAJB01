/*
    Create a student class with fields name and age
    Create an array of Student and insert students into the array which are created by user data
    Print the names of students who are older than 18 years
 */


package techex.exercises;

import java.util.Scanner;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] arr = new Student[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Enter name - ");
            String name = scanner.next();

            System.out.print("Enter age - ");
            int age = scanner.nextInt();

            arr[i] = new Student(name, age);
        }


        for(Student s : arr){
            if(s.age > 18){
                System.out.println(s.name);
            }
        }
    }
}
