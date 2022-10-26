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
public class InversorPalabras {

    public static void main(String[] args) {

        /* 
        Leo una palabra por teclado en bucle hasta que el usuario no escriba "salir". El programa tiene que
        convertir la palabra introducida en la inversa (ponerla al reves) 
        */
        String palabra, inversaPalabra = "";
        int recuentoPalabra = 0;
        do {
            // Pido la palabra
            palabra = JOptionPane.showInputDialog("Introduce una palabra");
            // Si la palabra es "Salir" salgo sin hacer nada, si es otra la invierto y lo saco por panel
            if (!(palabra.equalsIgnoreCase("salir"))) {
                for (recuentoPalabra = palabra.length(); recuentoPalabra > 0; recuentoPalabra--) {
                    inversaPalabra = inversaPalabra + palabra.substring(recuentoPalabra - 1, recuentoPalabra);
                }
                JOptionPane.showMessageDialog(null, "La inversa de " + palabra + " es " + inversaPalabra);
            }
        } while (!(palabra.equalsIgnoreCase("salir")));

    }
}
