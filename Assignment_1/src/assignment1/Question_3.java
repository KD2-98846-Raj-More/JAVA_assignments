/*3. Display food menu to user. User will select items from menu along with the 
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
prices to food items(hard code the prices)  When user enters 'Generate Bill' 
option , display total bill & exit.*/

package assignment1;

import java.util.Scanner;

public class Question_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice, quantity;
        double total = 0;

        while (true)
        {
            System.out.println("\n----- FOOD MENU -----");
            System.out.println("1. Dosa       - Rs.50");
            System.out.println("2. Samosa     - Rs.20");
            System.out.println("3. Idli       - Rs.30");
            System.out.println("4. Vada       - Rs.25");
            System.out.println("5. Poha       - Rs.30");
            System.out.println("6. Upma       - Rs.35");
            System.out.println("7. Pav Bhaji  - Rs.60");
            System.out.println("8. Misal      - Rs.50");
            System.out.println("9. Biryani    - Rs.100");
            System.out.println("10. Generate Bill");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 10)
            {
                break;
            }

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            switch (choice)
            {
                case 1:
                    total = total + 50 * quantity;
                    break;

                case 2:
                    total = total + 20 * quantity;
                    break;

                case 3:
                    total = total + 30 * quantity;
                    break;

                case 4:
                    total = total + 25 * quantity;
                    break;

                case 5:
                    total = total + 30 * quantity;
                    break;

                case 6:
                    total = total + 35 * quantity;
                    break;

                case 7:
                    total = total + 60 * quantity;
                    break;

                case 8:
                    total = total + 50 * quantity;
                    break;

                case 9:
                    total = total + 100 * quantity;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("----------------------");
        System.out.println("Total Bill = Rs." + total);
        System.out.println("----------------------");

        sc.close();
    }
}