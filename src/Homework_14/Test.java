package Homework_14;

import java.util.Scanner;

public class Test {

    public static int length(String s) {
        return s.length();
    }

    public static char charAtIndex(String s, int a) {
        return s.charAt(a);
    }

    public static boolean checkChar(String s, char c) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    public static int countVowel(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String s) {
        StringBuilder retS = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            retS.append(s.charAt(i));
        }
        return retS.toString();

    }

    public static String palindrome(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) ==  (s.charAt(s.length()-1-i)))) {
                return "is not a Palindrome";
            }
        }
        return "xxx";
    }

    public static String binaryString(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {
            if (!(s.charAt(i) == '1' || (s.charAt(i) == '0'))) {
                return " \\\"" + s + "\\\" is NOT a binary string";
            }
        }
        return " \\\"" + s + "\\\" is  a binary string";
    }

    public static String bin2Dec(String s) {

        int dec = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                dec += Math.pow(2, s.length() - 1 - i);
            } else if (s.charAt(i) == '0') {

            } else {
                return "error: invalid binary string \\\"" + s + "\\\"";
            }
        }
        return "Enter a Binary string: \\\"" + s + "\\\" is " + dec;
    }

    public static int countsDuplicateChar() {
        int retCount = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                retCount++;
            }
            count = 0;
        }
        return retCount;
    }

    public static char firstNonRepeatedChar(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                return s.charAt(i);
            }
            count = 0;
        }
        return ' ';
    }

    public static int countsCertainChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = "abef";
        String str1 = new String("aaaaaa");

        //    System.out.println(length(str));

        //   System.out.println(charAtIndex(str,5));

        //   System.out.println(checkChar(str,'a'));

        //   System.out.println(reverseString(str));

        //   countVowelsDigits();

        //   System.out.println(countsDuplicateChar());

//        System.out.println("Enter a String:");
//        String s = scanner.nextLine();
        //    char c = 'a';

        //   System.out.println(countsCertainChar(s, c));

        //   System.out.println(firstNonRepeatedChar(s));

        //   System.out.println(palindrome("moom"));

        //   System.out.println(bin2Dec("1110"));

        //   System.out.println(binaryString("1112"));


    }
}