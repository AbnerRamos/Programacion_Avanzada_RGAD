/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_16_Manejo_eventos_teclas;
// Fig. 11.37: DemoTeclas.java
// Prueba de MarcoDemoTeclas.
import javax.swing.JFrame;

public class DemoTeclas
{
    public static void main( String args[] )
    {
        MarcoDemoTeclas marcoDemoTeclas = new MarcoDemoTeclas();
        marcoDemoTeclas.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoDemoTeclas.setSize( 350, 100 ); // establece el tamaño del marco
        marcoDemoTeclas.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase DemoTeclas