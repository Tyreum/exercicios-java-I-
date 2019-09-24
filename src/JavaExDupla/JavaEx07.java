package JavaExDupla;

import javax.swing.*;

public class JavaEx07 {

    public static void main(String[] args) {
        try {
            double valorNovo = 0, valorVelho = 0;
            String aux = "";

            aux = JOptionPane.showInputDialog(null, "Digite o valor do produto");
            valorVelho = Double.parseDouble(aux);
            valorNovo = (valorVelho * 9) / 100;
            JOptionPane.showMessageDialog(null, "Com desconto o preço do produto fica: " + valorNovo);

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
    }

}
