package Animals;
/*
    1) Создать класс Animal c полями: age, weight, name, id реализовать автогенерацию id, добавить метод(процедуру) для
    вывода полей объекта


    3)* Создать общий класс родитель для этих классов и вынести его в отдельный пакет - задача создать библиотеку для других
    программистов.
     */

public class Animal {
    String name;
    int age;
    double width;
    int id;
    static int index = 1;

    public Animal(String name, int age, double width) {
        this.name = name;
        this.age = age;
        this.width = width;
        id = index;
        index++;
    }
    public void print() {
        System.out.println("Name - " + name + ", age - " + age + ", width - " + width + ", id - " + id + ".");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Wolf",2,39.7);
        Animal animal2 = new Animal("Cat", 3,8.65);
        Animal animal3 = new Animal("Bird", 1,0.112);
        animal1.print();
        animal2.print();
        animal3.print();
    }

}
