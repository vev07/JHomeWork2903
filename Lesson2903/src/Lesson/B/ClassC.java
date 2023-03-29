package Lesson.B;

import Lesson.A.ClassA;

public class ClassC extends ClassA {
    public void out() {
        ClassA obj = new ClassA();
        System.out.println("protect " + super.c); //if you use word super you can get to field protect
        System.out.println("public " + obj.d);
    }

}
