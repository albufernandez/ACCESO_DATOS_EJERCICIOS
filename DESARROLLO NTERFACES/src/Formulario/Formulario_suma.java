package Formulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Formulario_suma extends JFrame implements ActionListener{

    JTextField campoTextoN1;
    JTextField campoTextoN2;
    JTextField campoTextoR;
    JButton boton1;

    public Formulario_suma() {
        campoTextoN1 = new JTextField();
        campoTextoN2 = new JTextField();
        campoTextoR = new JTextField();
        
        campoTextoN1.setBounds(60, 10, 200, 30);
        campoTextoN1.setText("5");
        add(campoTextoN1);
        
        campoTextoN2.setBounds(60, 60, 200, 30);
        campoTextoN2.setText("5");
        add(campoTextoN2);
        
        campoTextoR.setBounds(60, 110, 200, 30);
        campoTextoR.setText("");
        add(campoTextoR);
        
        boton1 = new JButton();/*Crea el objeto boton1 */
        boton1.setBounds(270, 220, 100, 30);
        boton1.setText("Sumar");
        add(boton1);
        
        boton1.addActionListener(this);
      
    }
    
         public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
            int suma;
            suma = Integer.valueOf(campoTextoN1.getText()) + Integer.valueOf(campoTextoN2.getText());
            campoTextoR.setText(String.valueOf(suma)); 
        }
    }

    public static void main(String[] args) {
        Formulario_suma formulario1 = new Formulario_suma();
        formulario1.setLayout(null);
        formulario1.setBounds(50, 10, 400, 300);
        formulario1.setResizable(false);
        formulario1.setTitle("Título del formulario");
        formulario1.setVisible(true);
    }


}
