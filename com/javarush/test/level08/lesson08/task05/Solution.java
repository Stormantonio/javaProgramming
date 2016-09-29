package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
    Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String , String>();
        map.put("Chernenko", "Anton");
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Sidorov", "Evgeniy");
        map.put("Kovalenko", "Oleg");
        map.put("Kovalenko1", "Ihor");
        map.put("Kovalyov", "Andriy");
        map.put("Ignatov", "Alexander");
        map.put("Family", "Oleg");
        map.put("Jwgjo", "John");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        ArrayList<String> values = new ArrayList<String>(map.values());
        for(String a: values){
            int count = 0;
            for(int i =0; i < values.size(); i++){
                if(a.equals(values.get(i))){
                    count++;
                }
                if(count>1){
                    removeItemFromMapByValue(map,a);
                }
            }

        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
}
