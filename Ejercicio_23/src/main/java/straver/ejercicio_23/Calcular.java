/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package straver.ejercicio_23;

/**
 *
 * @author macui
 */
public class Calcular {
    public static double sol1(double a, double b, double c){
        return (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c)) )/(2 * a);
    }
    public static double sol2(double a, double b, double c){
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) )/ (2 * a);
    }
}
