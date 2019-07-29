package stream;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) throws FileNotFoundException {
        WriteIntoFile();
        FileReader fileReader = new FileReader();
        StringBuilder str= fileReader.readFile("DataFile.txt");
        System.out.println(str);
    }

    private static void WriteIntoFile() {
        FileWriter myFileWriter = new FileWriter();
        String data = "Hello ! How are you doing today ??";
        try {
            myFileWriter.writeFile("DataFile.txt",data);
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid name.");
            e.printStackTrace();
        }
    }
}
