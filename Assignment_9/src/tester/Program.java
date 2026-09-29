package tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        List<Student> list = new ArrayList<>();

        int choice;

        do
        {
            System.out.println();
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("7. Exit");

            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Roll No : ");
                    int roll = sc.nextInt();

                    System.out.print("Enter Name : ");
                    String name = sc.next();

                    System.out.print("Enter Marks : ");
                    double marks = sc.nextDouble();

                    Student student = new Student(roll, name, marks);
                    list.add(student);

                    System.out.println("Student added successfully");
                    break;

                case 2:
                    Iterator<Student> itr = list.iterator();

                    while(itr.hasNext())
                    {
                        System.out.println(itr.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No : ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for(Student s : list)
                    {
                        if(s.getRoll() == searchRoll)
                        {
                            System.out.println(s);
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    list.sort(new Comparator<Student>()
                    {
                        @Override
                        public int compare(Student s1, Student s2)
                        {
                            return Integer.compare(s1.getRoll(), s2.getRoll());
                        }
                    });

                    System.out.println("Students sorted by Roll No");
                    break;

                case 5:
                    list.sort(new Comparator<Student>()
                    {
                        @Override
                        public int compare(Student s1, Student s2)
                        {
                            return s1.getName().compareTo(s2.getName());
                        }
                    });

                    System.out.println("Students sorted by Name");
                    break;

                case 6:
                    list.sort(new Comparator<Student>()
                    {
                        @Override
                        public int compare(Student s1, Student s2)
                        {
                            return Double.compare(s1.getMarks(), s2.getMarks());
                        }
                    });

                    System.out.println("Students sorted by Marks");
                    break;

                case 7:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 7);

        sc.close();
    }
}