package String;

import java.util.regex.Pattern;

public class RegexIpLab {
    String reg = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = reg+"."+reg+"."+reg+"."+reg;

    void check(String s){
        boolean b = Pattern.matches(pattern,s);
        System.out.println(b);
    }

}

