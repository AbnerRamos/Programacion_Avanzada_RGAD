/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_4;

/**
 *
 * @author Abdara01
 */
import javax.swing.JFrame;
public class Main 
{
    public static void main (String args [] )
    {
        mario marcoEtiqueta = new mario(); // crea objeto mario
        marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoEtiqueta.setSize( 350, 700 ); // establece el tamaño del marco
        marcoEtiqueta.setVisible( true ); // muestra el marco
    }
}