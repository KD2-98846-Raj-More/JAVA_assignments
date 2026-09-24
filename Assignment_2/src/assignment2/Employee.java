/*2.Create a class called Employee that includes three instance variables—a 
first name (type String), a last name (type String) and a monthly salary 
(double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly 
salary is not positive, do not set its value. Write a test application named 
EmployeeTest that demonstrates class Employee’s capabilities. Create two 
Employee objects and display each object’s yearly salary. Then give each 
Employee a 10% raise and display each Employee’s yearly salary again. 
3. Create a class called Date that includes three instance variables—a 
month (type int), a day (type int) and a year (type int). Provide a constructor*/



package assignment2;

class Employee
{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary)
    {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }
}

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Raj", "More", 30000);
        Employee employee2 = new Employee("Rahul", "Patil", 40000);

        System.out.println("Employee 1 : " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Yearly Salary : " + employee1.getMonthlySalary() * 12);

        System.out.println();

        System.out.println("Employee 2 : " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Yearly Salary : " + employee2.getMonthlySalary() * 12);

        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);

        System.out.println();
        System.out.println("After 10% Raise:");

        System.out.println("Employee 1 : " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Yearly Salary : " + employee1.getMonthlySalary() * 12);

        System.out.println();

        System.out.println("Employee 2 : " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Yearly Salary : " + employee2.getMonthlySalary() * 12);
    }
}
