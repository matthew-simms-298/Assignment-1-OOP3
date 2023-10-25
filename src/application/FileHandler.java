package application;

import java.util.Scanner;

import application.Shapes.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandler {

    public FileHandler() {};

    // File path for the text file(s)
    private String filePath1 = "\\Test Data Stuff\\testData\\polyfor1.txt";
    private String filePath3 = "\\Test Data Stuff\\testData\\polyfor3.txt";
    private String filePath5 = "\\Test Data Stuff\\testData\\polyfor5.txt";
    private String filePathBig = "\\Test Data Stuff\\polyNameBIG.txt";

    public void fileImport() {
        /**
         * This method will import the data from the text file and store it in a list
         */

        // Scanner to get user input for which file to import
        Scanner fileSelectScanner = new Scanner(System.in);
        System.out.println("Enter Number on which file you want to import \n");
        System.out.println("1: polyfor1.txt\n2: polyfor3.txt\n3: polyfor5.txt\n4: polyNameBIG.txt\n File Select: ");
        int fileSelect = fileSelectScanner.nextInt(); // Set this to the desired fileSelect value
        fileSelectScanner.close();

        // Select File to import based on user input
        switch (fileSelect) {
            case 1: // Importing the data from the text file with filePath 1;
                fileImporter(filePath1);
            case 2: // Importing the data from the text file with filePath 3
                fileImporter(filePath3);
            case 3: // Importing the data from the text file with filePath 5
                fileImporter(filePath5);
            case 4: // Importing the data from the text file with filePathBig
                fileImporter(filePathBig);
            default:
                System.out.println("Error: Input not valid");
                //throw InvalidFileSelectException;
        }

    }

    public void fileImporter(String filePath) {  
        	int lineCount = 0;
            // Create an array to store the objects
            String[][] shapesObjectArray = new String[lineCount / 3][3];
            // Shape[] discoveredShapes = new Shape[lineCount / 3];

            // Loop through the lines array and create an object for every three lines
            for (int index = 1; index < lineCount; index++) {
                for (int jndex = 0; jndex < 3; jndex++)
                switch (shapesObjectArray[index][0]) {
                    case "Cone":
                        Cone cone = new Cone();
                        shapesObjectArray[index][0] = "Cone";
                        shapesObjectArray[index][1] = Double.toString(cone.setHeight(jndex + 1));
                        shapesObjectArray[index][2] = Double.toString(cone.setRadius(jndex + 2));
                        // cone.setHeight(Double.parseDouble(lines[jndex + 1]));
                        // cone.setRadius(Double.parseDouble(lines[jndex + 2]));
                        // discoveredShapes[i / 3] = cone;
                    case "Cylinder":
                        Cylinder cylinder = new Cylinder();
                        shapesObjectArray[index][0] = "Cylinder";
                        shapesObjectArray[index][1] = Double.toString(cylinder.setHeight(jndex + 1));
                        shapesObjectArray[index][2] = Double.toString(cylinder.setRadius(jndex + 2));

                        //cylinder.setHeight(Double.parseDouble(lines[i + 2]));
                        // cylinder.setRadius(Double.parseDouble(lines[i + 2]));
                        // discoveredShapes[i / 3] = cylinder;
                    case "Prism":
                        Prism prism = new Prism();
                        // we need to check the type of prism some how
                        shapesObjectArray[index][0] = "Prism";
                        shapesObjectArray[index][1] = Double.toString(prism.setHeight(jndex + 1));
                        shapesObjectArray[index][2] = Double.toString(prism.setEdgeLength(jndex + 2));
                        
                        //prism.setBase(lines[i]);
                        //prism.setHeight(Double.parseDouble(lines[i + 2]));
                        //prism.setEdgeLength(Double.parseDouble(lines[i + 2]));
                        // discoveredShapes[i / 3] = prism;
                    case "Pyrimid":
                        Pyramid pyramid = new Pyramid();
                        shapesObjectArray[index][0] = "Cylinder";
                        shapesObjectArray[index][1] = Double.toString(pyramid.setHeight(jndex + 1));
                        shapesObjectArray[index][2] = Double.toString(pyramid.setRadius(jndex + 2));
                        
                        //pyramid.setHeight(Double.parseDouble(lines[i + 2]));
                        //pyramid.setRadius(Double.parseDouble(lines[i + 2]));
                        // discoveredShapes[i / 3] = pyramid;
                    default:
                        System.out.println("Error: Shape not Recognized / Does not Exist");
                }

            }

           /* for (Object obj : discoveredShapes) {
                Shape shapeObject = (Shape) obj;
                if(shapeObject.getClass()==Prism.class){
                    System.out.println(shapeObject. + ", " + shapeObject.measurement1 + ", " + shapeObject.measurement2);
                }
                */
        System.out.println("File Imported");
    }

}