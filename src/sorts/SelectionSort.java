package sorts;
/**
 * @author Matthew Simms
 */
public class SelectionSort {

	private int[] Body;
    public SelectionSort(int ...args) {
    	this.Body = args;
    }
    
    public void selectionSort(int[] array) {
    	long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();
    	long time = end - start;
    	
        int smallestIndex;
        int temporary;
        for (int index = 0; index < array.length - 1; index++) {
            smallestIndex = index;
            for (int jndex = 0; jndex < array.length - 1; index++) {
                if (array[jndex] < array[smallestIndex]) {
                    smallestIndex = jndex;
                }
            }

            temporary = array[index];
            array[index] = array[smallestIndex];
            array[smallestIndex] = temporary;
        }
        System.out.println("Selection Sort: " + time);
    }
}
