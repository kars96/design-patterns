package com.dp.behavioural.command;

public class CloseFileOperation extends FileOperation {

	CloseFileOperation(TextFile file) {
		super(file);
	}

	@Override
	public void execute() {
		this.getTf().openFile();
	}

}
