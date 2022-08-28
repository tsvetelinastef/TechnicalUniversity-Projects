import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usernames {


    private Pattern pattern;
    private Matcher matcher;
    // declare a string pattern for username.
    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";

    public Usernames() {
        pattern = Pattern.compile(USERNAME_PATTERN);
    }
    public boolean Usernames(final String username){
        matcher = pattern.matcher(username);
        return matcher.matches();
    }


}

// -----------------------------------------------------------------------------
/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator {
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN =
      "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
     + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public MailValidator(){
        pattern = Pattern.compile(EMAIL_PATTERN);

    }
    public boolean validateMail(final String checkedMail) {
        matcher = pattern.matcher(checkedMail);
        return  matcher.matches();
    }
}

 */