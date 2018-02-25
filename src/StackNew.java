import java.util.NoSuchElementException;
import java.util.Scanner;

public class StackNew {

    protected int stackArr[];
    protected int top, size, length;

    /*Default Constructor*/
    public StackNew(){};

    /*  Constructor for StackNew */
    public StackNew(int n)
    {
        size = n;
        length = 0;
        stackArr = new int[size];
        top = -1;
    }

    /*  Add an element to the Stack */
    public void push(int i)
    {
        /*Check first if there is space available in Stack*/
        if(top + 1 >= size) {
            throw new IndexOutOfBoundsException("Overflow Exception");
        }
        if(top + 1 < size )
            stackArr[++top] = i;
        length++ ;
    }
    /*  Delete an element from the stack */
    public int pop() {
        /*Check First, if Stack is empty*/
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        length--;
        return stackArr[top--];
    }
    /*Simply return the size of Stack*/
    public int getSize()
    {
        return length ;
    }

    /*  Check if stack is empty */
    public boolean isEmpty()
    {
        return top == -1;
    }

    /*  Display the status of the stack */
    public void display()
    {
        /*Check if stack is empty*/
        if (length == 0)
        {
            System.out.print("Stack is empty\n");
            return ;
        }
        /*Print all the elements of stack stored in an array*/
        for (int i = top; i >= 0; i--)
            System.out.print(stackArr[i]+" ");
        System.out.println();
    }
}