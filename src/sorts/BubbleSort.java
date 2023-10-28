package sorts;
/**
 * @author: Ryan Clarkson
 */
public class BubbleSort {

	private int[] Body;

	public BubbleSort(int...args){
		this.Body = args;
	}

    	public void bubbleSort(double[] array) {
    	long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();
    	long time = end - start;
    	
		int arrayLength = array.length;
		boolean swap;
		for (int index  = 0; index < arrayLength; index ++) {
			swap = false;
			for(int jndex  = 0; jndex < arrayLength - index - 1; jndex++) {
				if (array[jndex] > array[jndex + 1]) {
					double temp = array[jndex];
					array[jndex ] = array[jndex + 1];
					array[jndex + 1] = temp;
					swap = true;
				}

			}
			if (!swap) {
				break;
			}
		}
		System.out.println("Bubble Sort Time: " + time);
	}

}
