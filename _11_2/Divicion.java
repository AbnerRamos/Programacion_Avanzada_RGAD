/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_2;

/**
 *
 * @author Abdara01
 */
import javax.swing.JOptionPane;
public class divicion 
{
    public static void main( String args[] )
    {
        // obtiene la entrada del usuario de los diálogos de entrada de JOptionPane
        String numerador = JOptionPane.showInputDialog( "Introduzca el numerador" );
        String divisor =JOptionPane.showInputDialog( "Introduzca el divisor" );

        // convierte las entradas String en valores int para usarlos en un cálculo
        float numero1 = Integer.parseInt( numerador );
        float numero2 = Integer.parseInt( divisor );

        float divicion= numero1 / numero2; // suma números

        // muestra los resultados en un diálogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog( null, "La divicion es " + divicion,
        "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );
    } // fin del método main
}
