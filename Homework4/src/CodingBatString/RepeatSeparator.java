package CodingBatString;

public class RepeatSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
        String result = word;
        if (count == 0) {
            return "";
        }
        for (int i = 1; i < count; i++) {
            result = result.concat(sep).concat(word);
        }
        return result;
    }
}