package tester;

public class GrowableStack implements Stack
{
    private Employee[] arr = new Employee[STACK_SIZE];
    private int top = -1;

    @Override
    public void push(Employee emp)
    {
        if(top == arr.length - 1)
        {
            Employee[] temp = new Employee[arr.length * 2];

            for(int i = 0; i < arr.length; i++)
            {
                temp[i] = arr[i];
            }

            arr = temp;
        }

        top++;
        arr[top] = emp;
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