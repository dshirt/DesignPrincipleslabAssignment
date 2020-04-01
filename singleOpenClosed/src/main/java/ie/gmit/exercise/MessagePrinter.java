package ie.gmit.exercise;


import java.io.IOException;

public class MessagePrinter {

	private PrintFile printFile;
	private Message msg;
	private String fileName;
	private char printToFile;

	public MessagePrinter(PrintFile printFile, char printToFile, Message msg, String fileName) {
		this.printFile = printFile;
		this.printToFile = printToFile;
		this.msg = msg;
		this.fileName = fileName;
	}

	public void printOutFile() throws IOException {

		switch (printToFile) {

			case 'S':
			case 's':
				printFile.writeMessageToScreen(msg);
				break;
			case 'F':
			case 'f':
				printFile.writeMessageToFile(msg, fileName);
				break;
			default:
				System.out.println("Only s or f are valid");
				break;

		}
	}
}