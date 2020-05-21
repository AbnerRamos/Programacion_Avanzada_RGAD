/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_5;
import javax.swing.JFrame;
/**
 *
 * @author Abdara01
 */
public class Main 
{
    public static void main( String args[] )
    {
        Cuadro campoTextoMarco = new Cuadro();
        campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        campoTextoMarco.setSize( 350, 100 ); // establece el tamaño del marco
        campoTextoMarco.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaCampoTexto