package Formulario;

import javax.swing.*;
import java.awt.event.*;

public class Formulario_contraseña extends JFrame implements ActionListener {

    //variables
    JPasswordField campoClave;
    JButton boton1;

    //constructor
    public Formulario_contraseña() {
        
        //clave
        campoClave = new JPasswordField();
        campoClave.setBounds(60, 10, 200, 30);
        add(campoClave);
        
        //boton
        boton1 = new JButton();
        boton1.setBounds(270, 220, 100, 30);
        boton1.setText("Finalizar");
        add(boton1);
        boton1.addActionListener(this);

    }

    //metodo del boton que comprueba que pongamos Alba
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
           
            //comprueba tanto en mayus como minus
            if ("Alba".equalsIgnoreCase(campoClave.getText())) {
                setTitle("Clave correcta");
            } else {
                setTitle("Clave incorrecta");
            }
        }
    }

    //main donde declaramos la ventana
    public static void main(String[] args) {
        Formulario_contraseña formulario1 = new Formulario_contraseña();
        formulario1.setLayout(null);
        formulario1.setBounds(50, 10, 400, 300);
        formulario1.setResizable(false);
        formulario1.setTitle("Título del formulario");
        formulario1.setVisible(true);
    }
}
