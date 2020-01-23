import java.util.Random;
class Main {

    public static void main(String ... args) {
        float balancedQty = 0, disBalancedQty = 0;
        for (int i = 0; i < 20; i ++) {
            MyTreeMap<Integer, String> myTreeMap = new MyTreeMap<Integer, String>();
            Random rand = new Random();
            do {
                int ni = rand.nextInt(201) - 101;
                if (myTreeMap.contains(ni)) continue;
                myTreeMap.put(ni, "newString");
            }
            while (myTreeMap.getLevel() < 6);

            // Задание 2
            balancedQty += myTreeMap.isBalanced() ? 1 : 0;
            disBalancedQty += myTreeMap.isBalanced() ? 0 : 1;
        }

        // Задание 2
        System.out.printf("Несбалансированными являются $1%.3f процентов деревьев %n", (disBalancedQty / (balancedQty + disBalancedQty)) / 100f);

    }

}
