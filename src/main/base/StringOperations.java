package main.base;

public class StringOperations {

    public static int getSummaryLength(String[] strings) {
        int sum = 0;
        for (String string : strings) {
            sum += string.length();

        }
        return sum;
    }

    public static String getFirstAndLastLetterString(String string) {

        return string.charAt(0) + string.substring(string.length() - 1);
    }

    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        return string1.charAt(index) == string2.charAt(index);
    }

    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        return string1.indexOf(character) == string2.indexOf(character);
    }

    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        return string1.lastIndexOf(character) == string2.lastIndexOf(character);
    }

    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        return string1.indexOf(str) == string2.indexOf(str);
    }

    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        return string1.lastIndexOf(str) == string2.lastIndexOf(str);
    }

    public static boolean isEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    public static boolean isLess(String string1, String string2) {
        return string1.compareTo(string2) < 0;
    }

    public static boolean isLessIgnoreCase(String string1, String string2) {
        return string1.compareToIgnoreCase(string2) < 0;
    }

    public static String concat(String string1, String string2) {
        return string1.concat(string2);
    }

    public static boolean isSamePrefix(String string1, String string2, String prefix) {
        return string1.startsWith(prefix) && string2.startsWith(prefix);
    }

    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        return string1.endsWith(suffix) && string2.endsWith(suffix);
    }

    public static String getCommonPrefix(String string1, String string2) {
        int index = 0;
        int minLength = Math.min(string1.length(), string2.length());

        while (index < minLength && string1.charAt(index) == string2.charAt(index)) {
            index++;
        }
        return string1.substring(0, index);
    }


    public static String reverse(String string) {

        return new StringBuffer(string).reverse().toString();
    }

    public static boolean isPalindrome(String string) {

        int halfLenght = string.length() / 2;

        for (int i = 0; i < halfLenght; i++) {

            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeIgnoreCase(String string) {
        return isPalindrome(string.toLowerCase());
    }

    public static String getLongestPalindromeIgnoreCase(String[] strings) {
        String result = "";
        for (String string : strings) {
            if (isPalindromeIgnoreCase(string)) {
                if (result.length() < string.length()) {
                    result = string;
                }
            }
        }
        return result;

    }

    public static boolean hasSameSubstring(String string1, String string2,
                                           int index, int length) {
        if (string1.length() - index < length || string2.length() - index < length) {
            return false;
        }

        return string1.substring(index, index + length).equals(string2.substring(index, index + length));
    }

    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1,
                                                        String string2, char replaceInStr2, char replaceByInStr2) {


        return string1.replace(replaceInStr1, replaceByInStr1)
                .equals(string2.replace(replaceInStr2, replaceByInStr2));

    }


    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1,
                                                     String string2, String replaceInStr2, String replaceByInStr2) {
        return string1.replace(replaceInStr1, replaceByInStr1)
                .equals(string2.replace(replaceInStr2, replaceByInStr2));
    }


    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
        return isPalindromeIgnoreCase(string.replace(" ", ""));
    }

    public static boolean isEqualAfterTrimming(String string1, String string2) {
        return isEqual(string1.trim(), string2.trim());
    }

    public static String makeCsvStringFromInts(int[] array) {

        return makeCsvStringBuilderFromInts(array).toString();
    }

    public static String makeCsvStringFromDoubles(double[] array) {

        return makeCsvStringBuilderFromDoubles(array).toString();
    }

    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {

        StringBuilder sb = new StringBuilder();

        if (array == null || array.length == 0) {
            return sb;
        }
        for (int value : array) {
            sb.append(value);
            sb.append(',');
        }

        sb.deleteCharAt(sb.length() - 1); //!!
        return sb;
    }

    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
        StringBuilder sb = new StringBuilder();
        if (array == null || array.length == 0) {
            return sb;
        }

        for (double value : array) {
            sb.append(String.format("%.2f,", value));

        }
        sb.deleteCharAt(sb.length() - 1);
        return sb;
    }

    public static StringBuilder removeCharacters(String string, int[] positions) {

        StringBuilder sb = new StringBuilder(string);
        for (int i = positions.length - 1; i >= 0; i--) {
            sb.delete(positions[i], positions[i] + 1);
        }
        return sb;
    }

    public static StringBuilder insertCharacters(String string, int[]
            positions, char[] characters) {

        StringBuilder sb = new StringBuilder(string);

        for (int i = positions.length - 1; i >= 0; i--) {
            sb.insert(positions[i], characters[i]);
        }
        return sb;
    }

}






