package ie.gmit.exercise;

import java.io.IOException;

public interface PrintFile {
    void writeMessageToFile(Message msg, String filename) throws IOException;
    void writeMessageToScreen(Message msg);
}
