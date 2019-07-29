package stream.dataStreams;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ConsoleReader {
    public static void main(String[] args) {
    writeToConsole("Hello!");
    writeToConsole("OutputFile.txt",34);
    }

    public static void writeToConsole(String filename, String data){
        OutputStream writer = new BufferedOutputStream(System.out);
        DataOutputStream dataOutputStream= new DataOutputStream(writer);
        try(writer){
            //writer.write(data.getBytes());
            dataOutputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
