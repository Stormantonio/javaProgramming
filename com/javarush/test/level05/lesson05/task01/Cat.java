package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat
{
    String name;
    int age, weight, strength;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setVeight(int veight){
        this.weight = veight;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }

}
