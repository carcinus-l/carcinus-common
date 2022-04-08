package carcinus.code.common.utils;

public class StringUtils {

    public static boolean isBlank(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean noBlank(String str) {
        return !isBlank(str);
    }


}
