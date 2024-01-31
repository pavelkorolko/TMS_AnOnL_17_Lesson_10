package FirstTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {
    public static String GetTwoFirstBlocksWithNumbers(String string) throws Exception {
        if (CheckForException(string)) {
            return string.substring(0, 4) + string.substring(9, 13);
        }
        return null;
    }

    public static String GetDocumentNumber(String string) throws Exception {
        if (CheckForException(string)) {
            return string.substring(0, 5) + "***" + string.substring(8, 14) + "***" + string.substring(17);
        }
        return null;
    }

    public static String GetOnlyChars(String string) throws Exception {
        if (CheckForException(string)) {
            String temp = string.substring(5, 8) + "/" + string.substring(14, 17) + "/" + string.substring(19, 20) + "/" + string.substring(21, 22);
            return temp.toLowerCase();
        }
        return null;
    }

    public static String GetOnlyCharsWithStringBuilder(String string) throws Exception {
        if (CheckForException(string)) {
            StringBuilder str = new StringBuilder();
            str.append("Letters:");
            String temp = string.substring(5, 8) + "/" + string.substring(14, 17) + "/" + string.substring(19, 20) + "/" + string.substring(21, 22);
            str.append(temp);
            return str.toString().toUpperCase();
        }
        return null;
    }

    public static boolean CheckForSequenceOfChars(String string, String condition) throws Exception {
        if (CheckForException(string)) {
            String str1 = string.substring(5, 8).toLowerCase();
            String str2 = string.substring(14, 17).toLowerCase();
            if (str1.equals(condition.toLowerCase()) || str2.equals(condition.toLowerCase())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean CheckForStartingOfDocument(String string, String condition) throws Exception {
        if (CheckForException(string)) {
            String starting = string.substring(0, 3);
            if (starting.equals(condition)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean CheckForEndingOfDocument(String string, String condition) throws Exception {
        if (CheckForException(string)) {
            String ending = string.substring(18);
            if (ending.equals(condition)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean CheckForException(String string) throws Exception {
        Pattern pattern = Pattern.compile("\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d[a-zA-Zа-яА-Я]\\d[a-zA-Zа-яА-Я]");
        Matcher matcher = pattern.matcher(string);
        if (string.length() > 22 || string.length() < 22 || !matcher.matches()) {
            throw new Exception("Not a suitable format for string!");
        }
        return true;
    }
}
