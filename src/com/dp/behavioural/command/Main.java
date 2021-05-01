package com.dp.behavioural.command;

public class Main {
	// Client
	/**
	 * 
	 * https://www.baeldung.com/java-command-pattern
	 * 
	 * The pattern intends to encapsulate in an object all the data required for performing a given action (command), including what method to call, the method's arguments, and the object to which the method belongs.

		This model allows us to decouple objects that produce the commands from their consumers, so that's why the pattern is commonly known as the producer-consumer pattern.

	 * The Command interface: This is usually declared just a single method for executing the command.
	The ConcreteCommand: This is an operation with parameters that pass the call to the receiver; In the classic approach, a command only invokes one or more methods of a Receiver rather than perform business logic.
	The Receiver: is especially knows how to perform the action.
	The Invoker: asks the command to carry out the request.
	The Client: creates a ConcreteCommand object and sets the Receiver.
	 * @param args
	 */
	public static void main(String[] args) {
		TextFile file = new TextFile("sample.txt");
		
		FileOperationExecuter executer = new FileOperationExecuter();
		
		OpenFileOperation openOp = new OpenFileOperation(file);
		WriteFileOperation writeOp = new WriteFileOperation(file, "Hello");
		CloseFileOperation closeOp = new CloseFileOperation(file);
		executer.executeOperation(openOp);
		executer.executeOperation(writeOp);
		executer.executeOperation(closeOp);
		
		
		// using method/lambda reference
		executer.executeOperation(file::openFile);
		executer.executeOperation(() -> file.write("Hello Lambda"));
		executer.executeOperation(file::closeFile);
	}
}
