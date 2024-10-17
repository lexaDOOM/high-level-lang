package edu.penzgtu;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IPv6 {
    // IPv6 pattern
    private static final String IPv6_PATTERN = "^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

    public static boolean isIPv6Adress(String ipAdress) {
        if (ipAdress == null) {
            return false;
        }


        Pattern pattern = Pattern.compile(IPv6_PATTERN);
        Matcher matcher = pattern.matcher(ipAdress);
        return matcher.matches();
    }
}
