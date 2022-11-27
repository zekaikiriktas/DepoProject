package warehouseproject;

import java.util.Scanner;

    public class AppPanel {

        static Scanner scan = new Scanner(System.in);

        public static void appPanel() {
            boolean exit = true;
            do {
                System.out.println("---Warehouse Management---");
                System.out.println("1 - Identify a new product,");
                System.out.println("2 - Product List,");
                System.out.println("3 - Add Product,");
                System.out.println("4 - Remove Product,");
                System.out.println("5 - Place Product");
                System.out.println("0 - Exit");
                System.out.print("Please write number of action you want to do : ");

                int chosen = scan.nextInt();

                switch (chosen) {
                    case 1:
                        Product.productIdentify();
                        break;
                    case 2:
                        Product.listOfProducts();
                        break;
                    case 3:
                        Product.addProduct();
                      break;
                    case 4:
                        Product.sellProduct();
                        break;
                    case 5:
                        Product.placeProduct();
                        break;
                    case 0:
                        System.out.println("Exiting Program. Thanks.");
                        exit = false;
                        break;
                    default:
                        System.out.println("Invalid Choice");

                }
            } while (exit);
        }
}
