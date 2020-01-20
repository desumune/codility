public class MergeSort {
    public void sort(int[] array) {
        divide(array, 0, array.length - 1);
    }

    private void merge(int[] a, int start, int mid, int end) {
        int[] aux = new int[a.length];

        for(int i = 0; i < a.length; i++)
            aux[i] = a[i];

        assert isSorted(a, start, mid);
        assert isSorted(a, mid + 1, end);

        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++) {
            if(i > mid)
                a[k] = aux[j++];
            else if(j > end)
                a[k] = aux[i++];
            else if(aux[j] < aux[i])
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }

        assert isSorted(a, start, end);
    }

    private void divide(int[] a, int start, int end) {
        if(end <= start) return;
        int mid = start + (end - start) / 2;
        divide(a, start, mid);
        divide(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    private boolean isSorted(int[] array, int start, int end) {
        for(int i = start + 1; i < end; i++)
            if(array[i] >= array[i - 1])
                return true;
        return false;
    }
}