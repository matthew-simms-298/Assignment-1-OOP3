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
		Shape[] shapes = new Shape[lineCount];

		// Loop through the lines array and create an object for every three lines
		for (int index = 1; index < lineCount; index++) {
			
			switch ("") { // that will be a place holder till i can think of something else
			case "Cone":
				Cone cone = new Cone();
				cone.setHeight(index + 1);
				cone.setRadius(index + 2);
				shapes[index] = cone;

			case "Cylinder":
				Cylinder cylinder = new Cylinder();
				cylinder.setHeight(index + 1);
				cylinder.setRadius(index + 2);
				shapes[index] = cylinder;

			case "Prism":
				Prism prism = new Prism();
				// we need to check the type of prism some how
				prism.setEdgeLength(index + 1);
				prism.setHeight(index + 2);
				shapes[index] = prism;

			case "Pyrimid":
				Pyramid pyramid = new Pyramid();
				pyramid.setHeight(index + 1);
				pyramid.setRadius(index + 2);
				shapes[index] = pyramid;
				
			default:
				System.out.println("Error: Shape not Recognized / Does not Exist");

			}
			System.out.println("File Imported");
		}
	}
}