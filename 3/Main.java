package com.javahw;

public class Main {

    public static void main(String[] args) {
	    /*
	        3*) Написать метод.
            Входящий параметр: Строка со словами разделенными пробелом которые состоят из больших и маленьких букв.
            Метод должен вернуть ту же строку в которой первая буква в каждом слове большая, а остальные маленькие
	    */

        System.out.println("HeLLO WORLD my NAMe Is aRtEM");
        System.out.println(formatString("HeLLO WORLD my NAMe Is aRtEM"));
    }

    private static String formatString(String string) {
        StringBuilder formattedString = new StringBuilder();
        for(String word : string.split(" ")) {
            String lowerCaseWord = word.toLowerCase();
            String firstLetterUC = Character.toString(lowerCaseWord.charAt(0)).toUpperCase();
            String result = firstLetterUC.concat(lowerCaseWord.substring(1));
            formattedString.append(result).append(" ");
        }
        return formattedString.toString();
    }
}
