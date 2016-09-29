package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, Date> hashMap = createMap();
        removeAllSummerPeople(hashMap);

        for (Map.Entry<String, Date> pair : hashMap.entrySet()) {
            System.out.println(pair.getValue());
        }
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Chernenko", new Date("OCTOBER 31 1990"));
        map.put("Romanchuk", new Date("JULY 10 1991"));
        map.put("Romanchuk1", new Date("JULY 10 1991"));
        map.put("Romanchuk2", new Date("JUNE 10 1991"));
        map.put("Romanchuk3", new Date("AUGUST 10 1991"));
        map.put("Romanchuk4", new Date("AUGUST 10 1991"));
        map.put("Romanchuk5", new Date("AUGUST 10 1991"));
        map.put("Prihodko", new Date("SEPTEMBER 30 1991"));
        map.put("Mammedov", new Date("DECEMBER 17 1988"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if (rad == 5 || rad == 6 || rad == 7) {
                iterator.remove();
            }
        }
    }
}
