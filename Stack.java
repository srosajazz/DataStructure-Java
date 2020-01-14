public class Stack {
    private int value[];
    private int top;

    public Stack() {
        value = new int[10];
        top = -1;
    };

    public void push(int element) {
        top = top + 1;
        value[top] = element;
    };

    public boolean isEmpty() {
        return (top == -1);
    };

    public boolean isFull() {
        return (top == 9);
    };

    public int pop() {
        int elem = value[top];
        top--;
        return elem;

    };

}
