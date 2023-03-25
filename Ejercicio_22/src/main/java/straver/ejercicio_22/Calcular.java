/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package straver.ejercicio_22;

/**
 *
 * @author macui
 */
public class Calcular {
    public static String calcular(double valor, double horas, String nombre){
        double x;
        x=valor*horas;
        if (x>450000){
            return (nombre+" tiene un salario de: "+x);
        }else{
            return (nombre);
        }
    }
}
