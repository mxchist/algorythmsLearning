import java.lang.System;
import java.util.Random;

public class Main {
    public static void main (String ... args) {
        for (int i = 0; i < 32; i++) {
            int y = new Random().nextInt(24) + 97;
            System.out.print((char)y);
        }
    }
}
