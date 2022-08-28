package Upr_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateName {
    public static boolean validateName(String name){
        String regex = "[a-z0-9_-]{3,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean flag = false;
        if(matcher.find()){
            flag = true;
        }
        return flag;
    }
}
