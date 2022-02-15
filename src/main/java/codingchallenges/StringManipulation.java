package codingchallenges;

public class StringManipulation {

    public static void stringManipulation() {
        System.out.println(reverse("word"));
        System.out.println(reverseUsingCharArray("bird"));
        System.out.println(reverseUsingRecursion("birdeyy"));
    }

    /**
     * Reverse string using string builder.
     *
     * @param word
     * @return
     */
    public static String reverse(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);
        return stringBuilder.reverse().toString();
    }

    /**
     * Reverse string using character array.
     *
     * @param word
     * @return
     */
    public static String reverseUsingCharArray(String word) {
        char[] chars = word.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        return reversed.toString();
    }

    /**
     * Reverse string using character array.
     *
     * @param word
     * @return
     */
    public static String reverseUsingRecursion(String word) {
        if (word.length() <= 1) {
            return word;
        }
        return word.charAt(word.length() - 1) + reverseUsingRecursion(word.substring(0, word.length() - 1));
    }
}
