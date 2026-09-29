/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerconstructores;

/**
 *
 * @author estuam
 */

public class Envios {

    public static void main(String[] args) {

        Paquete p1 = new Paquete("P-001", "Manizales", 3.0, true);
        Paquete p2 = new Paquete("P-002", "Pereira");
        Paquete p3 = new Paquete("P-003");

        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
    }
}