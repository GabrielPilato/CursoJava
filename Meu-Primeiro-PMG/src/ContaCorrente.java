public class ContaCorrente {
    
    public static void main(String[] args){
        String banco = "Santander";
        String titular = "Gabriel";
        double saldoInicial = 1500;
        double retirada = 1400;

        if (titular != "" && banco != "")
        {
            System.out.println("Titular e Banco são verdadeiros!");
        }
        else
        {
            System.out.println("Titular ou o Banco não sou verdadeiros!");
        }

        if (retirada > saldoInicial)
        {
            System.out.println("Saldo insuficiente para realizar a retirada");
        }
        else
        {
            System.out.println("Retirada realizada com sucesso,\nSaldo Final: " + (saldoInicial - retirada));

        }
    }
}
