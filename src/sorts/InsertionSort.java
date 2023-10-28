package sorts;
/**
 * @author Theodore Wells
 */
public class InsertionSort {

	private int[] Body;
	
	public InsertionSort(int...args) {
		this.Body = args;
	}
	
    public void InsertionSortArray(double[] array) {
    	long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();
    	long time = end - start;
    	
        double arrayLength = array.length;
        for (int index = 1; index < arrayLength; index++) {
            double key = array[index];
            int jndex = index - 1;
            while (jndex >= 0 && array[jndex] > key){
            	array[jndex+1] = array[jndex];
                jndex--;
            }
            array[jndex + 1] = key;
        }
        System.out.println("Insertion Sort: " + time);
    }
}
