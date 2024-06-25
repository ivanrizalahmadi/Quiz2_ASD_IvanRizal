public class StudentStack_13 {
    private Student_13[] stack;
    private int top;
    private int capacity;

    public StudentStack_13(int size) {
        stack = new Student_13[size];
        capacity = size;
        top = -1;
    }

    public void push(Student_13 student) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = student;
    }

    public Student_13 pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top--];
    }

    public Student_13 peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }
}
