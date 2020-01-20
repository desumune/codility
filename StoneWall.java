import java.util.Stack;

public class StoneWall {
    public int solution(int[] H) {
        int count = 0;

        Stack<Integer> heights = new Stack<>();

        for(int i : H) {
            while(!heights.isEmpty() && heights.peek() > i)
                heights.pop();

            if(heights.isEmpty() || heights.peek() < i) {
                count++;
                heights.push(i);
            }
        }
        return count;
    }
}
