package sorts;
/**
 * @author Theodore Wells
 */
public class InsertionSort {

	private int[] Body;
	
	public InsertionSort(int...args) {
		this.Body = args;
	}
	
    public void InsertionSortArray(){
        int arrayLength = this.Body.length;
        for (int i = 1; i < arrayLength; i++){
            int key = this.Body[i];
            int j = i - 1;
            while (j >= 0 && this.Body[j] > key){
            	this.Body[j+1] = this.Body[j];
                j--;
            }
            this.Body[j+1] = key;
        }
    }
}
