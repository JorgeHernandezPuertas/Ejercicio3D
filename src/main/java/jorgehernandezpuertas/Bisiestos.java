/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jorgehernandezpuertas;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Bisiestos {

    public static void main(String[] args) {

        /* 
        Hacer un bucle hasta que el usuario introduzca un 0. Si introduce un año negativo se pone positivo
        Una vez puesto en positivo en caso de ser necesario el programa debe decir si el año es bisiesto. 
        Para que sea bisiesto el año tiene que ser (divisible entre 4) y (no divisible entre 100 o divisible entre 400)
         */
        // Declaro la variable año
        int año;

        // Hago el bucle
        do {
            // Pido el año
            año = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));
            // Si el año es 0 salgo sin hacer nada, si no es 0 digo si es bisiesto
            if (año != 0) {
                año = Math.abs(año);
                boolean esBiesto = ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)));
                String resultado = año + " ¿es bisiesto? " + esBiesto;
                System.out.println(año + " ¿es bisiesto? " + esBiesto);
            }
        } while (año > 0);
    }
}
