package b19_StringAndRegex.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_REGEX =   "^[\\d]{2}+-+0+[\\d]{9}$";

    public PhoneNumber() {
        pattern = Pattern.compile(NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
