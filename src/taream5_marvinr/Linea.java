/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taream5_marvinr;

/**
 *
 * @author marvi
 */

// Subclase Linea
public class Linea extends Formas {

    public Linea(String color, double largo) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una linea de color " + obtenerColor());
    }
}
