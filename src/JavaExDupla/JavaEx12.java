
package JavaExDupla;

import javax.swing.*;
public class JavaEx12 {
    
    public static void main(String[] args) {
        int num0=0, num1=0, num2=0;
        try{
        
            String aux = JOptionPane.showInputDialog(null, "Digite um valor");
            num1 = Integer.parseInt(aux);
            num0 = num1-1;
            num2 = num1+1;
            JOptionPane.showMessageDialog(null, num0+ " é o antecessor de "+ num1 +" que é sucessor de "+ num2);
        
        }
        catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
        
    }
    
}
