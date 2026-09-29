package tester;


public class Student
{
    private int roll;
    private String name;
    private double marks;

    public Student(int roll, String name, double marks)
    {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll()
    {
        return roll;
    }

    public String getName()
    {
        return name;
    }

    public double getMarks()
    {
        return marks;
    }

    @Override
    public String toString()
    {
        return roll + " " + name + " " + marks;
    }
}
