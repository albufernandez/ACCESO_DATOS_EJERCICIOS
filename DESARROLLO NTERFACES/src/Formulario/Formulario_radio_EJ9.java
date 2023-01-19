package Formulario;

import javax.swing.*;
import java.awt.event.*;

public class Formulario_radio_EJ9 extends JFrame implements ActionListener {

    JTextField campoTextoN1 = new JTextField();
    JLabel e1 = new JLabel();
    JTextField campoTextoR = new JTextField();
    JButton boton1 = new JButton();
    JButton boton2 = new JButton();
    ImageIcon circulo = new ImageIcon("../AreaCirculo/src/areacirculo/circulo.jpg");
    JLabel etiqueta = new JLabel(circulo);

    /*La imagen del circulo la mete en una etiqueta*/
    public Formulario_radio_EJ9() {
        e1.setBounds(10, 10, 300, 30);
        e1.setText("AREA DEL CIRCULO");
        add(e1);
        campoTextoN1.setBounds(250, 20, 30, 30);
        add(campoTextoN1);
        campoTextoR.setBounds(250, 200, 100, 30);
        add(campoTextoR);
        boton1.setBounds(250, 100, 100, 30);
        boton1.setText("calcular");
        add(boton1);
        boton1.addActionListener(this);
        boton2.setBounds(10, 200, 100, 30);
        boton2.setText("salir");
        add(boton2);
        boton2.addActionListener(this);
        etiqueta.setBounds(10, 50, 50, 50);
        add(etiqueta);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            float n1, area;
            n1 = Integer.parseInt(campoTextoN1.getText());
            area = n1 * n1 * 3.14f;
            campoTextoR.setText(String.valueOf(area));
        }
        if (e.getSource() == boton2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Formulario_radio_EJ9 areaCirculo1 = new Formulario_radio_EJ9();
        areaCirculo1.setLayout(null);
        areaCirculo1.setBounds(50, 100, 400, 300);
        areaCirculo1.setResizable(false);
        areaCirculo1.setVisible(true);
    }
}
