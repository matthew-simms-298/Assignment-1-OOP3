package sorts;
/**
 * @author Matthew Simms
 */
public class QuickSort {
	/*
	 *  this needs to be reworked in order to have the 
	 * quick sort take in a the array as well. Only thing is
	 * you need to import the array in the class and not
	 * the method or else it will reset the values every time
	 * you run it 
	 */

    private int[] Body;

    public QuickSort(int...args){
        this.Body = args;
    }

    public void swapValues(int index, int jndex) {
        int placeHolder = this.Body[index];
        this.Body[index] = this.Body[jndex];
        this.Body[jndex] = placeHolder;

    }

     public int partitionArray(int leftBound, int rightBound) {
        int pivot = this.Body[rightBound];

        int index = leftBound - 1;

        for (int jndex = leftBound; jndex <= rightBound - 1; jndex++) {
            if (this.Body[rightBound] < pivot) {
                index++;
                swapValues(index, jndex);
            }
        }
        swapValues(index + 1, rightBound);
        return index + 1;
    }

    public void quickSort(int leftBound, int rightBound) {
    	long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();
    	long time = end - start;
    	
        if (leftBound < rightBound) {
            int partition = partitionArray(leftBound, rightBound);

            quickSort(leftBound, partition - 1);
            quickSort(partition + 1, rightBound);
            
            System.out.print("Quick Sort Time: " + time);
        }
    }
}
