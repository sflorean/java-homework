public class homework1 {
    public static void main(String[] args) {
        //5
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

        //6
        int x = 3;
        int y = 6;
        System.out.println(++x);
        System.out.println(++x + y);
        System.out.println(x - y);
        System.out.println(x == y);

        //7
        int a = 3;
        int b = 6;
        if (b > a) {
            System.out.println(b + "is larger than" + a);
        } else if (a > b) {
            System.out.println(a + "is larger than" + b);
        } else {
            System.out.println(a + "is equal to" + b);
        }


        //8
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.floor(Math.random() * 100 + 1));
            if (n[i] % 2 == 0)
                System.out.println("Even numbers are " + n[i]);
        }
    }

}
