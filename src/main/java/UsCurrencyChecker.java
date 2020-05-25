import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        final String regex = "$(''|' ')[0-9].[0-9][0-9]";
        final String checkString = usCurrencyString;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(checkString);

        matcher.find();
        matcher.group();


        return matcher;
    }
}
