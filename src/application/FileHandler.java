package application;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

import application.Shapes.*;

public class FileHandler {

    // File path for the text file(s)
    private String filePath1 = "\\Test Data Stuff\\testData\\polyfor1.txt";
    private String filePath3 = "\\Test Data Stuff\\testData\\polyfor3.txt";
    private String filePath5 = "\\Test Data Stuff\\testData\\polyfor5.txt";
    private String filePathBig = "\\Test Data Stuff\\polyNameBIG.txt";

    private int contentAmountNum = 0;

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
                contentAmountNum = 20237;
                fileImporter(filePath1);
            case 2: // Importing the data from the text file with filePath 3
                contentAmountNum = 472956;
                fileImporter(filePath3);
            case 3: // Importing the data from the text file with filePath 5
                contentAmountNum = 1078499;
                fileImporter(filePath5);
            case 4: // Importing the data from the text file with filePathBig
                contentAmountNum = 8388608;
                fileImporter(filePathBig);
            default:
                System.out.println("Error: Input not valid");
                //throw InvalidFileSelectException;
        }

    }

    public Shape[] fileImporter(String filePath) {
    	Shape[] foundShapes = new Shape[contentAmountNum]; int currpoint = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)) ) {
        	
            String[] group = new String[contentAmountNum]; String[] comb = new String[contentAmountNum];
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
            

            for(String par: comb){
                String[] check = new String[par.split(",").length];
                if(check.length>3){
                    String uppercased = check[0].toUpperCase();
                    Prism prism = new Prism();
                    prism.setHeight(Double.parseDouble(check[2]));
                    prism.setEdgeLength(Double.parseDouble(check[3]));
                    prism.setBase(uppercased);
                    foundShapes[currpoint] = prism;
                }else{
                    switch (check[0].toUpperCase()){
                        case "CONE":
                            Cone cone = new Cone();
                            cone.setHeight(Double.parseDouble(check[1]));
                            cone.setRadius(Double.parseDouble(check[2]));
                            foundShapes[currpoint] = cone;
                            break;
                        case "CYLINDER":
                            Cylinder cylinder = new Cylinder();
                            cylinder.setHeight(Double.parseDouble(check[1]));
                            cylinder.setRadius(Double.parseDouble(check[2]));
                            foundShapes[currpoint] = cylinder;
                            break;
                        case "PYRAMID":
                            Pyramid pyramid = new Pyramid();
                            pyramid.setHeight(Double.parseDouble(check[1]));
                            pyramid.setRadius(Double.parseDouble(check[2]));
                            foundShapes[currpoint] = pyramid;
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
        /**
         * Create a loop to save each line of the text file into an array
         */
        //Print Array - See if array has been created correctly
		return foundShapes;
    }

}