public class Conversoes {

    public static void main (String[] args){
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; //downcast = resultado - 24, perda de informação

        long l1;
        int i1 = 10;
        l1 = i1; // = 10

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; // = -148664554

        int i3;
        long l3 = 10000l;
        i3 = (int) l3; //downcast sem perda, porque 10000 cabe no inteiro

        double d1;
        float f1 = 10.5f;
        d1 = f1; //upcast

        float f2;
        float f3;
        double d2 = 10000.58d; //downcast cabe dentro do float

        f2 = (float) d2;
        double d3 = 100000.5888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888;
        // houve perda de informação
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

            System.out.println(b1);
            System.out.println(l1);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(f3);
            System.out.println(i4);
            System.out.println(f2);

            b1 = (byte) d3; //somente armazenou o numero 16

            System.out.println(b1);
        
    }
    
}
