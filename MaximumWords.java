
public class MaximumWords {

    //using split : slower for larger inputs bcs of regex
    // public int mostWordsFound(String sentences[]) {
    //     int words = 0;
    //     for (String sentence : sentences) {
    //         String s[] = sentence.split(" ");
    //         words = Math.max(count, s.length);
    //     }
    //     return words;
    // }

    //optimal
    public int mostWordsFound(String sentences[]) {
        int maxLen = 0;
        for (String sentence : sentences) {
            int words = 1;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    words++;
                }
                maxLen = Math.max(maxLen, words);
            }
        }
        return maxLen;
    }

    public static void main(String args[]) throws Exception {
        MaximumWords obj = new MaximumWords();
        String sentences[] = new String[3];
        StringBuilder sb = new StringBuilder();
        sentences[0] = "my name is Jack";
        sentences[1] = "I am an engineering student";
        sentences[2] = "I am learning DSA with JAVA";
        int result = obj.mostWordsFound(sentences);
        System.out.println("Result : " + result);
    }
}
