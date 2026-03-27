package lab;

import java.util.Scanner;





class Teacher {

 String name;

 int age;

 String subject;

 double salary;



 // Constructor 1: No parameters

 Teacher() {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Name:");

     this.name = sc.nextLine();

     System.out.println("Enter Age:");

     this.age = Integer.parseInt(sc.nextLine());

     this.subject = "Not assigned";

     this.salary = 0.0;

 }



 // Constructor 2: Name and age

 Teacher(String name, int age) {

     this.name = name;

     this.age = age;

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Subject:");

     this.subject = sc.nextLine();

     System.out.println("Enter Salary:");

     this.salary = Double.parseDouble(sc.nextLine());

 }



 // Constructor 3: Full info

 Teacher(String name, int age, String subject, double salary) {

     this.name = name;

     this.age = age;

     this.subject = subject;

     this.salary = salary;

 }



 void display() {

     System.out.println("Name: " + name);

     System.out.println("Age: " + age);

     System.out.println("Subject: " + subject);

     System.out.println("Salary: " + salary);

     System.out.println("------------------------");

 }

}



//Main class

public class thirdprgm {

 public static void main(String[] args) {



     System.out.println("Creating Teacher 1 (0-arg constructor):");

     Teacher t1 = new Teacher();



     System.out.println("\nCreating Teacher 2 (Name & Age constructor):");

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Name: ");

     String name = sc.nextLine();

     System.out.print("Enter Age: ");

     int age = Integer.parseInt(sc.nextLine());

     Teacher t2 = new Teacher(name, age);



     System.out.println("\nCreating Teacher 3 (Full info constructor):");

     System.out.print("Enter Name: ");

     String name3 = sc.nextLine();

     System.out.print("Enter Age: ");

     int age3 = Integer.parseInt(sc.nextLine());

     System.out.print("Enter Subject: ");

     String subject3 = sc.nextLine();

     System.out.print("Enter Salary: ");

     double salary3 = Double.parseDouble(sc.nextLine());

     Teacher t3 = new Teacher(name3, age3, subject3, salary3);



     System.out.println("\n--- Teacher Details ---");

     t1.display();

     t2.display();

     t3.display();



     sc.close();

 }

}
