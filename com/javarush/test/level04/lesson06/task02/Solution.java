package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_a = reader.readLine();
        int a = Integer.parseInt(s_a);
        String s_b = reader.readLine();
        int b = Integer.parseInt(s_b);
        String s_c = reader.readLine();
        int c = Integer.parseInt(s_c);
        String s_d = reader.readLine();
        int d = Integer.parseInt(s_d);

        if ((a > b) && (a > c) && (a > d))
        {
            System.out.println(a);
        } else if ((b > c) && (b > d))
        {
            System.out.println(b);
        } else if (c > d)
        {
            System.out.println(c);
        } else
        {
            System.out.println(d);
        }
    }
}
