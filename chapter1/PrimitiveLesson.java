package chapter1;

public class PrimitiveLesson{
    public static void main (String[]args){
        int i = 123456;
        System.out.println(i);
        System.out.println("Integer Max value: " + Integer.MAX_VALUE);
        System.out.println("Integer Min value: " + Integer.MIN_VALUE);
        byte b = 127;
        short s = 32767;
        long l = 1234;
        double d = 123.456;
        float f = 123.456f;
        System.out.println(f + ", " + d + ", " + l + ", " + s + ", " + b);
        char c = 'a';
        System.out.println("Character: " + c);
        boolean bool = true;
        System.out.println("Boolean: " + bool);   
    }
}