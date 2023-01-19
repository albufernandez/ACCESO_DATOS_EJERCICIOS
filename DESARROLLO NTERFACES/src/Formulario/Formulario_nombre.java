package Formulario;

import javax.swing.*;
import java.awt.event.*;

public class Formulario_nombre extends JFrame implements ActionListener {

    JLabel etiqueta1;/* Declara el objeto etiqueta1 de la clase JLabel(etiqueta) */
    JTextField campoTexto1;/* Declara el objeto campoTexto1 de la clase JTextField(campo de texto) */
    JButton boton1;/* Declara el objeto boton1 de la clase JButton(boton)*/
    public Formulario_nombre() {

        etiqueta1 = new JLabel();/*Crea el objeto etiqueta1*/
        campoTexto1 = new JTextField();//Crea el objeto campoTexto1 caja de texto
        boton1 = new JButton();/*Crea el objeto boton1 */
        etiqueta1.setBounds(10, 10, 100, 30);
        etiqueta1.setText("Nombre:");
        add(etiqueta1);
        campoTexto1.setBounds(60, 10, 200, 30);
        campoTexto1.setText("");
        add(campoTexto1);
        boton1.setBounds(100, 200, 200, 30);
        boton1.setText("Aceptar");
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            setTitle(campoTexto1.getText());
            /*Pasa al título del formulario el contenido de la caja de texto*/
            /* campoTexto1.setText(“Se ha pulsado el botón”);*/
        }
    }

    public static void main(String[] args) {
        Formulario_nombre formulario1 = new Formulario_nombre();
        formulario1.setLayout(null);
        formulario1.setBounds(50, 10, 400, 300);
        formulario1.setResizable(false);
        formulario1.setTitle("Título del formulario");
        formulario1.setVisible(true);
    }
}
