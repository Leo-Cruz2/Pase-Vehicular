/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aiudita;

/**
 *
 * @author LEONARDO
 */
interface Dispositivo {
    void encenderLed(String color);
    void apagarLed();
}

interface Boton {
    boolean leerBoton();
}
