/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taream5_marvinr;

/**
 *
 * @author marvi
 */

// Superclase Formas
public class Formas {
    private String color;

    public Formas(String color) {
        this.color = color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public String obtenerColor() {
        return color;
    }

    public void dibujar() {
        System.out.println("Dibujando una forma.");
    }
}
