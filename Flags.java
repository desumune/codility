import java.util.ArrayList;

public class Flags {
    public int solution(int[] A) {
        ArrayList<Integer> peaks = new ArrayList<>();

        for(int i = 1; i < A.length - 1; i++) {
            if(A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks.add(i);
                i++;
            }
        }

        int maxFlags = Math.min(peaks.size(), (int) Math.sqrt(A.length) + 1);

        for(int i : peaks)
            System.out.print(i + ", ");
        System.out.println();

        while(maxFlags > 0) {
            int counter = 1, index = 0;

            while(index < peaks.size() - 1) {
                System.out.println(index + ", " + maxFlags);
                index = binarySearch(peaks, index + 1, peaks.get(index) + maxFlags);
                if(index < peaks.size() - 1)
                    counter++;
            }

            System.out.println(counter);
            if(counter == maxFlags)
                break;
            else
                maxFlags--;
        }

        return maxFlags;
    }

    private int binarySearch(ArrayList<Integer> array, int index, int key) {
        int start = index, end = array.size() - 1;
        int mid = 0;

        while(start <= end) {
            mid = (start + end) / 2;

            if(array.get(mid) == key)
                return mid;

            if(key > array.get(mid))
                start = mid + 1;
            else
                end = mid - 1;
        }

        return (key > array.get(mid) ? mid + 1 : mid);
    }
}
