/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_11_Jlist;
// Fig. 11.24: PruebaLista.java
// Selección de colores de un objeto JList.
import javax.swing.JFrame;

public class PruebaLista
{
    public static void main( String args[] )
    {
        MarcoLista marcoLista = new MarcoLista(); // crea objeto MarcoLista
        marcoLista.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoLista.setSize( 350, 150 ); // establece el tamaño del marco
        marcoLista.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaLista