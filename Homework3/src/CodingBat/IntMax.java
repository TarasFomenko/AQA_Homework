package CodingBat;

public class IntMax {
    public int intMax(int a, int b, int c) {
        if (a > b && a > c){
            return a;
        }
        if(b > c && b > a){
            return b;
        }
        else {
            return c;
        }
    }
}
