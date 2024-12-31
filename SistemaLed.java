/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aiudita;

/**
 *
 * @author LEONARDO
 */
class SistemaLed implements Dispositivo {
    @Override
    public void encenderLed(String color) {
        System.out.println("LED " + color + " encendido.");
    }

    @Override
    public void apagarLed() {
        System.out.println("LED apagado.");
    }
}

