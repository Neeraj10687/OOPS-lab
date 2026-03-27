package lab;

import java.util.Scanner;



class Product {

    int pcode;

    String pname;

    double price;



    void getData(Scanner sc) {

        System.out.print("Enter Product Code: ");

        pcode = sc.nextInt();

        sc.nextLine();  



        System.out.print("Enter Product Name: ");

        pname = sc.nextLine();



        System.out.print("Enter Product Price: ");

        price = sc.nextDouble();

    }



    void showData() {

        System.out.println("Product Code: " + pcode);

        System.out.println("Product Name: " + pname);

        System.out.println("Product Price: " + price);

    }

}



public class first1prgm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();



        Product[] p = new Product[n];   

        for (int i = 0; i < n; i++) {

            p[i] = new Product();

            System.out.println("\nEnter details for Product " + (i + 1) + ":");

            p[i].getData(sc);

        }


        // COMPARISON
        
        Product lowest = p[0];

        for (int i = 1; i < n; i++) {

            if (p[i].price < lowest.price) {

                lowest = p[i];

            }

        }     
        

        System.out.println("\nProduct with Lowest Price:");
        lowest.showData();
        
        
        sc.close();

    }

}
