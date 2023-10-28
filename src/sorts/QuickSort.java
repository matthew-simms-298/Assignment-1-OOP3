package sorts;
/**
 * @author Matthew Simms
 */
public class QuickSort {

    private int[] Body;

    public QuickSort(int...args){
        this.Body = args;
    }

    public void swapValues(double[] array, int index, int jndex) {
        double placeHolder = array[index];
        array[index] = array[jndex];
        array[jndex] = placeHolder;

    }

     public int partitionArray(double[] array, int leftBound, int rightBound) {
        double pivot = array[rightBound -1];

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

    public void quickSort(double[] array, int leftBound, int rightBound) {
    	long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();
    	long time = end - start;
    	
        if (leftBound < rightBound) {
            int partition = partitionArray(array, leftBound, rightBound - 1);

            quickSort(array, leftBound, partition - 1);
            quickSort(array, partition + 1, rightBound);
            
            System.out.print("Quick Sort Time: " + time);
        }
    }
}
