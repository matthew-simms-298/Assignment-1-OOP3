package application;
/**
 * @author Ryan Clarkson and Matthew Simms
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class FileHandler {

    // File path for the text file(s)
    private String filePathBig = "\\Test Data Stuff\\polyNameBIG.txt";
    private String filePath1 = "\\Test Data Stuff\\testData\\polyfor1.txt";
    private String filePath3 = "\\Test Data Stuff\\testData\\polyfor3.txt";
    private String filePath5 = "\\Test Data Stuff\\testData\\polyfor5.txt";

    public class FileHandler {
        public void fileImport() {
            /**
             * This method will import the data from the text file and store it in a list
             */

            // Scanner to get user input for which file to import
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number on which file you want to import \n");
            ystem.out.println("1: polyfor1.txt\n2: polyfor3.txt\n3: polyfor5.txt\n4: polyNameBIG.txt\n File Select: ");
            int fileSelect = scanner.nextInt(); // Set this to the desired fileSelect value
            String filePath = "";
            
            //Select File to import based on user input
            switch (fileSelect) {
                case 1: //Importing the data from the text file with filePath 1;
                    filePath = filePath1;
                    break;
                case 2: //Importing the data from the text file with filePath 3
                    filePath = filePath3;
                    break;
                case 3: //Importing the data from the text file with filePath 5
                    filePath = filePath5;
                    break;
                case 4: //Importing the data from the text file with filePathBig
                    filePath = filePathBig;
                    break;
                default:
                    System.out.println("Invalid fileSelect value");
                    break;
                // Importing the data from the text file method called fileImporter()
                fileImporter(filePath);
        }

        public void fileImporter(String filePath) {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            int lineCount = 0; // for now i will find a way to get the line count
            String[] lines = new String[lineCount]
                       
        }

    }
    }
}