package JavaExDupla;

import javax.swing.*;

public class JavaEx08 {

    public static void main(String[] args) {
        double liquido = 0, hora = 0, aulas = 0, aliquota = 0, desconto = 0;
        try {

            String aux = JOptionPane.showInputDialog(null, "Digite o valor da sua aula (a hora)");
            hora = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Digite a quantidade de aulas que deseja dar no mês");
            aulas = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Digite o percentual de desconto do INSS");
            aliquota = Double.parseDouble(aux);
            liquido = hora * aulas;
            desconto = (liquido * aliquota) / 100;
            liquido -= desconto;
            JOptionPane.showMessageDialog(null, "O seu salário será de: R$" + liquido);

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
    }

}
