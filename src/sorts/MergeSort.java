package sorts;
import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Theodore Wells
 */
public class MergeSort {

	public int[] Body;

    public MergeSort(int...args){
    	Body = args;
    }

    public void SortArray(){
    	int bodyLength = this.Body.length;
        int[][] groups = new int[bodyLength][];
        int[] result = new int[bodyLength];
        
        for(int i = 0; i<bodyLength; i++) 
        {groups[i] = new int[] {this.Body[i]};}
        
        Arrays.sort(groups, Comparator.comparingInt(a -> a[0]));
        
        for(int i = 0; i<bodyLength; i++) 
        {result[i] = groups[i][0];}
        
        this.Body = result;
        
    }
}
