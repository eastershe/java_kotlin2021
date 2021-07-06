package com.kevin;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello!!");
        Person p = new Person();
        p.hello();
        p.goodbye();
        dataType();

    }

    private static void dataType() {
        int a = 7;
        Integer A = 7;
        short b = 8;
        Short B = 8;
        long c = 9;
        Long C = Long.valueOf(9);
        float d = 4;
        Float D = 4F;
        double e = 3;
        Double E = 3D;
        byte h = 2;
        Byte H = 2;
        char f = 'w';
        Character F = 'W';
        String g = "haha";
    }
}
