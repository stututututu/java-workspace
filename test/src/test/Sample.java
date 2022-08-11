package test;

public class Sample {
   static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        int c = sum(a, b);
        System.out.println(c);
    }
}