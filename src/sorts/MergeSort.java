package sorts;
import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Theodore Wells
 */
public class MergeSort {

	private int[] Body;

    public MergeSort(int...args){
    	this.Body = args;
    }

    public void MergeSortArray(double[] array) {
    	long start = System.currentTimeMillis();
    	long end = System.currentTimeMillis();
    	long time = end - start;
    	
    	int arrayLength = array.length;
        double[][] groups = new double[arrayLength][];
        double[] result = new double[arrayLength];
        
        for(int index = 0; index < arrayLength; index++) 
        {groups[index] = new double[] {array[index]};}
        
        // idk what this line is all about
        // Arrays.sort(groups, Comparator.comparingInt(a -> a[0]));
        
        for(int i = 0; i<arrayLength; i++) 
        {result[i] = groups[i][0];}
        
        array = result;
        
        System.out.println("Merge Sort: " + time);
        
    }
}
