package JavaExDupla;

import javax.swing.*;

public class JavaEx13 {

    public static void main(String[] args) {
        int idades[] = new int[20];
        int velhos[] = new int[20];
        int num = 0;
        try {

            for (int i = 0; i < 20; i++) {
                String aux = JOptionPane.showInputDialog(null, "Digite a idade de uma pessoa");
                idades[i] = Integer.parseInt(aux);
                if (idades[i] >= 18) {
                    num++;
                }
            }
            JOptionPane.showMessageDialog(null, "As pessoas maiores de idade tem: \n"+ num);
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
    }
}


