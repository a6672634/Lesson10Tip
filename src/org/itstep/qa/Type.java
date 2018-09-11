package org.itstep.qa;

public class Type {
    public static void main(String[] args) {
        int a = 1;
        long b = 3;
        double c =1.1d;
        float e = 3.4f;
        char ch = 'q';

        b = a;
        c = b;

        a = (int) b;
        b = (long) c;

        a = ch;
        System.out.println(a);
        boolean bb = true;

        System.out.println("----------");
        String str = "111";
        int r = 0;
        r = Integer.parseInt(str);
        a = 678;

        System.out.println(r);

        str = String.valueOf(r);
        str = Integer.toString(a);
    }
}
