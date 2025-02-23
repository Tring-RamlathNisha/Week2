import java.io.*;

public class FileException{
    public static void main(String args[]){
        try {
            File file=new File("C:/Tasks/OOPs/Exception Handling/file.txt");
            FileReader fr=new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}