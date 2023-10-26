package sorts;
/**
 * @author: Ryan Clarkson
 */
public class BubbleSort {

	private int[] Body;

	public BubbleSort(int...args){
		this.Body = args;
	}

    	public void bubbleSort() {
    	long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();
    	long time = end - start;
    	
		int alength = this.Body.length-1;
		boolean swap;
		for (int a = 0; a<alength; a++) {
			swap = false;
			for(int b = 0; b<alength-a-1; b++) {
				if (this.Body[b]>this.Body[b]+1) {
					int temp = this.Body[b];
					this.Body[b] = this.Body[b]+1;
					this.Body[b+1] = temp;
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
