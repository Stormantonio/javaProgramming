package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    private String filename = null;
    public Cat(String name){
        int weight = 0, age = 0;
        this.filename = name + weight + age;
    }
    public Cat(String name, String weight, String age){
        this.filename = name + weight + age;
    }
    public Cat(String name, int age){
        int weight = 8;
        this.filename = name + age + weight;
    }
    public Cat(int weight, String color){
        int age = 8;
        this.filename = weight + color + age;
    }
    public Cat(int weight, String color, String address){
        int age = 11;
        this.filename = weight + color + address + age;
    }

}