public class Bubblesort {

    public void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = array.length - 2; j >= 0; j--) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
