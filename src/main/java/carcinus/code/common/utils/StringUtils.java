package carcinus.code.common.utils;

public class StringUtils {

    public static boolean isBlank(String arg) {
        return arg == null || arg.length() == 0;
    }

    public static boolean noBlank(String arg) {
        return !isBlank(arg);
    }

    public static boolean isBlanks(String... args) {

        for (String arg : args) {
            if (noBlank(arg)) {
                return false;
            }
        }
        return true;
    }
    public static boolean noBlanks(String... args) {

        for (String arg : args) {
            if (isBlank(arg)) {
                return false;
            }
        }
        return true;
    }
}
