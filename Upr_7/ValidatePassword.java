package Upr_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidatePassword {
    public static boolean validatePass(String name){
        String regex = "[a-zA-z]{11,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean flag = false;
        if(matcher.find()){
            flag = true;
        }
        return flag;
    }
}
