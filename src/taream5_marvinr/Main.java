/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taream5_marvinr;

/**
 *
 * @author marvi
 */


// Clase principal Main
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 5);
        circulo.dibujar();
        System.out.println("Area del circulo: " + circulo.calcularRadio());

        Linea linea = new Linea("Azul", 10);
        linea.dibujar();

        Triangulo triangulo = new Triangulo("Verde", 4, 6);
        triangulo.dibujar();
        System.out.println("Area del tringulo: " + triangulo.calcularArea());

        Cuadrado cuadrado = new Cuadrado("Amarillo", 3);
        cuadrado.dibujar();
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}