package b11_Stack_Queue.daoNguocPhanTu;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyArr<T> {
    private LinkedList<T> arr;

    public MyArr(){
        arr= new LinkedList<>();
    }

    public void push(T element){
        arr.add(element);
    }

    public int size(){
        return arr.size();
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return arr.removeLast();
    }

    public boolean isEmpty(){
        if (arr.size()==0){
            return true;
        }
        return false;
    }
}
