package ie.gmit.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutput implements PrintFile {

    Formatter formatter;

    public FileOutput(Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void writeMessageToFile(Message msg, String fileName) throws IOException {
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
        { //creates print writer
            writer.println(formatter.format(msg)); //formats and writes message
            writer.flush();
            writer.close();
        }

    }

    @Override
    public void writeMessageToScreen(Message msg) {
        System.out.println(msg.getMsg());
    }
}
