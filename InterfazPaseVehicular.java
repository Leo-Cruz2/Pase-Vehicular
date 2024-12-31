/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aiudita;

/**
 *
 * @author LEONARDO
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazPaseVehicular extends JFrame {
    private PaseVehicular paseVehicular;

    public InterfazPaseVehicular() {
        paseVehicular = new PaseVehicular();

        setTitle("Pase Vehicular");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JLabel lblEstado = new JLabel("Estado: " + paseVehicular.getEstado(), SwingConstants.CENTER);
        JButton btnSubir = new JButton("Subir Pluma");
        JButton btnBajar = new JButton("Bajar Pluma");

        btnSubir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paseVehicular.moverPluma(E_num.ARRIBA);
                lblEstado.setText("Estado: " + paseVehicular.getEstado());
            }
        });

        btnBajar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paseVehicular.moverPluma(E_num.ABAJO);
                lblEstado.setText("Estado: " + paseVehicular.getEstado());
            }
        });

        add(lblEstado);
        add(btnSubir);
        add(btnBajar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfazPaseVehicular();
    }
}
