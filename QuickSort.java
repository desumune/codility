public class QuickSort {

    public void sort(int[] array) {
        partition(array, 0, array.length - 1);
    }

    private void partition(int[] array, int low, int high) {
        int i = low, j = high;

        int pivot = array[low];

        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;

            if (i > j) break;

            swap(array, i, j);
            i++;
            j--;
        }

        if (low < j)
            partition(array, low, j);
        if (i < high)
            partition(array, i, high);
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
