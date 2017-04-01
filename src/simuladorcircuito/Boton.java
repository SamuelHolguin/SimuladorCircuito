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
    
    private void prueba() {
        System.out.println("está linea se agrego porque esta en verde");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.red);
    }

    private void configurarBotones(int x, int y, int ancho, int alto) {
        setBounds(x, y, ancho, alto);
        addActionListener(this);
    }
}


