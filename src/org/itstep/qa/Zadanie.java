package org.itstep.qa;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        // Пользователь вводит название месяца (все слово в нижнем регистре) Вывести количество дней этого месяца.
        //Февраль всегда равен
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
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
