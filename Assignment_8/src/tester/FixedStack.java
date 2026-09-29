package tester;

public class FixedStack implements Stack
{
    private Employee[] arr = new Employee[STACK_SIZE];
    private int top = -1;

    @Override
    public void push(Employee emp)
    {
        if(top == STACK_SIZE - 1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            arr[top] = emp;
        }
    }

    @Override
    public Employee pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return null;
        }

        Employee emp = arr[top];
        arr[top] = null;
        top--;

        return emp;
    }
}