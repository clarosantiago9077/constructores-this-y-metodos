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
        Paquete p4 = new Paquete("P-004", "Cali", 7.5, false);

        p3.actualizarPeso(2.5);

        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();

        double total = p1.calcularCosto() + p2.calcularCosto() + p3.calcularCosto();
        System.out.println("Total del envío: " + total);

        System.out.println(p1.calcularCosto(4000));  // 20000.0
        System.out.println(p2.calcularCosto(4000));  // 4000.0

        p4.mostrarInformacion("--- Revisión de p4 ---");

        if (p1.esPesado()) {
            System.out.println("Aviso: el paquete " + p1.codigo + " requiere manejo especial.");
        }
        if (p4.esPesado()) {
            System.out.println("Aviso: el paquete " + p4.codigo + " requiere manejo especial.");
        }
    }
}