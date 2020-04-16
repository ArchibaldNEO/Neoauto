package ru.stqa.pft.sandbox;

public class MP {
    public static void main(String[] args) {

        Square s = new Square(5);
        //s.l = 5;
        System.out.println(s.l + " " + s.area());



        Rectangle r = new Rectangle(4,6);
        //r.a =4;
        //r.b =6;
        System.out.println(r.a + " " + r.b + " " + r.area());

    }
}

