/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package straver.ejercicio_10;

/**
 *
 * @author macui
 */
public class Matricula {
    public static double valor(double p, double e){
        double pago=50000;
        if ((p>2000000) && (e>3)){
        pago=pago+0.03*p;
        
    }
        return pago;
    }
}
