package sorts;
/**
 * @author Matthew Simms
 */
public class SelectionSort {

    public SelectionSort() {
        
    }
    
    public static int selectionSort(int[] array) {
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
        return 0;
    }
}
