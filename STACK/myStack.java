public class myStack {
    private long[] stackArray;
    private int capacity;
    private int top;

    public myStack() {
        capacity = 10;
        stackArray = new long[capacity];
        top = -1;
    }
    public myStack(int s) {
        capacity = s;
        stackArray = new long[capacity];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }
}