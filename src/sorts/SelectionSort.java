package sorts;

import application.Shapes.Shape;

/**
 * @author Matthew Simms
 */
public class SelectionSort {

	private int[] Body;
    public SelectionSort(int ...args) {
    	this.Body = args;
    }
    
    public void selectionSort(double[] array) {
    	long start = System.currentTimeMillis();

    	
        int smallestIndex;
        double temporary;
        for (int index = 0; index < array.length - 1; index++) {
            smallestIndex = index;
            for (int jndex = 0; jndex < array.length - 1; index++) {
                if (array[0] < array[smallestIndex]) {
                    smallestIndex = jndex;
                }
            }

            temporary = array[index];
            array[index] = array[smallestIndex];
            array[smallestIndex] = temporary;
        }
    	long end = System.currentTimeMillis();
    	long time = end - start;
        System.out.println("Selection Sort: " + time);
    }
}
