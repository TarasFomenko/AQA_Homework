package CodingBatString;

public class DoubleChar {
    public static String doubleChar(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp = temp + str.charAt(i) + str.charAt(i);
        }
        return temp;
    }
}


