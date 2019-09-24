package JavaExDupla;

import javax.swing.*;

public class JavaEx10 {

    public static void main(String[] args) {
        double combustivel=0;
        try {
            
             String aux = JOptionPane.showInputDialog(null, "Digite em quanto realizou a viagem");
             double tempo = Double.parseDouble(aux);
             aux = JOptionPane.showInputDialog(null, "Digite a velocidade em que dirigiu");
             double velo = Double.parseDouble(aux);
             double distancia = tempo*velo;
             combustivel = distancia/12;
             JOptionPane.showMessageDialog(null, "você gastou: "+ combustivel +"L de combustível");
            
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }

    }
}
