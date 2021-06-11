import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Valiate {
    private static Pattern pattern;
    private Matcher matcher;
private static final String ID= "^\\d{8}";
private static final String NAME= "^[\\s|a-zA-Z]+[\\s|a-zA-Z]$";
private static final String NAME2= "^[a-zA-Z]$";
    public boolean validateId(String regex) {
        pattern = Pattern.compile(ID);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validateName(String regex) {
        pattern = Pattern.compile(NAME);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validateName2(String regex) {
        pattern = Pattern.compile(NAME2);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
