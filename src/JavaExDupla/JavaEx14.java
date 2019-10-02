package JavaExDupla;

import javax.swing.*;

public class JavaEx14 {

    public static void main(String[] args) {
        String nominho = "", nomex = "";
        int idade = 0, menor = 9999999;
        try {
            
            for (int i = 0; i < 10; i++) {
                
                String aux = JOptionPane.showInputDialog(null, "Digite seu nome");
                nominho = aux;
                
                aux = JOptionPane.showInputDialog(null, "Digite sua idade");
                idade = Integer.parseInt(aux);
                
                if(menor > idade){
                    menor = idade;
                    nomex = nominho;
                }
            }
                
            JOptionPane.showMessageDialog(null, "A pessoa com a idade mais nova tem: "+ nomex);
    
        }
         catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");

        }

    }
}
