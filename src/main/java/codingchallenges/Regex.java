package codingchallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void regex() {
        System.out.println(regexCompiled("123"));
        System.out.println(regexCompiled("abc"));
        System.out.println(regexCompiled("-ab2"));

        System.out.println(regexNotCompiled("abc@gmail.com"));
        System.out.println(regexNotCompiled("ab c@gmail.com"));
        System.out.println(regexNotCompiled("abc123@xyz.org"));
    }

    public static boolean regexCompiled(String word) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }

    public static boolean regexNotCompiled(String word) {
        return Pattern.matches("\\w+@\\w+.\\w+", word);
    }
}
