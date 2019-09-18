package JavaExDupla;

import javax.swing.*;

public class JavaEx04 {

    public static void main(String[] args) {
        double num = 1, soma = 0;
        while (num > 0) {
            try {
                String aux = JOptionPane.showInputDialog(null, "digite números para serem somados *a operação será encerrada após digitar um número negativo");
                num = Double.parseDouble(aux);
                soma += num;
               
            }
        
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
            
            catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
        }
        soma = (num * -1)+ soma;
        JOptionPane.showMessageDialog(null, "O resultado dos valores somados é: " + soma);
    }
}
