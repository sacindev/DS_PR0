package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 10;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }


    public void fillStack() {
        Integer[] firstPrimeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < CAPACITY; i++) {
            stack.push(firstPrimeNumbers[i]);
        }
    }

    public Integer clearAllStack() {
        Integer sum = 0;
        while (!stack.isEmpty())
            sum += stack.pop();
        return sum;
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }
}
