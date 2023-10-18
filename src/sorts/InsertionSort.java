package sorts;

public class InsertionSort {

    public void insertionSort(int[] array){
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++){
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

}
