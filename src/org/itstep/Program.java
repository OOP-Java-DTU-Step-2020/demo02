package org.itstep;

public class Program {
    public static void main(String[] args) {
        // byte(8 бит), short, int, long
        // float, double
        // char
        // boolean

        // Преобразовании типов: явное, неявное
        byte b;
        // 9 + 1 -> 10
        b = 127;
        System.out.println("b = " + b);
        System.out.println(Byte.MIN_VALUE + ".." + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + ".." + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + ".." + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + ".." + Long.MAX_VALUE);

        byte c = b; // нет преобразования

        short s = c; // неявное преобразование

        b = (byte)s; // явное преобразование типов

        s = 0b1111_1111;
        System.out.println("s = " + s);
        b = (byte)s;
        System.out.println("b = " + b);

        long l = 4_000_000_000L;

        float f = 10.6f; // точность до 7 знака после .
        double d = 10.6; // точность до 15 знака после .

        l = (long)f;
        System.out.println("l = " + l);

        l = l / 3;
        System.out.println("l = " + l);

        // Константы
        final double PI = 3.14;

        double r = 1;

        //PI = 3;

        double area = PI * r * r;

        System.out.println("area = " + area);

        // Классы обертки
        String str = "10";
        int i = Integer.parseInt(str);
        System.out.println("i = " + i);
        b = Byte.parseByte(str);
        System.out.println("b = " + b);
        str = "1111";
        b = Byte.parseByte(str, 2);
        System.out.println("b = " + b);

        // Операции: арифметические

        // Операции бывают унарные и бинарные
        // Бинарная: 2 + 2
        // где:
        //      2 - операнды
        //      + - оператор
        // Унарная: -2

        // Арифметические операции: +, -, *, /, %
        //                         Инкремент ++, Декремент --,
        //                          +=, -=, *=, /=, %=
        int a = 10;
        int n = 20;
        i = a + n;
        System.out.println("i = " + i);
        i += n; //i = i + n;
        System.out.println("i = " + i);

        i = 0;
        System.out.println("i = " + i);
        i++;//i += 1;
        System.out.println("i = " + i);
        i--;
        System.out.println("i = " + i);

        // Префиксная (++i, --i) , постфиксная формы (i++, i--)
        System.out.println("i++ = " + i++);
        System.out.println("i = " + i);
        System.out.println("--i = " + --i);
        System.out.println("i = " + i);

        s = 234;
        int m = s / 60;
        s = (short)(s - m * 60);//(short)(s % 60);
        System.out.println(m + ":" + s);
        System.out.println(m * 60 + s);
        // 15 % 4 = 15 - 3*4 = 3

    }
}
