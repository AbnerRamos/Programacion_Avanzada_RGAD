/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_4_texto_e_imagenes;
// Fig. 11.7: PruebaLabel.java
// Prueba de LabelFrame.
import javax.swing.JFrame;

public class PruebaLabel
{
    public static void main( String args[] )
    {
        LabelFrame marcoEtiqueta = new LabelFrame(); // crea objeto LabelFrame
        marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoEtiqueta.setSize( 350, 600 ); // establece el tamaño del marco
        marcoEtiqueta.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaLabel
