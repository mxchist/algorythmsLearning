import java.util.Random;
class Main {

    public static void main(String ... args) {
        MyTreeMap<Integer, String> myTreeMap = new MyTreeMap<Integer, String>();
        Random rand = new Random();
        do {
            int ni = rand.nextInt(201) - 101;
            if (myTreeMap.contains(ni)) continue;
            myTreeMap.put(ni, "newString");
        }
        while (myTreeMap.getLevel() < 6);
        System.out.println(myTreeMap.getLevel());
    }
}
