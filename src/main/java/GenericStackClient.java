import java.util.EmptyStackException;

public class GenericStackClient {
    public static void stackOfString() throws EmptyStackException {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five, ");
        stack.push("Two, ");
        stack.push("Three, ");
        stack.push("Nine, ");
        stack.push("Ten, ");

        System.out.println("size of stack after push operations: " + stack.size());
        System.out.printf("Pop element from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%s ", stack.pop());
        }
        System.out.println("\n Size of stack after pop operations: " + stack.size());
    }


    public static void stackOfIntegers() throws EmptyStackException {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(2);
        stack.push(6);

        System.out.println("Size of stack after push: " + stack.size());
        System.out.println("Pop element form stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\n Size of stack after pop operations: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of integer");
        stackOfIntegers();

        System.out.println("Stack of String");
        stackOfString();
    }
}

