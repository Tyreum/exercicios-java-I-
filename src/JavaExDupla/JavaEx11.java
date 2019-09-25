package JavaExDupla;

import javax.swing.*;

public class JavaEx11 {

    public static void main(String[] args) {
        String login = "", senha = "";
        double num1 = 0, num2 = 0;
        try {
            login = JOptionPane.showInputDialog(null, "Digite o nome do seu cadastro");
            senha = JOptionPane.showInputDialog(null, "Digite a senha do seu cadastro");
            String aux = JOptionPane.showInputDialog(null, "Digite um valor que será dividido pelo próximo valor inserido");
            num1 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Digite outro valor");
            num2 = Double.parseDouble(aux);
            num1 /= num2;
            aux = JOptionPane.showInputDialog(null, "Digite a senha cadastrada");
            if (aux.equals(senha)) {

                JOptionPane.showMessageDialog(null, "O resltado da conta é: " + num1);

            } else {

                JOptionPane.showMessageDialog(null, "Senha Incorreta\n        !ERRO!");

            }

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }

    }

}
