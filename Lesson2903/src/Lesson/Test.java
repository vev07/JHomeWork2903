package Lesson;

import Lesson.A.ClassA;
import Lesson.B.ClassC;
import Lesson.B.ClassD;

public class Test {
    public static void main(String[] args) {
        ClassA  classA = new ClassA();
        ClassD classD = new ClassD();
        ClassC classC = new ClassC();


        classD.out();
        classC.out();

    }
    public static void print(int x) {
        System.out.println("you print only one fild " + x);
    }
}
