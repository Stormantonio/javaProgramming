package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        // var 1:
        /*int deep = 0;
        for (StackTraceElement element : stackTraceElements) {
            deep++;
        }
        System.out.println(deep);
        return deep;*/

        // var 2:
        /*int deep = stackTraceElements.length;
        System.out.println(deep);
        return deep;*/

        //var 3:
        return Thread.currentThread().getStackTrace().length;
    }

    public static void main(String[] args) {

        // var 1, 2:
        //getStackTraceDeep();

        // var 3:
        System.out.println(getStackTraceDeep());
    }
}
