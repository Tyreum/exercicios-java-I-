
package JavaExDupla;

import javax.swing.*;
public class JavaEx15 {
    
    public static void main(String[] args) {
        int refeicao = 0, prato = 0, calorias = 0;
        String comida = "";
        try{
        
            comida = JOptionPane.showInputDialog(null, "Escolha uma das refeições da lista\n\n1 - Prato: Vegetariano, Sobremesa: Abacaxi, Bebida: Chá\n2 - Prato: Peixe, Sobremesa: Sorvete diet, Bebida: Suco de laranja\n3 - Prato: Frango, Sobremesa: Mousse diet, Bebida: Suco de melão\n 4 - Prato: Carne, Sobremesa: Mousse de chocolate, Bebida: Refrigerante diet\n\n");
            prato = Integer.parseInt(comida);
            switch(prato){
                
                case 1: comida = "Prato: Vegetariano, Sobremesa: Abacaxi, Bebida: Chá ";
                        calorias = 275;
                        JOptionPane.showMessageDialog(null, "A refeição que escolheu contém: "+ calorias +"kcal");
                        break;
                 
                case 2: comida = "Prato: Peixe, Sobremesa: Sorvete diet, Bebida: Suco de laranja";
                        calorias = 470;
                        JOptionPane.showMessageDialog(null, "A refeição que escolheu contém: "+ calorias +"kcal");
                        break;
                        
                case 3: comida = "Prato: Frango, Sobremesa: Mousse diet, Bebida: Suco de melão";
                        calorias = 520;
                        JOptionPane.showMessageDialog(null, "A refeição que escolheu contém: "+ calorias +"kcal");
                        break;
                        
                case 4: comida = "Prato: Carne, Sobremesa: Mousse de chocolate, Bebida: Refrigerante diet";
                        calorias = 615;
                        break;
            }
            JOptionPane.showMessageDialog(null, "A refeição que escolheu contém: "+ calorias +"kcal");
        }
        catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
        
    }
    
}
