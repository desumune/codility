public class InsertionSort {

    public void sort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int j = i;
            int v = array[i];
            while(j > 0 && v < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = v;
        }
    }
}
