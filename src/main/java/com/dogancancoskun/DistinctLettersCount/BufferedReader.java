package com.dogancancoskun.DistinctLettersCount;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BufferedReader {

	Path path;
	List<String> allLines = new ArrayList<String>();

	BufferedReader(Path path) {
		this.path = path;
	}
	
	//Get lines from file as String List
	public void getLinesFromFile() {	
		try {
			setAllLines(Files.readAllLines(path));			
		} catch (IOException e) {
			setAllLines(null);
		}
	}
	
	public Path getPath() {
		return path;
	}
	
	public void setPath(Path path) {
		this.path = path;
	}
	
	public List<String> getAllLines() {
		return allLines;
	}

	public void setAllLines(List<String> allLines) {
		this.allLines = allLines;
	}

}