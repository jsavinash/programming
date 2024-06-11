package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
    void regexCheck() {
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println(b);

        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b2);
        System.out.println(b3);

    }

    public static void main(String[] args) {
        JavaRegex jr = new JavaRegex();
        jr.regexCheck();
    }
}
