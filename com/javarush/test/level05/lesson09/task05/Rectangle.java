package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle{
    private String filename = null;
    public Rectangle(String left, String top, String width, String height){
        this.filename = left + top + width + height;
    }
    public Rectangle(String left, String top){
        int width = 0, height = 0;
        this.filename = left + top + width + height;
    }
    public Rectangle(String left, String top, String width){
        String height = width;
        this.filename = left + top + width + height;
    }
    public Rectangle(Rectangle file,String left, String top, String width, String height){
        this.filename = getFolder() + left + top + width + height;
    }
    public String getFolder(){
        return filename;
    }
}