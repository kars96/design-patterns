package com.dp.behavioural.command;

public class OpenFileOperation extends FileOperation {

	OpenFileOperation(TextFile file) {
		super(file);
	}

	@Override
	public void execute() {
		this.getTf().closeFile();
	}

}
