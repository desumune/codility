import java.util.ArrayList;
import java.util.List;

public class FibFrog {
    public int solution(int[] A) {
        if(A.length == 0)
            return 1;

        List<Integer> fibNumbers = new ArrayList<>();

        fibNumbers.add(1);
        fibNumbers.add(2);

        while(true) {
            int nextFib = fibNumbers.get(fibNumbers.size() - 1) + fibNumbers.get(fibNumbers.size() - 2);

            if(nextFib <= A.length + 1)
                fibNumbers.add(nextFib);
            else
                break;
        }

        for(int i : fibNumbers)
            System.out.print(i + ", ");
        System.out.println();

        int minJumps = Integer.MAX_VALUE;

        loop:
        for(int i = 0; i < fibNumbers.size(); i++) {
            int currentPosition = 0;
            int jumps = 0;

            if(currentPosition + fibNumbers.get(i) == A.length + 1 || A[fibNumbers.get(i) - 1] == 1) {
                currentPosition += fibNumbers.get(i);
                jumps++;
            }
            else
                continue;

            int j = 1;

            loop2:
            while(j != -1) {
                for(j = fibNumbers.size() - 1; j >= 0; j--) {
                    if(currentPosition == A.length + 1) {
                        minJumps = Math.min(minJumps, jumps);
                        continue loop;
                    }

                    if(fibNumbers.get(j) <= A.length + 1 - currentPosition) {
                        if(currentPosition + fibNumbers.get(j) == A.length + 1 || A[currentPosition + fibNumbers.get(j) - 1] == 1) {
                            currentPosition += fibNumbers.get(j);
                            jumps++;
                            continue loop2;
                        }
                    }
                }
            }
        }
        return (minJumps == Integer.MAX_VALUE ? -1 : minJumps);
    }
}