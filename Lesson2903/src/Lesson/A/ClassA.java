package Lesson.A;

public class ClassA {

    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public void out() {
        System.out.println("It is private "+ a);
        System.out.println("It is default "+ b);
        System.out.println("It is protected " + c);
        System.out.println("It is public " + d);
    }
}
