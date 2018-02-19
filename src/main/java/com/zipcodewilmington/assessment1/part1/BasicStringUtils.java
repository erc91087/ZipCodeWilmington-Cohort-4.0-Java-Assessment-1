package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] words = str.split(" ");
        String firstWord = words[0];
        String capLetter = firstWord.substring(0, 1).toUpperCase();
        String restOfSentence = str.substring(1);
        String completeSentence = capLetter + restOfSentence;

        return completeSentence;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();
        return reverseString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();

        String[] words = reverseString.split(" ");
        String firstWord = words[0];
        String capLetter = firstWord.substring(0, 1).toUpperCase();
        String restOfSentence = reverseString.substring(1);
        String completeSentence = capLetter + restOfSentence;


        return completeSentence;


    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String[] words = str.split(" ");

        String firstLetterRemoved = str.substring(1, str.length() - 1);

        return firstLetterRemoved;

    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] characters = str.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (Character.isUpperCase(characters[i])) {
                characters[i] = Character.toLowerCase(characters[i]);
            } else if (Character.isLowerCase(characters[i])) {
                characters[i] = Character.toUpperCase(characters[i]);
            }
        }
        str = new String(characters);
        return str;
    }
}
