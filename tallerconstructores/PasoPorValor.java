/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerconstructores;

/**
 *
 * @author estuam
 */
public class PasoPorValor {

    public static void main(String[] args) {

        Balanza b = new Balanza();
        double pesoOriginal = 3.5;

        System.out.println("Antes: " + pesoOriginal);
        b.duplicarPeso(pesoOriginal);
        System.out.println("Después: " + pesoOriginal);  // sigue en 3.5
    }
}