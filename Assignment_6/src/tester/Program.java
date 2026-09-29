
package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Book
{
    private String isbn;
    private double price;
    private String authorName;
    private int quantity;

    public Book(String isbn, double price, String authorName, int quantity)
    {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public double getPrice()
    {
        return price;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public int getQuantity()
    {
        return quantity;
    }

    @Override
    public String toString()
    {
        return isbn + " " + price + " " + authorName + " " + quantity;
    }
}

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Book> list = new ArrayList<>();

        int choice;

        do
        {
            System.out.println();
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books Forward");
            System.out.println("3. Display All Books Reverse");
            System.out.println("4. Delete Book at Given Index");
            System.out.println("5. Sort Books by Price Descending");
            System.out.println("6. Exit");

            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter ISBN : ");
                    String isbn = sc.next();

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Author Name : ");
                    String authorName = sc.next();

                    System.out.print("Enter Quantity : ");
                    int quantity = sc.nextInt();

                    Book book = new Book(isbn, price, authorName, quantity);
                    list.add(book);

                    System.out.println("Book added successfully");
                    break;

                case 2:
                    System.out.println("Books in Forward Order :");

                    ListIterator<Book> itr = list.listIterator();

                    while(itr.hasNext())
                    {
                        System.out.println(itr.next());
                    }
                    break;

                case 3:
                    System.out.println("Books in Reverse Order :");

                    ListIterator<Book> revItr = list.listIterator(list.size());

                    while(revItr.hasPrevious())
                    {
                        System.out.println(revItr.previous());
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete : ");
                    int index = sc.nextInt();

                    if(index >= 0 && index < list.size())
                    {
                        list.remove(index);
                        System.out.println("Book deleted successfully");
                    }
                    else
                    {
                        System.out.println("Invalid index");
                    }
                    break;

                case 5:
                    list.sort((b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice()));

                    System.out.println("Books sorted by price in descending order");
                    break;

                case 6:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 6);

        sc.close();
    }
}
