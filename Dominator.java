import java.util.Stack;

public class Dominator {
    public int solution(int[] A) {
        Stack<Integer> stack = new Stack<>();

        for(int i : A) {
            if(!stack.isEmpty() && stack.peek() != i) {
                stack.pop();
                continue;
            }
            stack.push(i);
        }

        if(stack.isEmpty())
            return -1;

        int count = 0, index = 0;

        for(int i = 0; i < A.length; i++)
            if(A[i] == stack.peek()) {
                count++;
                index = i;
            }

        if(count > A.length / 2)
            return index;
        else
            return -1;
    }
}
