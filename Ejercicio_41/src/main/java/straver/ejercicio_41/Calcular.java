/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package straver.ejercicio_41;

/**
 *
 * @author macui
 */
public class Calcular {
    public static boolean isNumeric(String s)
    {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}

