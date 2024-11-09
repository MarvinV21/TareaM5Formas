/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taream5_marvinr;

/**
 *
 * @author marvi
 */

// Subclase Triangulo
public class Triangulo extends Formas {
    private final double base;
    private final double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo de color " + obtenerColor());
    }
}