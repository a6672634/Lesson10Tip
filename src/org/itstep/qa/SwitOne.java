package org.itstep.qa;

public class SwitOne {
    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 1: {
                System.out.println("Была введена 1");
                break;
            }
            case 2: {
                System.out.println("Была введена 2");
                break;
            }
            case 3: {
                System.out.println("Была введена 3");
                break;
            }
            default:{
                System.out.println("Совпадение" + "не найдено");
            }
        }
        System.out.println("-------------------");

        String str = "Май";
        switch (str) {
            case "Январь": {
               }
            case "Февраль": {
                }
            case "Декабрь": {
                System.out.println("Зимний месяц");
                break;
            }
            case "Март": {
                }
            case "Апрель": {
                }
            case "Май": {
                System.out.println("Весенний месяц");
                break;
            }
            default:{
                System.out.println("Совпадение" + "не найдено");
            }
        }

    }
}