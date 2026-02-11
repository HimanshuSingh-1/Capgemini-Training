package capg;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " : Pushed to Stack");
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Under Flow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack Under Flow");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackViaLL {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.display();

        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
