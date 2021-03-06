package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args) {
        HashSet<Integer> res = createSet();
        removeAllNumbersMoreThan10(res);
    }

    public static HashSet<Integer> createSet()
    {

        //напишите тут ваш код
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            hashSet.add(random.nextInt());
            System.out.println(random.nextInt());
        }
        return hashSet;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            //если значение больше 10, то удаляем и переходим к следующему
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        System.out.println();
        for (Integer v : set) {
            System.out.println(v);
        }
        return set;
    }
}
