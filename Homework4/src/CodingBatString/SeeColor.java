package CodingBatString;

public class SeeColor {
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
