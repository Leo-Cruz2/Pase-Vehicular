/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aiudita;

/**
 *
 * @author LEONARDO
 */
class PaseVehicular extends PlumaAutomatica implements Boton {
    private SistemaLed sistemaLed;

    public PaseVehicular() {
        sistemaLed = new SistemaLed();
    }

    @Override
    public boolean leerBoton() {
        // Simulación de botón
        return Math.random() > 0.5;
    }

    public void procesarBoton() {
        if (leerBoton()) {
            moverPluma(E_num.ARRIBA);
        } else {
            moverPluma(E_num.ABAJO);
        }
    }
}

