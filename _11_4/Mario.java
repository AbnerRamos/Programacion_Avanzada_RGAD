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
import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las características básicas de una ventana
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon; // carga las imágenes

public class mario extends JFrame
{
    private JLabel etiqueta1; 
    private JLabel etiqueta2; 
    private JLabel etiqueta3; 
    
    public mario()
{
        super( "Personajes" );
        setLayout( new FlowLayout() ); 

        // Constructor de JLabel con un argumento String
        etiqueta1 = new JLabel( "Personajes de Mario Bros" );
        etiqueta1.setToolTipText( "Esta es etiqueta1" );
        add( etiqueta1 ); // agrega etiqueta1 a JFrame

        // Constructor de JLabel con argumentos de cadena, Icono y alineación
        Icon Personaje1 = new ImageIcon( getClass().getResource( "mario.gif" ) );
        etiqueta2 = new JLabel();
        etiqueta2.setText( "Mario" );
        etiqueta2.setIcon( Personaje1 ); // agrega icono a JLabel
        etiqueta2.setHorizontalTextPosition( SwingConstants.CENTER );
        etiqueta2.setVerticalTextPosition( SwingConstants.BOTTOM );
        etiqueta2.setToolTipText( "Esta es etiqueta2" );
        add( etiqueta2 ); // agrega etiqueta2 a JFrame

        Icon Personaje2 = new ImageIcon( getClass().getResource( "luigi.gif" ) );
        etiqueta3 = new JLabel(); // Constructor de JLabel sin argumentos
        etiqueta3.setText( "Luigi" );
        etiqueta3.setIcon( Personaje2 ); // agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition( SwingConstants.CENTER );
        etiqueta3.setVerticalTextPosition( SwingConstants.BOTTOM );
        etiqueta3.setToolTipText( "Esta es etiqueta3" );
        add( etiqueta3 ); // agrega etiqueta3 a JFrame
    } // fin del constructor de 
} // fin de la clase mario

