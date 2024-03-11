import java.util.Scanner;
class Stack
{
    int capacity, top=0, st[];
    Stack(int n)
    {
        capacity=n;
        st=new int[n];
    }
    void push(int a)
    {
        if (top<capacity-1)
        {
            st[++top]=a;
            System.out.println(a+" is pushed into stack!");
        }
        else
            System.out.println("Stack Overflow!");
    }
    void pop()
    {
        if (top!=0)
            System.out.println(st[top--]+" is popped from stack!");
        else 
            System.out.println("Stack Underflow!");
    }
    void peek()
    {
        if (top!=0)
            System.out.println(st[top]+" is on top of stack");
        else 
            System.out.println("Stack Underflow!");
    }
}
class Queue
{
    int capacity, front,rear, q[];
    Queue(int n)
    {
        front=rear=0;
        capacity=n;
        q=new int[n];
    }
    void enqueue(int a)
    {
        if (rear==capacity-1)
            System.out.println("Overflow!");
        else 
        {
            q[rear++]=a;
            System.out.println("Enqueued "+a);
        }
    }
    void dequeue()
    {
        if (front==-1 || front>=rear)
        {
            System.out.println("Underflow!");
            front=rear=0;
        }
        else 
            System.out.println("Dequeued "+q[front++]);
    }
}
class Test
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner (System.in);
        int c;
        System.out.println(" Stack 1 Queue 2->");
        c=s.nextInt();
        if (c==1)
        {
            Stack st= new Stack(5);
            st.push(12);
            st.push(15);
            st.peek();
            st.pop();
            st.push(10);
            st.pop();
            st.pop();
            st.pop();
        }
        else if (c==2)
        {
            Queue q=new Queue(5);
            q.dequeue();
            q.enqueue(3);
            q.enqueue(12);
            q.dequeue();
            q.dequeue();
            q.dequeue();
            q.enqueue(6);
            q.enqueue(5);
            q.dequeue();
            q.enqueue(13);
            q.enqueue(4);
            q.enqueue(1);
            q.dequeue();
            q.dequeue();
            q.dequeue();
            q.dequeue();
        }

    }
}