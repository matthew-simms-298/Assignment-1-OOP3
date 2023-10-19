package sorts;
/**
 * @author Matthew Simms
 */
public class CustomSort {

    private int[] Body;

    public CustomSort(int...args){
        this.Body = args;
    }

    public void customSort(){
        for (int index : this.Body) {
            if (this.Body[index] > this.Body[index + 1] && this.Body[index + 1] != 0) {
                this.Body[index + 1] = 0;
            }
        }
    }

}
