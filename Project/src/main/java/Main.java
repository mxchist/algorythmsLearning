import java.io.*;

public class Main {

    public static void main (String ... args) {
        File inputFile = new File ("INPUT.TXT");
        try {
            if (!inputFile.exists()) inputFile.createNewFile();
        }
        catch (IOException ioe ) {
            ioe.printStackTrace();
        }
        try {
            FileReader input = new FileReader("INPUT.TXT");
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}