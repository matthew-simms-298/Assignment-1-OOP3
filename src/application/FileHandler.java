package application;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import application.Shapes.*;
import sorts.BubbleSort;
import sorts.CustomSort;
import sorts.InsertionSort;
import sorts.MergeSort;
import sorts.QuickSort;
import sorts.SelectionSort;

public class FileHandler {

    // File path for the text file(s)
    private static File filePath1 = new File( "..\\Test Data Stuff\\testData\\polyfor1.txt");
    private static File filePath3 = new File( "..\\Test Data Stuff\\testData\\polyfor3.txt");
    private static File filePath5 = new File("..\\Test Data Stuff\\testData\\polyfor5.txt");
    private static File filePathBig = new File("..\\Test Data Stuff\\polyNameBIG.txt");

    private static int contentAmountNum = 0;
    
    public static void main(String[] args) {
        // Creates Objects from other classes
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        CustomSort customSort = new CustomSort();
        
        double[] importedShapes = new double[contentAmountNum];

        // Scanner to get user input for which file to import
        Scanner fileSelectScanner = new Scanner(System.in);
        System.out.println("Enter Number on which file you want to import \n");
        System.out.println("1: polyfor1.txt\n2: polyfor3.txt\n3: polyfor5.txt\n4: polyNameBIG.txt\n File Select: ");
        int fileSelect = fileSelectScanner.nextInt(); // Set this to the desired fileSelect value
        fileSelectScanner.close();

        // Select File to import based on user input
        switch (fileSelect) {
            case 1: // Importing the data from the text file with filePath 1;
                contentAmountNum = 20237;
                importedShapes = fileImporter(filePath1,contentAmountNum);
            case 2: // Importing the data from the text file with filePath 3
                contentAmountNum = 472956;
                importedShapes = fileImporter(filePath3,contentAmountNum);
            case 3: // Importing the data from the text file with filePath 5
                contentAmountNum = 1078499;
                importedShapes = fileImporter(filePath5,contentAmountNum);
            case 4: // Importing the data from the text file with filePathBig
                contentAmountNum = 8388608;
                importedShapes = fileImporter(filePathBig,contentAmountNum);
            default:
                System.out.println("Error: Input not valid");
                //throw InvalidFileSelectException;
        
        
        // we need to have all the methods to take in an array of Shapes
        bubbleSort.bubbleSort(importedShapes);
        mergeSort.MergeSortArray(importedShapes);
        quickSort.quickSort(0, importedShapes.length);
        insertionSort.InsertionSortArray(importedShapes);
        selectionSort.selectionSort(importedShapes);
        customSort.customSort(importedShapes);
        }
    }

    public double[] fileImport() {
        /**
         * This method will import the data from the text file and store it in a list
         */

        double[] importedShapes = new double[contentAmountNum];

        // Scanner to get user input for which file to import
        Scanner fileSelectScanner = new Scanner(System.in);
        System.out.println("Enter Number on which file you want to import \n");
        System.out.println("1: polyfor1.txt\n2: polyfor3.txt\n3: polyfor5.txt\n4: polyNameBIG.txt\n File Select: ");
        int fileSelect = fileSelectScanner.nextInt(); // Set this to the desired fileSelect value
        fileSelectScanner.close();

        // Select File to import based on user input
        switch (fileSelect) {
            case 1: // Importing the data from the text file with filePath 1;
                contentAmountNum = 20237;
                importedShapes = fileImporter(filePath1,contentAmountNum);
            case 2: // Importing the data from the text file with filePath 3
                contentAmountNum = 472956;
                importedShapes = fileImporter(filePath3,contentAmountNum);
            case 3: // Importing the data from the text file with filePath 5
                contentAmountNum = 1078499;
                importedShapes = fileImporter(filePath5,contentAmountNum);
            case 4: // Importing the data from the text file with filePathBig
                contentAmountNum = 8388608;
                importedShapes = fileImporter(filePathBig,contentAmountNum);
            default:
                System.out.println("Error: Input not valid");
                //throw InvalidFileSelectException;
        }
        return importedShapes;
    }

    public static double[] fileImporter(File filePath, int contentAmount) {
        double[] foundShapes = new double[contentAmount];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)) ) {
            String[] group = new String[contentAmount]; String[] comb = new String[contentAmount];
            // Read the lines and store them in the array
            String line;
            while ((line = br.readLine()) != null) {
                group = line.split("\\s+");
            }

            for(int i = 1, j = 2, n = 3, x = 0; i<group.length-2; i+=3, j+=3, n+=3, x++) {
            	if(group[i].contains("Prism")) {
            		comb[x] = (group[i].split("(?=[A-Z])")[0]+","+group[i].split("(?=[A-Z])")[1])+","+group[j]+","+group[n];
            	}else {
            		comb[x] = group[i]+","+group[j]+","+group[n];
            	}
            }
            int currpoint = 0;

            for(String par: comb){
                String[] check = new String[par.split(",").length];
                if(check.length>3){
                    String uppercased = check[0].toUpperCase();
                    Prism prism = new Prism();
                    prism.setHeight(Double.parseDouble(check[2]));
                    prism.setEdgeLength(Double.parseDouble(check[3]));
                    prism.setBase(uppercased);
                    foundShapes[currpoint] = prism.getVolume();
                }else{
                    switch (check[0].toUpperCase()){
                        case "CONE":
                            Cone cone = new Cone();
                            cone.setHeight(Double.parseDouble(check[1]));
                            cone.setRadius(Double.parseDouble(check[2]));
                            foundShapes[currpoint] = cone.getVolume();
                            break;
                        case "CYLINDER":
                            Cylinder cylinder = new Cylinder();
                            cylinder.setHeight(Double.parseDouble(check[1]));
                            cylinder.setRadius(Double.parseDouble(check[2]));
                            foundShapes[currpoint] = cylinder.getVolume();
                            break;
                        case "PYRAMID":
                            Pyramid pyramid = new Pyramid();
                            pyramid.setHeight(Double.parseDouble(check[1]));
                            pyramid.setRadius(Double.parseDouble(check[2]));
                            foundShapes[currpoint] = pyramid.getVolume();
                            break;
                        default:
                            break;
                    }
                }
                currpoint++;
            }
            // This will store each line of the text file in an array
        } catch (Exception e) {
            System.out.println("Error: File Not Found / Does not Exist"  );
        }

        System.out.println("File Imported");
        return foundShapes;
    }

}