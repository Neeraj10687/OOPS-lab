package lab;



import java.util.Scanner;



class Employee {

    int eNo;

    String eName;

    double eSalary;



    void getData(Scanner sc) {

        System.out.print("Enter Employee Number: ");

        eNo = sc.nextInt();

        sc.nextLine();  



        System.out.print("Enter Employee Name: ");

        eName = sc.nextLine();



        System.out.print("Enter Employee Salary: ");

        eSalary = sc.nextDouble();

    }



    void showData() {

        System.out.println("Employee Number: " + eNo);

        System.out.println("Employee Name: " + eName);

        System.out.println("Employee Salary: " + eSalary);

    }

}



public class secondprgm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Enter number of employees: ");

        int n = sc.nextInt();



        Employee[] emp = new Employee[n];  // Array of objects



        // Input employee details

        for (int i = 0; i < n; i++) {

            emp[i] = new Employee();

            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            emp[i].getData(sc);

        }



        // SEARCHING BY EMPLOYEE NUMBER

        System.out.print("\nEnter Employee Number to search: ");

        int searchNo = sc.nextInt();



        boolean found = false;



        for (int i = 0; i < n; i++) {

            if (emp[i].eNo == searchNo) {

                System.out.println("\nEmployee Found:");

                emp[i].showData();

                found = true;

                break;

            }

        }



        if (!found) {

            System.out.println("\nEmployee not found.");

        }



        sc.close();

    }

}
