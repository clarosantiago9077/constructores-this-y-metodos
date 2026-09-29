/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerconstructores;

/**
 *
 * @author estuam
 */
public class Hotel {

    public static void main(String[] args) {

        
        Habitacion h1 = new Habitacion(101, "Sencilla");
        Habitacion h2 = new Habitacion(102, "Doble");
        Habitacion h3 = new Habitacion(201, "Suite", 250000, false);

        h2.ocupar();

        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();

        System.out.println("¿h1 disponible? " + h1.estaDisponible());
        System.out.println("¿h2 disponible? " + h2.estaDisponible());

        
        System.out.println("3 noches sin descuento: " + h1.calcularEstadia(3));
        System.out.println("3 noches con 10% de descuento: " + h1.calcularEstadia(3, 10));
    }
}
