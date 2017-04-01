package simuladorcircuito;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Boton extends JButton implements ActionListener {
    
    //Construcor
    public Boton( int x, int y, int ancho, int alto) {
        configurarBotones(x, y, ancho, alto);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.yellow);
    }

    private void configurarBotones(int x, int y, int ancho, int alto) {
        setBounds(x, y, ancho, alto);
        addActionListener(this);
    }
}


