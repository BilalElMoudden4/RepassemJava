/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class CalcularPrecioFinal {
    public static void mostrarPrecios(List<Dispositivos> dispositivos) {
        for (Dispositivos dispositivo : dispositivos) {
            System.out.println(dispositivo.toString());
        }
    }
}