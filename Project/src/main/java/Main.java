import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String ... args) {
        //Excercise 9 - homework
        File inputFile = new File ("INPUT.TXT");
        File outputFile = new File ("OUTPUT.TXT");
        try {
            if (!outputFile.exists()) outputFile.createNewFile();
        }
        catch (IOException ioe) { 
            ioe.printStackTrace();
        };
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        int maxValue, minValue;
        try {
            Scanner fileSc = new Scanner(inputFile);
            int len = Integer.parseInt(fileSc.next());

            while (fileSc.hasNext()) {
                numbersList.add(Integer.parseInt(fileSc.next()));
            }
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        catch (IOException ioe ) {
            ioe.printStackTrace();
        }
        maxValue = minValue = numbersList.get(0);
        for (int n : numbersList) {
            minValue = minValue < n ? n : minValue;
            maxValue = maxValue > n ? n : maxValue;
        }

        HomeworkSumPositive homeworkSumPositive = (z) -> {
            int result = 0;
            for (int n : z) {
                result += n > 0 ? n : 0;
            }
            return result;
        };

        final int minPosition = numbersList.indexOf(minValue) < numbersList.indexOf(maxValue) ? 
                numbersList.indexOf(minValue) : numbersList.indexOf(maxValue);
        final int maxPosition = numbersList.indexOf(minValue) > numbersList.indexOf(maxValue) ?
                numbersList.indexOf(maxValue) : numbersList.indexOf(minValue);
        
        HomeworkMultiply homeworkMultiply = (x,y,z) -> {
            int result = 1;
            x++;
            while (x < y) {
                result *= z.get(x++);
            }
            return result;
        };

        try {
            FileWriter output = new FileWriter(outputFile);
            int sum = homeworkSumPositive.sumPositive(numbersList);
            int multiply = homeworkMultiply.multiply(minPosition, maxPosition, numbersList);
            output.write(new Integer(sum).toString());
            output.write(" ");
            output.append(new Integer(multiply).toString());
            output.close();
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

    };

}
