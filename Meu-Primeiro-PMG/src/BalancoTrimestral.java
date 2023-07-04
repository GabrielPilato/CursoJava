import javax.swing.JOptionPane;

public class BalancoTrimestral {
    
    public static void main (String[] args) {
        int despesasJaneiro = 11000;
        int despesasFevereiro = 22000;
        int despesasMarco = 15000;

        int despesasTrimestre = despesasJaneiro + despesasFevereiro + despesasMarco;

        double mediaPorPmes = (double)despesasTrimestre/3;

        JOptionPane.showMessageDialog(null, "Despesa Trimestral: R$" + despesasTrimestre +
                                            "\nMedia por Mes: R$" + mediaPorPmes);

                                        
    }
}

