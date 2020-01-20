import java.util.Stack;

public class EquiLeader {
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
            return 0;

        int countRight = 0;

        for(int i : A)
            if(i == stack.peek()) {
                countRight++;
            }

        if(countRight <= A.length / 2)
            return 0;

        int countEqui = 0, countLeft = 0;

        for(int i = 1; i < A.length; i++) {
            if(A[i - 1] == stack.peek()) {
                countLeft++;
                countRight--;
            }

            if(countLeft > i / 2 && countRight > (A.length - i) / 2)
                countEqui++;
        }

        return countEqui;
    }
}