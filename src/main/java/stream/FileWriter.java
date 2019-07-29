package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class FileWriter
{
    public void writeFile(String fileName,String data) throws FileNotFoundException {
        FileOutputStream writer = new FileOutputStream(fileName);
        try(writer) {
            writer.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception Occured: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
