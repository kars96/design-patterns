package com.dp.behavioural.command;

public class WriteFileOperation extends FileOperation {

	String content;
	
	public WriteFileOperation(TextFile file, String content) {
		super(file);
		this.content = content;
	}

	@Override
	public void execute() {
		this.getTf().closeFile();
	}

}
