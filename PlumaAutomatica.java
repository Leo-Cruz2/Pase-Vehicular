/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aiudita;

/**
 *
 * @author LEONARDO
 */
class PlumaAutomatica extends ControlPluma {
    private SistemaLed leds;

    public PlumaAutomatica() {
        this.leds = new SistemaLed();
    }
    
    public void moverPluma(E_num nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Pluma automática movida a: " + estado);
        if (estado == E_num.ARRIBA) {
            leds.encenderLed("Verde");
        } else {
            leds.encenderLed("Rojo");
        }
    }
}

