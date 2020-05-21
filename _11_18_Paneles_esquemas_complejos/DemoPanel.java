/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_18_Paneles_esquemas_complejos;
// Fig. 11.46: DemoPanel.java
// Prueba de MarcoPanel.
import javax.swing.JFrame;

public class DemoPanel extends JFrame
{
    public static void main( String args[] )
    {
        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoPanel.setSize( 450, 200 ); // establece el tamaño del marco
        marcoPanel.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase DemoPanel