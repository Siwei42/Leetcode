package Array;
import java.util.*;
public class ImplementStackUsingQueues {
/*	
	One Queues methods
*/	
	Queue<Integer> queue = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        for(int i = 0; i < queue.size()-1; i++)
            queue.add(queue.poll());
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
	
	
	
/*	
	Two Queues methods
*/ 
	Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push2(int x) {
        queue1.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop2() {
        while(queue1.size() > 1)
            queue2.offer(queue1.poll());
        queue1.poll();
        Queue<Integer> q= queue1;
        queue1 = queue2;
        queue2 = q;
    }

    // Get the top element.
    public int top2() {
        while(queue1.size() > 1)
            queue2.offer(queue1.poll());
        int res = queue1.peek();
        queue2.offer(queue1.poll());
        Queue<Integer> q= queue1;
        queue1 = queue2;
        queue2 = q;
        return res;
    }

    // Return whether the stack is empty.
    public boolean empty2() {
        return queue1.isEmpty();
    }
}
