import javax.swing.JOptionPane;

public class Correntista {

    public static void main(String[] args) {
        ContaCorrente conta = new  ContaCorrente("Gabriel Pilato", 1234567, "0820", 1500);

        conta.depositar(1500);
        conta.sacar(10000);
        conta.sacar(1000);
        JOptionPane.showMessageDialog(null, "Rendimento neste mes: \nSaldo atual: R$" + conta.getSaldo() + " Redimento: R$" + conta.calcularRendimento());
        conta.sacar(-100);
        conta.depositar(-500);
    }
    
}
