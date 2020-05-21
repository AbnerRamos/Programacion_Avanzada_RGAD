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
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Botonesmario extends JFrame
{
    private JButton juegodemario; // botón con texto solamente
    private JButton juegodeluigi; // botón con iconos

    // MarcoBoton agrega objetos JButton a JFrame
    public Botonesmario()
    {
        super( "Prueba de botones" );
        setLayout( new FlowLayout() ); // establece el esquema del marco

        Icon personaje1 = new ImageIcon( getClass().getResource( "mario.gif" ) );
        Icon juego1 = new ImageIcon( getClass().getResource( "juegomario.gif" ) );
        juegodemario = new JButton( "Juego de Mario", personaje1 ); // establece la imagen
        juegodemario.setRolloverIcon( juego1 ); // establece la imagen de sustitución
        add( juegodemario ); // agrega botonJButtonElegante a JFrame

        Icon personaje2 = new ImageIcon( getClass().getResource( "luigi.gif" ) );
        Icon juego2 = new ImageIcon( getClass().getResource( "juegoluigi.gif" ) );
        juegodeluigi = new JButton( "Juego de Luigi", personaje2 ); // establece la imagen
        juegodeluigi.setRolloverIcon( juego2 ); // establece la imagen de sustitución
        add( juegodeluigi ); // agrega botonJButtonElegante a JFrame

        // crea nuevo ManejadorBoton para manejar los eventos de botón
        ManejadorBoton manejador = new ManejadorBoton();
        juegodeluigi.addActionListener( manejador );
        juegodemario.addActionListener( manejador );
    } // fin del constructor de MarcoBoton

    // clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener
    {
        // maneja evento de botón
        public void actionPerformed( ActionEvent evento )
        {
            JOptionPane.showMessageDialog( Botonesmario.this, String.format(
            "Usted oprimio: %s", evento.getActionCommand() ) );
        } // fin del método actionPerformed
    } // fin de la clase interna privada ManejadorBoton
} // fin de la clase MarcoBoton