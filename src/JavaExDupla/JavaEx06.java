package JavaExDupla;

import java.time.temporal.ChronoUnit;
import java.time.Month;
import javax.swing.*;
import java.time.LocalDate;

public class JavaEx06 {
    public static void main(String[] args) {
        try{
            
        /* Data Do aniversário */
        String aux = JOptionPane.showInputDialog(null, "Insira o ano do seu aniversário");
        int data1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog(null, "Insira o mês do seu aniversário");
        int data12 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog(null, "Insira o dia do seu aniversário");
        int data13 = Integer.parseInt(aux);
        LocalDate dataAntes = LocalDate.of(data1, Month.of(data12), data13);
        
        /* Data Atual */
        aux = JOptionPane.showInputDialog(null, "Insira o ano atual");
        int data2 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog(null, "Insira o mês atual");
        int data22 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog(null, "Insira o dia atual");
        int data23 = Integer.parseInt(aux);
        LocalDate dataDepois = LocalDate.of(data2, Month.of(data22), data23);
        
        /* Calculo de dias */
        long numDiasEntre = ChronoUnit.DAYS.between(dataAntes, dataDepois);
        
        /* Cálculo de meses */
        long numMesesEntre = ChronoUnit.MONTHS.between(dataAntes, dataDepois);
        
        /* Cálculo de anos */
        long numAnosEntre = ChronoUnit.YEARS.between(dataAntes, dataDepois);
        
        /* Cálculo de Semanas*/
        long numSemanasEntre = ChronoUnit.WEEKS.between(dataAntes, dataDepois);
        JOptionPane.showMessageDialog(null, "Anos: "+ numAnosEntre +"\nMeses: "+ numMesesEntre +"\nSemanas: "+ numSemanasEntre +"\nDias: "+ numDiasEntre);
        } 
        
        catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "inserir apenas valores numéricos");
        }
    
    }
}
