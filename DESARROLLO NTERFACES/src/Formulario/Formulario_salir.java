package Formulario;

import java.awt.event.*;
import javax.swing.*;

public class Formulario_salir extends JFrame implements ActionListener {

    JButton boton1;

    /* Declara el objeto boton1 de la clase JButton(boton)*/
    public Formulario_salir() {
        boton1 = new JButton();/*Crea el objeto boton1 */
        /*Mostrar el boton*/
        boton1.setBounds(270, 220, 100, 30);
        boton1.setText("Finalizar");
        add(boton1);
        /*Añadir evento al boton*/
        boton1.addActionListener(this);/*This: Almacena la dirección de memoria donde se almacena el objeto
        de la clase Frame. Mediante esta dirección llama al método actionPerformed*/
    }

    public void actionPerformed(ActionEvent e) {
        /*Método actionPerformed de la interface ActionListener*/
        if (e.getSource() == boton1) {
            /*evento: Si click en boton1*/
 /*etiqueta1.setText("Saliendo de la aplicación*/
            System.exit(0);
            /*Método exit de la clase System: Finaliza el proyecto*/
        }
    }

    public static void main(String[] args) {
        Formulario_salir formulario1 = new Formulario_salir();
        formulario1.setLayout(null);

        formulario1.setBounds(50, 10, 400, 300);
        formulario1.setResizable(false);
        formulario1.setTitle("Título del formulario");
        formulario1.setVisible(true);
    }
}
