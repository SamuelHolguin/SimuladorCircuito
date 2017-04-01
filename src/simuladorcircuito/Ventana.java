package simuladorcircuito;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author samuelfelipe
 */
public class Ventana extends JFrame {

    //Atributos
    JButton boton1, boton2, boton3, boton4, boton5, boton6, botones[][];
    JPanel panel1, panel2;

    //Constructor
    public Ventana() {
        insertarImagenes();
        configurarPaneles();
        establecerMedidasBotonesP();
        this.setBounds(150, 60, 1100, 620);
        this.setTitle("Simulador de Circuito");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel1);
        this.add(panel2);
        crearMatriz();

    }

    //Metodos
    private void establecerMedidasBotonesP() {
        boton1.setBounds(10, 10, 120, 120);
        boton2.setBounds(150, 10, 120, 120);
        boton3.setBounds(10, 150, 120, 120);
        boton4.setBounds(150, 150, 120, 120);
        boton5.setBounds(10, 300, 120, 120);
        boton6.setBounds(150, 300, 120, 120);
    }

    private void configurarPaneles() {
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setSize(300, 580);
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);
        panel1.add(boton4);
        panel1.add(boton5);
        panel1.add(boton6);
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setSize(10, 20);
        panel2.setLocation(450, 0);
        panel2.setBounds(450, 400, 10, 10);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //panel2.setBackground(Color.red);
    }
  
    

    private void insertarImagenes(){
        boton1 = new JButton(new ImageIcon("imagenes/And.jpg"));
        boton2 = new JButton(new ImageIcon("imagenes/Or.png"));
        boton3 = new JButton(new ImageIcon("imagenes/Not.png"));
        boton4 = new JButton(new ImageIcon("imagenes/Xor.jpg"));
        boton5 = new JButton(new ImageIcon("imagenes/Bombillo.jpg"));
        boton6 = new JButton(new ImageIcon("imagenes/Pila.jpg"));
    }

    private void crearMatriz() {
        int filas = 2;
        int columnas = 2;
        botones = new JButton[filas][columnas];
        //Boton b = new Boton(int x, int y, int ancho, int alto);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                botones[filas][columnas] = new Boton(2*columnas, 2*filas, 120, 120);
                panel2.add(botones[filas][columnas]);
               
            }
        }

    }
}
