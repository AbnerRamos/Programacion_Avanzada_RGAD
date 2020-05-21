/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_8_JButton;
// Fig. 11.16: PruebaBoton.java
// Prueba de MarcoBoton.
import javax.swing.JFrame;

public class PruebaBoton
{
    public static void main( String args[] )
    {
        MarcoBoton marcoBoton = new MarcoBoton(); // crea MarcoBoton
        marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBoton.setSize( 300, 110 ); // establece el tamaño del marco
        marcoBoton.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaBoton