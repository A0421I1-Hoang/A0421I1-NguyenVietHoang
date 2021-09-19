package b11_Stack_Queue.daoNguocPhanTu;

public class StackClient {
    public static void DaoNguocPhanTuSo() {
        MyStack<Integer> stack = new MyStack<>();
        MyArr<Integer> arr = new MyArr<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("1.1. Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            int temp=stack.pop();
            System.out.printf(" %d", temp);
            arr.push(temp);
        }
        System.out.printf("\n1.3. Pop elements from arr : ");
        while (!arr.isEmpty()) {
            System.out.printf(" %d", arr.pop());
        }
        System.out.println("\n1.4 Size of stack after pop operations : " + stack.size());
    }
}