package stack;

import java.util.Scanner;

class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        top=-1;
        capacity =size;
        arr= new int[size];
    }
 
    Stack(int[] inputArr) {
        capacity=inputArr.length;
        arr =new int[capacity];
        for (int i=0; i<capacity; i++) {
            arr[i]= inputArr[i];
        }
        top =capacity-1;
    }
 
    void push(int x) {
        if (top==capacity-1) {
            System.out.println("Stack Overflow!! " +x);
        }else {
        	arr[++top] =x;
        	System.out.println(x+ " pushed");
        }
    }

    void push(int x, int y) {
        push(x);
        push(y);
    }
 
    int pop() {
        if (top==-1) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
        return arr[top--];
    }
 
    void pop(int n) {
        for (int i=0; i<n; i++) {
            int popped=pop();
            if (popped==-1) break; 
            System.out.println("Popped: " + popped);
        }
    }

    void display() {
        if (top==-1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i=top; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 
    void display(int n) {
        if (top==-1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Top " +n+ " elements: ");
        for (int i=top; i>=0 && n>0; i--, n--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class LibraryStackDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack st=null;

        System.out.println("Choose how to initialize stack:");
        System.out.println("1. Empty stack with size");
        System.out.println("2. Stack initialized with array");
        int choice=sc.nextInt();

        if (choice==1) {
            System.out.print("Enter size of stack: ");
            int size=sc.nextInt();
            st=new Stack(size);   
        } else if (choice==2) {
            System.out.print("Enter number of elements: ");
            int n =sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter elements: ");
            for (int i=0; i<n; i++) {
                arr[i]=sc.nextInt();
            }
            st=new Stack(arr);   
        } else {
            System.out.println("Invalid choice! Exiting...");
            sc.close();
            return;
        }
 
        int option;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push one element");
            System.out.println("2. Push two elements");
            System.out.println("3. Pop one element");
            System.out.println("4. Pop multiple elements");
            System.out.println("5. Display full stack");
            System.out.println("6. Display top n elements");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            option=sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter element: ");
                    int val=sc.nextInt();
                    st.push(val);
                    break;

                case 2:
                    System.out.print("Enter two elements: ");
                    int v1=sc.nextInt();
                    int v2 = sc.nextInt();
                    st.push(v1,v2);
                    break;

                case 3:
                    int popped=st.pop();
                    if (popped!=-1)
                        System.out.println("Popped: " +popped);
                    break;

                case 4:
                    System.out.print("Enter number of elements to pop: ");
                    int n=sc.nextInt();
                    st.pop(n);
                    break;

                case 5:
                    st.display();
                    break;

                case 6:
                    System.out.print("Enter number of top elements: ");
                    int topN=sc.nextInt();
                    st.display(topN);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (option!=7);
    }
}
