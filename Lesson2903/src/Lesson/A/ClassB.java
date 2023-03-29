package Lesson.A;

public class ClassB {

    public void out() {
        ClassA obj = new ClassA();
        System.out.println("Доступ к переменным из другого класса, но в том же пакете:");

        System.out.println("default: " + obj.b);
        System.out.println("protected: " + obj.c);
        System.out.println("public: " + obj.d);
    }


}
