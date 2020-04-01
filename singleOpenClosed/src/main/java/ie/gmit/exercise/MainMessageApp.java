package ie.gmit.exercise;

import java.io.IOException;

public class MainMessageApp {

	public static void main(String[] args) throws IOException {

		Message msg = new Message("This is a message");
		System.out.println(msg.getMsg());
		String fileName = "test_msg.json";
		String textFile = "test_msg.txt";
		FileOutput jsonFormat = new FileOutput(new JSONFormatter());
		FileOutput textFormat = new FileOutput(new TextFormatter());
		MessagePrinter json = new MessagePrinter(jsonFormat,'f', msg, fileName);
		MessagePrinter text = new MessagePrinter(textFormat,'F', msg, textFile);
		json.printOutFile();
		text.printOutFile();

	}

}
