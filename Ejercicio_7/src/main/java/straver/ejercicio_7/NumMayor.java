/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package straver.ejercicio_7;

/**
 *
 * @author macui
 */
public class NumMayor {
    public static String calcular(double a, double b){
        if (a>b){
            return "Mayor";
        }
        else if (a<b){
            return "Menor";
        }
        else{
            return "Igual";
        }
    }
}
