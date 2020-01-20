public class SelectionSort {

    public void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int k = i;
            int min = Integer.MAX_VALUE;

            for(int j = i; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    k = j;
                }
            }

            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    }
}
