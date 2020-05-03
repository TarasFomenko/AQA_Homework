package CodingBat;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (((a > 0 && b < 0) ||(a < 0 && b > 0)) && (!negative)){
            return true;
        }
        if ((negative) && a < 0 && b < 0) {
            return true;
        }
        return false;
    }
}
