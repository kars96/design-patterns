package com.dp.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class FileOperationExecuter {
	// Invoker
	private List<Operation> fileOperations = new ArrayList<>();
	
	public void executeOperation(Operation operation) {
		fileOperations.add(operation);
		operation.execute();
	}
}
