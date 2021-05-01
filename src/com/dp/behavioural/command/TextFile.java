package com.dp.behavioural.command;

public class TextFile {
	// Receiver
	private String fileName;

	public void openFile() {
		System.out.println("Opening File..");
	}
	
	public void closeFile() {
		System.out.println("Closing file..");
	}
	
	public void write(String content) {
		System.out.println("Writing to file : "+content);
	}
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	TextFile(String name) {
		setFileName(name);
	}
	
}
