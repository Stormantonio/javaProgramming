package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();
        String sNum3 = reader.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        int nNum2 = Integer.parseInt(sNum2);
        int nNum3 = Integer.parseInt(sNum3);

        if ((nNum1>nNum2)&&(nNum2>nNum3)||(nNum3>nNum2)&&(nNum2>nNum1)){
            System.out.println(nNum2);
        }
        if ((nNum1>nNum3)&&(nNum3>nNum2)||(nNum2>nNum3)&&(nNum3>nNum1)){
            System.out.println(nNum3);
        }
        if ((nNum2>nNum1)&&(nNum1>nNum3)||(nNum3>nNum1)&&(nNum1>nNum2)){
            System.out.println(nNum1);
        }
    }
}
