package org.itstep.qa;

import java.util.Scanner;

public class Zadanie2 {
    // Пользователь вводит некую дату. Отобразить у каких месяцев данная дата встречается.
    // Реализовать с наименее возможным колвом проверок.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        switch (str) {
            case 30 : {
                System.out.println("январь");
                System.out.println("март");
                System.out.println("май");
                System.out.println("июнь");
                System.out.println("август");
                System.out.println("октябрь");
                System.out.println("декабрь");
                break;
            }
            case 31: {
                System.out.println("апрель");
                System.out.println("июль");
                System.out.println("сентябрь");
                System.out.println("ноябрь");
                break;
            }
            case 28: {
                System.out.println("январь");
                System.out.println("март");
                System.out.println("май");
                System.out.println("июнь");
                System.out.println("август");
                System.out.println("октябрь");
                System.out.println("декабрь");
                System.out.println("апрель");
                System.out.println("июль");
                System.out.println("сентябрь");
                System.out.println("ноябрь");
                System.out.println("февраль");

                break;
            }
            case 29: {
                System.out.println("январь");
                System.out.println("март");
                System.out.println("май");
                System.out.println("июнь");
                System.out.println("август");
                System.out.println("октябрь");
                System.out.println("декабрь");
                System.out.println("апрель");
                System.out.println("июль");
                System.out.println("сентябрь");
                System.out.println("ноябрь");
                System.out.println("февраль");

                break;
            }
            default:{
                System.out.println("январь");
                System.out.println("март");
                System.out.println("май");
                System.out.println("июнь");
                System.out.println("август");
                System.out.println("октябрь");
                System.out.println("декабрь");
                System.out.println("апрель");
                System.out.println("июль");
                System.out.println("сентябрь");
                System.out.println("ноябрь");
                System.out.println("февраль");
            }
        }
    }
}
