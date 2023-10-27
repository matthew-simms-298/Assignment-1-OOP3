package application;

import java.awt.Shape;

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
        
        // Shape[] array = fileHandler.fileImporter(null);
        // this needs to be able to take in the shapes created earlier
        
        bubbleSort.bubbleSort();
        mergeSort.MergeSortArray();
        // quickSort.quickSort(array[0], array[array.length]);
        insertionSort.InsertionSortArray();
        selectionSort.selectionSort(null);
        customSort.customSort();

    }
    
}