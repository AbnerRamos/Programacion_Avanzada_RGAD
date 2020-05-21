/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_9_Botones_mantienen_estado;
// Fig. 11.18: PruebaCasillaVerificacion.java
// Prueba de MarcoCasillaVerificacion.
import javax.swing.JFrame;

public class PruebaCasillaVerificacion
{
    public static void main( String args[] )
    {
        MarcoCasillaVerificacion marcoCasillaVerificacion = new MarcoCasillaVerificacion();
        marcoCasillaVerificacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoCasillaVerificacion.setSize( 350, 100 ); // establece el tamaño del marco
        marcoCasillaVerificacion.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaCasillaVerificacion