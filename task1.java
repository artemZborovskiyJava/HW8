package com.javahw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*
	         1) банк положили S денег. Какой станет сумма вклада через N лет,
	         если процент 1,5% добавляется к сумме вклада ежемесячно.
	    */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму денег -> ");
        int amountOfMoney = scanner.nextInt();
        System.out.print("Введите количество месяцев -> ");
        int years = scanner.nextInt();
        double resultMoney = amountOfMoney * Math.pow(1.015, years);
        System.out.printf("Ваша сумма денег через %s месяцев -> %s", years, Math.floor(resultMoney));
    }
}