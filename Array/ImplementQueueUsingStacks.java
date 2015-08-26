package Array;
import java.util.*;
public class ImplementQueueUsingStacks {
	
/*
	One Stack Method
*/
	Stack<Integer> stack = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> newstack = new Stack<Integer>();
        while(!stack.empty())
            newstack.push(stack.pop());
        stack.push(x);
        while(!newstack.empty())
            stack.push(newstack.pop());
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack.pop();
    }

    // Get the front element.
    public int peek() {
        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.empty();
    }
    
/*	
	Two stacks methods
*/    
    Stack<Integer> oldstack = new Stack<Integer>();
    Stack<Integer> newstack = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push2(int x) {
        newstack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop2() {
        if(oldstack.empty()){
            while(!newstack.empty()){
                oldstack.push(newstack.pop());
            }
        }
        oldstack.pop();
    }

    // Get the front element.
    public int peek2() {
        if(oldstack.empty()){
            while(!newstack.empty()){
                oldstack.push(newstack.pop());
            }
        }
        return oldstack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty2() {
        return (newstack.empty() && oldstack.empty());
    }
}
