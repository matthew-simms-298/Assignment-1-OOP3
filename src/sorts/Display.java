package sorts;

public class Display {

	public void PrintArray(int[] array, String sep) {
    	for(int obj: array) {
    		if(obj != array[array.length-1]) {
    			System.out.print(obj+sep);
    		}else {
    			System.out.print(obj+"\n");
    		}
    	}
	}
}