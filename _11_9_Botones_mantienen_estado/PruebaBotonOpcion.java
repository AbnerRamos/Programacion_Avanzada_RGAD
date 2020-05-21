/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_9_Botones_mantienen_estado;
// Fig. 11.20: PruebaBotonOpcion.java
// Prueba de MarcoBotonOpcion.
import javax.swing.JFrame;

public class PruebaBotonOpcion
{
    public static void main( String args[] )
    {
        MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
        marcoBotonOpcion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBotonOpcion.setSize( 350, 100 ); // establece el tamaño del marco
        marcoBotonOpcion.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaBotonOpcion