package com.dp.behavioural.command;

public abstract class FileOperation implements Operation  {
	// Command
	private TextFile tf;
	
	public TextFile getTf() {
		return tf;
	}

	public void setTf(TextFile tf) {
		this.tf = tf;
	}
	
	FileOperation(TextFile file) {
		this.tf = file;
	}
}
