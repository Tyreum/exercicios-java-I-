package JavaExDupla;

import javax.swing.*;

public class JavaEx03 {

    public static void main(String[] args) {
        double perimetro = 0, raio = 0;
        try {
            String aux = JOptionPane.showInputDialog(null, "Digite o tamanho do raio");
            raio = Double.parseDouble(aux);
            
            perimetro = 2 * Math.PI *raio;
            
            JOptionPane.showMessageDialog(null, "O tamnho do perímtro do círculo é: " + perimetro);
            
        } 
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Favor Inserir apenas apenas valores numéricos");
        }
    }
}
