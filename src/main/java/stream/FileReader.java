package stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public StringBuilder readFile(String filename) throws FileNotFoundException {
        StringBuilder contents = new StringBuilder();
        FileInputStream reader =new FileInputStream(filename);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(reader);
        try(bufferedInputStream) {
          /*  byte[] buffer = new byte[reader.available()];
            reader.read(buffer);
            contents = new String(buffer);*/
          //another method to do the same thing
           /* byte[] buffer = new byte[8];
            while (reader.read(buffer ) > 0)
            {
                contents.append(new String(buffer));
            }*/
           byte[] buffer = new byte[8];
           while (bufferedInputStream.read(buffer)>0)
           {
               contents.append(new String(buffer));
           }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return contents;
    }
}
