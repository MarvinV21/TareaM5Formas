/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taream5_marvinr;

/**
 *
 * @author marvi
 */
// Subclase Circulo
public class Circulo extends Formas {
    private final double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double calcularRadio() {
        return Math.PI * radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo de color " + obtenerColor());
    }
}