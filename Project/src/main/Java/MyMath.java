public class MyMath {
    public static float GetPower (float num, int pow) {
        float result;
        if (pow > 1) {
            result =  GetPower(num, pow-1) * num;
        }
        else if (pow == 1) {
            result = num;
        }
        else {
            throw new IllegalArgumentException();
        }
        return result;
    }

    public static float GetPowerExt (float num, int pow) {
        float result;
        if (pow > 1) {
            if (pow %2 == 0) {
                result =  GetPowerExt(num, (pow/2))  * GetPowerExt(num, (pow/2));
            }
            else { result =  GetPowerExt(num, pow-1) * num; }
        }
        else if (pow == 1) {
            result = num;
        }
        else {
            throw new IllegalArgumentException();
        }
        return result;
    }

}
