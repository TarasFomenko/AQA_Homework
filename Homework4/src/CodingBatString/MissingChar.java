package CodingBatString;

public class MissingChar {
    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }
}
