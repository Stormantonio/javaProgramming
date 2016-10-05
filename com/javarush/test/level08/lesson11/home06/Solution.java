package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> children1 = new ArrayList<Human>();
        Human child1 = new Human("Ihor", true, 10, new ArrayList<Human>());
        Human child2 = new Human("Ira", false, 7, new ArrayList<Human>());
        Human child3 = new Human("Ivan", true, 8, new ArrayList<Human>());

        children1.add(child1);
        children1.add(child2);
        children1.add(child1);

        Human father = new Human("Oleh", true, 30, children1);
        Human mother = new Human("Inna", false, 25, children1);

        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(father);
        ArrayList<Human> children3 = new ArrayList<Human>();
        children3.add(mother);

        Human gMother1 = new Human("Alina", false, 57, children2);
        Human gFather1 = new Human("Andriy", true, 62, children2);

        Human gMother2 = new Human("Vira", false, 54, children3);
        Human gFather2= new Human("Vova", true, 60, children3);

        System.out.println(gFather1);
        System.out.println(gFather2);
        System.out.println(gMother1);
        System.out.println(gMother2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
