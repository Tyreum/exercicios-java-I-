package JavaExDupla;

import javax.swing.*;

public class JavaEx02 {

    public static void main(String[] args) {
        double bruto = 0, prestacao = 0, emprestimo = 0, porcent = 0;
        String aux = null;
        try{
        aux = JOptionPane.showInputDialog(null, "digite seu salário *bruto");
        bruto = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "digite o valor da sua prestação");
        emprestimo = Double.parseDouble(aux);

        porcent = (emprestimo * 100) / bruto;

        if (porcent <= 30) {
            JOptionPane.showMessageDialog(null, "você pode realizar o emprestimo");
        } 
        else {
            JOptionPane.showMessageDialog(null, "você não pode realizar o emprestimo");

        }
        }
        catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Inserir apenas valores numéricos");
        }
    }
}
