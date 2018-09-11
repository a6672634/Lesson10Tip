package org.itstep.qa;

import java.util.Scanner;

public class Zadanie2 {
    // Пользователь вводит некую дату. Отобразить у каких месяцев данная дата встречается.
    // Реализовать с наименее возможным колвом проверок.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        switch (str) {
            case "январь" : {

            }
            case "март" : {

            }
            case "май" : {

            }
            case "июнь" : {

            }
            case "август" : {

            }
            case "октябрь" : {

            }

            case "декабрь" : {
                System.out.println("30 дней");
                break;
            }
            case "апрель": {
            }
            case "июль": {

            }
            case "сентябрь" : {

            }
            case "ноябрь" : {
                System.out.println("31 день");
                break;
            }
            default:{
                System.out.println("28");
            }
        }
    }
}
