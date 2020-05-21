/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_8;
/**
 *
 * @author Abdara01
 */
import javax.swing.JFrame;

public class Main
{
    public static void main( String args[] )
    {
        Botonesmario marcoBoton = new Botonesmario(); // crea MarcoBoton
        marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBoton.setSize( 900, 400 ); // establece el tamaño del marco
        marcoBoton.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaBoton