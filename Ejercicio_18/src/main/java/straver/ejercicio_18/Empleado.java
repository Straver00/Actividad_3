/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package straver.ejercicio_18;

/**
 *
 * @author macui
 */
public class Empleado {
    String nombre;
    double code;
    
    public void setcode(double newcode){
        code=newcode;
    }
    public void setnombre(String newnombre){
        nombre=newnombre;
    }
    public double getcode(){
        return code;
    }
    public String getnombre(){
        return nombre;
    }
    
    public static double calcularSalarioBruto(double horas, double valor){
        double bruto;
        bruto=valor*horas;
        return bruto;
    }
    public static double calcularSalarioNeto(double horas, double valor, double porcen){
        double bruto;
        double neto;
        bruto=valor*horas;
        neto=bruto*(1-(porcen/100));
        return neto;
    }
}
