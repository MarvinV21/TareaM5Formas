/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taream5_marvinr;

/**
 *
 * @author marvi
 */

// Subclase Cuadrado
public class Cuadrado extends Formas {
    private final double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de color " + obtenerColor());
    }
}