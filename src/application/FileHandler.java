package application;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandler {

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
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            int lineCount = 0;
            // This will get the line count of the text file
            while (br.readLine() != null) {
                lineCount++;
            }
            //Test to see if the line count is correct
            System.out.println(filePath + " has " + lineCount + " lines");
            br.close();

            String[] lines = new String[lineCount];
            // This will store each line of the text file in an array
        } catch (Exception e) {
            System.out.println("Error: File Not Found / Does not Exist"  );
        }

        System.out.println("File Imported");
        /**
         * Create a loop to save each line of the text file into an array
         */
        //Print Array - See if array has been created correctly
    }

}