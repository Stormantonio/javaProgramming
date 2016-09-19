package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human gFather1 = new Human("Степан", true, 70, null, null);
        Human gFather2 = new Human("Ivan", true, 73, null, null);

        Human gMother1 = new Human("Odarka", false, 68, null, null);
        Human gMother2 = new Human("Glara", false, 65, null, null);

        Human father = new Human("Anatoliy", true, 45, gFather1, gMother1);
        Human mother = new Human("Irina", false, 40, gFather2, gMother2);

        Human kid1 = new Human("Eva", false, 7, father, mother);
        Human kid2 = new Human("Yann", true, 8, father, mother);
        Human kid3 = new Human("Anjey", true, 5, father, mother);

        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println();
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println();
        System.out.println(father);
        System.out.println(mother);
        System.out.println();
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        //напишите тут ваш код
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
