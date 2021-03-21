package com.dogancancoskun.DistinctLettersCount;

import java.nio.file.Paths;

public class App {
	
	public static final String INPUT_PATH_FILE = "./src/main/java/input.txt";
	
	//RUN PROGRAM
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(Paths.get(INPUT_PATH_FILE));
		int lineNumber = 0;
		
		bufferedReader.getLinesFromFile();	
		
		for (String line : bufferedReader.getAllLines()) {
			if (!line.isEmpty()) {
				printOutput(lineNumber++, DistinctLettersCount.getDistinctLettersCount(line.toLowerCase()));
			}
		}
	}
	
	//Print mininum deleted distinct letter count with line number
	public static void printOutput(int lineNumber , int count) {
		System.out.println(lineNumber + "- " + count);
	}
}
