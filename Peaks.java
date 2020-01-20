import java.util.ArrayList;

public class Peaks {
    public int solution(int[] A) {
        ArrayList<Integer> peaks = new ArrayList<>();

        for(int i = 1; i < A.length - 1; i++) {
            if(A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks.add(i);
                i++;
            }
        }

        loop:
        for(int i = peaks.size(); i > 0; i--) {
            if(A.length % i != 0)
                continue;

            int blockLength = A.length / i, find = peaks.size() - 1;

            for(int j = A.length - 1; j > 0; j -= blockLength) {
                while(find >= 0) {
                    if(peaks.get(find) > j || peaks.get(find) <= j - blockLength) {
                        if(find < 1) {
                            continue loop;
                        }
                        find--;
                    }
                    else {
                        find--;
                        break;
                    }
                }
            }
            return i;
        }
        return 0;
    }
}
