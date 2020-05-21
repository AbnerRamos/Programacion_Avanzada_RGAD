/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_5_Campos_texto_manejo_clases_animadas;
// Fig. 11.10: PruebaCampoTexto.java
// Prueba de CampoTextoMarco.
import javax.swing.JFrame;

public class PruebaCampoTexto
{
    public static void main( String args[] )
    {
        CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        campoTextoMarco.setSize( 350, 100 ); // establece el tamaño del marco
        campoTextoMarco.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaCampoTexto