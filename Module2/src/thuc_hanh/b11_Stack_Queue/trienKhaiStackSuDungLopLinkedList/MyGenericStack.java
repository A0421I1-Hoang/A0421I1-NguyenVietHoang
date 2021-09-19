package b11_Stack_Queue.trienKhaiStackSuDungLopLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<T>();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }
}
