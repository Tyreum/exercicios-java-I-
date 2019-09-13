
package JavaExDupla;
import javax.swing.*; 


public class JavaEx01 {

   
    public static void main(String[] args) {
        
        String aux = null; 
        double salario = 0; 
        double percentual = 0; 
        double liquido = 0;
        double aumento = 0;
        
        aux = JOptionPane.showInputDialog(null,"digite seu salário");
        salario = Double.parseDouble(aux); 
        
        
        
        aux = JOptionPane.showInputDialog(null,"digite seu percentual de aumento"); 
        aumento = Double.parseDouble(aux);
        
        percentual = aumento / 100; 
        liquido = salario * percentual; 
       
        aumento = salario + liquido;
        
       
        
        
        JOptionPane.showMessageDialog (null, "O valor do aumento é:" + liquido);
        
        JOptionPane.showMessageDialog (null, "Seu novo salário é:" + aumento); 
        
        
        
    }
    
}
