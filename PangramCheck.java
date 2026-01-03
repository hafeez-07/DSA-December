
public class PangramCheck {

    public static boolean isPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            seen[sentence.charAt(i) - 'a'] = true;
        }

        for (boolean s : seen) {
            if (!s) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        boolean result = isPangram(sentence);
        System.out.println(result);
    }
}
