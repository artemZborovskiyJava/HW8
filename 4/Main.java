package com.javahw;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    /*
	        4*) Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
            Пароль состоит из 8 символов
            В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
            Пароль обязательно должен содержать Большие, маленькие буквы и цифры
	    */

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + ") " + createPassword());
        }
    }

    private static String createPassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i = 1; i <= 8; i++) {
            int type = random.nextInt(3);
            if(type == 0) {
                password.append(random.nextInt(10));
            } else if(type == 1) {
                char letter = letters.charAt(random.nextInt(letters.length()));
                password.append(letter);
            } else {
                password.append("_");
            }
        }
        return password.toString();
    }
}