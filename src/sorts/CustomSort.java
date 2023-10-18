package sorts;
/**
 * @author Matthew Simms
 */
public class CustomSort {

    public void customSort(int[] array){
        for (int index : array) {
            if (array[index] > array[index + 1] && array[index + 1] != 0) {
                array[index + 1] = 0;
            }
        }
    }

}
