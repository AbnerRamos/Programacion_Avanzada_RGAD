/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_13_manejo_eventos_raton;
// Fig. 11.29: MarcoRastreadorRaton.java
// Prueba de MarcoRastreadorRaton.
import javax.swing.JFrame;

public class RastreadorRaton
{
    public static void main( String args[] )
    {
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
        marcoRastreadorRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoRastreadorRaton.setSize( 300, 100 ); // establece el tamaño del marco
        marcoRastreadorRaton.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase RastreadorRaton