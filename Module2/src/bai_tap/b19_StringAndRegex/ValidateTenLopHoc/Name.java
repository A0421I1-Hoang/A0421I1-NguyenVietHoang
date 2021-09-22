package b19_StringAndRegex.ValidateTenLopHoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_REGEX =   "^[CAP]+[\\d]{4}+[GHIKLM]$";

    public Name() {
        pattern = Pattern.compile(NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
