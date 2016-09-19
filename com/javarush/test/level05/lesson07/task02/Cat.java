package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    private String filename = null;

    public void initialize(String name) {
        int weight = 3, age = 5;
        this.filename = name + weight + age;
    }

    public void initialize(String name, int weight, int age) {
        this.filename = name + weight + age;
    }

    public void initialize(String name, int age) {
        int weight = 2;
        this.filename = name + age + weight;
    }
    public void initialize(int weight, String color){
        int age = 4;
        this.filename = weight + color + age;
    }
    public void initialize(int weight, String color, String address){
        int age = 6;
        this.filename = weight + color + address + age;
    }
}