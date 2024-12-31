/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aiudita;

/**
 *
 * @author LEONARDO
 */
abstract class ControlPluma {
    protected E_num estado;

    public ControlPluma() {
        this.estado = E_num.ABAJO;
    }

    public abstract void moverPluma(E_num nuevoEstado);

    public E_num getEstado() {
        return estado;
    }
}
