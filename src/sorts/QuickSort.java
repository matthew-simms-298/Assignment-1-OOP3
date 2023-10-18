package sorts;

public class QuickSort {

    public void swapValues(int[] array, int index, int jndex) {
        int placeHolder = array[index];
        array[index] = array[jndex];
        array[jndex] = placeHolder;

    }


     public int partitionArray(int leftBound, int rightBound, int[] array) {
        int pivot = array[rightBound];

        int index = leftBound - 1;

        for (int jndex = leftBound; jndex <= rightBound - 1; jndex++) {
            if (array[rightBound] < pivot) {
                index++;
                swapValues(array, index, jndex);
            }
        }
        swapValues(array, index + 1, rightBound);
        return index + 1;
    }

    public void quickSort(int[] array, int leftBound, int rightBound) {
        if (leftBound < rightBound) {
            int partition = partitionArray(leftBound, rightBound, array);

            quickSort(array, leftBound, partition - 1);
            quickSort(array, partition + 1, rightBound);
        }
    }
}
