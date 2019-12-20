import java.util.*;

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
        testNumberC.set(n, (char)((Integer.parseInt(testNumberC.get(n).toString()) + 1) % 10) );
        return getBullAndCows(secondNumberC)[0] < bullsQty ? true : false;
    }

    static boolean isThisNumberCow (int n, ArrayList<Character> secondNumberC, int cowsQty) {
        if (n > secondNumberC.size()) return false;
        ArrayList<Character> testNumberC = secondNumberC;
        testNumberC.set(n, (char)((Integer.parseInt(testNumberC.get(n).toString()) + 1) % 10) );
        return getBullAndCows(secondNumberC)[1] < cowsQty ? true : false;
    }

    public static void main (String ... args) {
        int firstNumber, secondNumber;
        int cows = 0, bulls = 0;
        int[] getBullAndCows;
        ArrayList<Character> secondNumberC;

        HashMap <Integer, Character> bullsHM = new HashMap<>();
        HashMap <Integer, Character> cowsHM = new HashMap<>();
        ArrayList<Integer> unknownPosition = new ArrayList<>();
        ArrayList<Character> testNumberC, resultNumberC = new ArrayList<>(4);

        Random rand = new Random();
        do {
            firstNumber = rand.nextInt(8999) + 1000;
            secondNumber = rand.nextInt(8999) + 1000;
            firstNumberC = new ArrayList<>(4);
            secondNumberC = new ArrayList<>(4);

            for (int i = 0 ; i < 4; i++) {
                firstNumberC.add(Integer.toString(firstNumber).toCharArray()[i]);
                secondNumberC.add(Integer.toString(secondNumber).toCharArray()[i]);
            }
        }
        while (getBullAndCows (secondNumberC)[0] == 0 | getBullAndCows (secondNumberC)[1] == 0);

        getBullAndCows = getBullAndCows (secondNumberC);
        bulls = getBullAndCows[0];
        cows = getBullAndCows[1];

        for (int i = 0 ; i < 4; i++) {
            unknownPosition.add(i);
            resultNumberC.add('-');
        }
        Iterator<Integer> unknownIterator = unknownPosition.iterator();

        while (bullsHM.size() < bulls) {
            while (unknownIterator.hasNext()) {
                System.out.println('.');
                testNumberC = new ArrayList<>(secondNumberC);
                int n = unknownIterator.next();

                char c = (char) ((Integer.parseInt(testNumberC.get(n).toString()) + 1) % 10 + 48);
                testNumberC.set(n, c);
                if (getBullAndCows(testNumberC)[0] > bulls) {
                    bullsHM.put(n, testNumberC.get(n));
                } else if (getBullAndCows(testNumberC)[0] < bulls) {
                    bullsHM.put(n, secondNumberC.get(n));
                    unknownPosition.remove(new Integer(n));
                }
            }
            unknownIterator = unknownPosition.iterator();
        }

        for (Map.Entry<Integer, Character> es : bullsHM.entrySet()) {
            resultNumberC.set(es.getKey(), es.getValue());
        }

        for (char c : firstNumberC) {
            System.out.print(c);
        }
        System.out.println();

        for (char c : secondNumberC) {
            System.out.print(c);
        }
        System.out.println();

        for (char c : resultNumberC) {
            System.out.print(c);
        }
        System.out.println();
    }
}
