import java.util.LinkedList;

public class Fish {
    public int solution(int[] A, int[] B) {
        int alive = 0;
        LinkedList<Integer> fishGoingDown = new LinkedList<>();

        int i = 0;

        loop:
        while(i < B.length) {
            while(B[i] != 1) {
                i++;
                alive++;
                continue loop;
            }

            alive++;
            fishGoingDown.add(i);

            while(i < B.length - 1 && B[i + 1] != 0) {
                alive++;
                i++;
                fishGoingDown.add(i);
            }

            if(i == B.length - 1)
                break;

            while(!fishGoingDown.isEmpty() && i < B.length - 1 && B[i + 1] == 0) {
                if(A[i + 1] > A[fishGoingDown.getLast()]) {
                    fishGoingDown.removeLast();
                    alive--;
                    continue;
                }
                i++;
            }
            i++;
        }

        return alive;
    }
}
