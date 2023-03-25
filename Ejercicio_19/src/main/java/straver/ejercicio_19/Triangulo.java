/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package straver.ejercicio_19;

/**
 *
 * @author macui
 */
public class Triangulo {

    public static String calcularPerimetro(double lado){
        return String.format("%.0f", lado*3);
    }
    public static String calcularArea(double lado){
        return String.format("%.3f", (lado*(Math.sqrt(3)/2*lado))/2);
    }
    public static String calcularAltura(double lado){
        return String.format("%.3f", (Math.sqrt(3)/2*lado));
    }
}
