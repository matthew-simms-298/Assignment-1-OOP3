package application;

//import java.io.File;
import sorts.*;
/**
 * @author Ryan Clarkson, Matthew Simms, Theodore Wells
 */
public class MainClass {
    public static void main(String[] args) {
        // Creates Objects from other classes
        FileHandler fileHandler = new FileHandler();
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        CustomSort customSort = new CustomSort();

    }
    
}