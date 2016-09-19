package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n>0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int j = 1; j < n; j++) {
                int number = Integer.parseInt(reader.readLine());
                if (maximum<number){
                    maximum=number;
                }
            }
            System.out.println(maximum);
        } else System.out.println("Err");
    }
}
