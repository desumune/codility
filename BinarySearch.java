public class BinarySearch {
    public boolean isInArray(int[] array, int index, int key) {
        int start = index, end = array.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(array[mid] == key)
                return true;

            if(key > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }
}
