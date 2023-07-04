public class ExemploVariavel {
    
    public static void main (String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; superou o valor 32767
        // int i1 = -10000000000; muito grande

        int i2 = 40000;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000050055000L;

        // float f1 = 4.5; falta o f, sem o f é um double

        float f2 = 10.68F;

        // usual colocar o F e o L em maiúsculo

        double d1 = 85.69;
        double d2 = 99.04D;

        char c1 = 'W';
        //char c2 = 'Tw'; não aceita 2 caracteres
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se se et t 3661%45445*45454";

        //String dt1 = "09/02/1984"; não é o tipo adequado para a data

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);


    }

}
