package com.company;

public class Main {

    public static void main(String[] args) {
        //Exercitiul 5
        boolean z = false;
        char w = 'e';
        int c = 7;
        long d = 12345678L;
        double e = 123.43555;
        //Non primitive: String, Integer;

        System.out.println("Boolean :" + z); //sugestie sa modific a cu false
        System.out.println("Character :" + w);
        System.out.println("Integer :" + c);
        System.out.println("Long :" + d);
        System.out.println("Double :" + e);

        //Exercitiul 6
        int x = 3;
        int y = 6;
        System.out.println(++x);
        System.out.println(++x + y);
        System.out.println(x - y);
        System.out.println(x == y);

        //Exercitiul 7a
        int a = 3;
        int b = 6;
        if (b > a) {
            System.out.println(b +"is larger than"+ a);
        } else if (a > b ){
            System.out.println(a + "is larger than"+ b);
        } else if (b == b){
            System.out.println(b +"is equal to"+ b);
        }

        //Exercitiul 7b
        if (b < a) {
            System.out.println(a +"is larger than"+ b);
        } else {
            System.out.println(b +"is larger than"+ a);
        }
        if (b > a) {
            System.out.println(b +"is larger than"+ a);
        } else {
            System.out.println(a +"is larger than"+ b);
        }
        if (b == b) {
            System.out.println(b +"is equal to"+ b);
        } else {
            System.out.println("This will never be true!");
        }

        //Exercitiul 8
        int[] intArray = new int[]{1, 2, 3, 4, 55, 6, 77, 8, 99, 10};
        System.out.print("Even Numbers are: ");
        for (int a8 = 0; a8 <= 10; a8++) {
            if (a8 % 2 == 0) {
                System.out.print(a8 + " ");
            }
        }

    }
}
