package dcll.crom;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by clement on 17/02/16.
 */
public class MySimpleStack {

    private ArrayList<Item> stack = new ArrayList<Item>();

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int getSize() {
        return stack.size();
    }

    public void push(Item item) {
        stack.add(stack.size(), item);
    }

    public Item peek() throws  EmptyStackException{
        if(stack.isEmpty()) throw new EmptyStackException();
        return stack.get(stack.size()-1);
    }

    public Item pop() throws EmptyStackException{
        Item i = peek();
        stack.remove(stack.size() - 1);
        return i;
    }

    public String toString(){
        return "Size : "+stack.size();
    }
}
