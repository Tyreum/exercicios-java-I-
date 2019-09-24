package JavaExDupla;

import javax.swing.*;

public class JavaEx09 {

    public static void main(String[] args) {
        double volume=0, raio=0, altura=0;
        try {

            String aux = JOptionPane.showInputDialog(null, "Digite o raio da lata");
            raio = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Digite a altura da lata");
            altura = Double.parseDouble(aux);
            volume = 3.14159*raio*raio*altura;
            JOptionPane.showMessageDialog(null, "O volume da lata de óleo é: "+ volume);
            

        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
    }

}
