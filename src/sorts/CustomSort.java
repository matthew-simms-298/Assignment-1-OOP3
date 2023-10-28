package sorts;
/**
 * @author Matthew Simms
 */
public class CustomSort {

    private int[] Body;

    public CustomSort(int...args){
        this.Body = args;
    }
    

    public void customSort(double[] array){
    	long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();
    	long time = end - start;
    	
        for (int index = 0; index < array.length; index++) {
            if (array[index] > array[index + 1] && array[index + 1] != 0) {
                array[index + 1] = 0;
            }
            System.out.println("Custom Sort Time: " + time);
        }
    }

}
