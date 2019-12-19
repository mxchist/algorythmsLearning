import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Math;

public class BullsAndCows {
    static ArrayList <Character> firstNumberC;
    static int[] getBullAndCows ( ArrayList <Character> secondNumberC ){
        int cows = 0, bulls = 0;

        for (int i = 0 ; i < 3; i++) {
            bulls += firstNumberC.get(i) == secondNumberC.get(i) ? 1 : 0;
        }
        for (int i = 0 ; i < 3; i++) {
            for (int j = 0 ; j < 3; j++) {
                cows  += i != j && firstNumberC.get(i) == secondNumberC.get(j) ? 1 : 0;
            }
        }
        int[] getBullAndCows =  {bulls,cows};
        return getBullAndCows;
    }

    static boolean isThisNumberBool (int n, ArrayList <Character> secondNumberC, int bullsQty) {
        if (n > secondNumberC.size()) return false;
        ArrayList<Character> testNumberC = secondNumberC;
        testNumberC.set(n, (char)(Integer.parseInt(testNumberC.get(n).toString()) + 1 % 10) );
        return getBullAndCows(secondNumberC)[0] < bullsQty ? true : false;
    }

    static boolean isThisNumberCow (int n, ArrayList<Character> secondNumberC, int cowsQty) {
        if (n > secondNumberC.size()) return false;
        ArrayList<Character> testNumberC = secondNumberC;
        testNumberC.set(n, (char)(Integer.parseInt(testNumberC.get(n).toString()) + 1 % 10) );
        return getBullAndCows(secondNumberC)[1] < cowsQty ? true : false;
    }

    public static void main (String ... args) {
        int firstNumber, secondNumber;
        int cows = 0, bulls = 0;
        int[] getBullAndCows;
        ArrayList<Character> secondNumberC = new ArrayList<>();

        HashMap <Integer, Character> bullsHM = new HashMap<>();
        HashMap <Integer, Character> cowsHM = new HashMap<>();
        ArrayList<Integer> unknownPosition = new ArrayList<>();
        ArrayList<Character> testNumberC;

        Random rand = new Random();
        do {
            firstNumber = rand.nextInt();
        }
        while (firstNumber < 1000 | firstNumber > 9999);
        do {
            secondNumber = rand.nextInt();
        }
        while (secondNumber < 1000 | secondNumber > 9999);

        for (int i = 0 ; i < 3; i++) {
            firstNumberC.set(i, Integer.toString(firstNumber).toCharArray()[i]);
            secondNumberC.set(i, Integer.toString(secondNumber).toCharArray()[i]);
            unknownPosition.add(i);
        }

        getBullAndCows = getBullAndCows (secondNumberC);
        bulls = getBullAndCows[0];
        cows = getBullAndCows[1];

        testNumberC = secondNumberC;

        for (int n : unknownPosition) {
            testNumberC.set(n, (char)(Integer.parseInt(testNumberC.get(n).toString()) + 1 % 10) );
            if (getBullAndCows(testNumberC)[0] > bulls) {
                bullsHM.put(n, testNumberC.get(n));
            }
            else if (getBullAndCows(testNumberC)[0] < bulls) {
                bullsHM.put(n, secondNumberC.get(n));
                unknownPosition.remove(new Integer(n));
            }
        }

        for

    }
}
