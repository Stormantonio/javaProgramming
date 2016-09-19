package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private String filename = null;
    public void initialize(String left, String top, String width, String height){
        this.filename = left + top + width + height;
    }
    public void initialize(String left, String top){
        int width = 0, height = 0;
        this.filename = left + top + width + height;
    }
    public void initialize(String left, String width, String top){
        String height = width;
        this.filename = left + width + top + height;
    }
    public void initialize(Rectangle file, String left, String top, String width, String height){
        this.filename = file.getFolder() + left + top + width + height;
    }

    public String getFolder() {
        return filename;
    }
}
