
package pe.egcc.isil.armijos;

//import java.util.Scanner;

import javax.swing.JOptionPane;


public class Ejercicio04 {
    public static void main(String args[]){
        // Datos
        double num01 = Leer("1er Número ");
        double num02 = Leer("2do Número ");
        double num03 = Leer("3er Número");   
        double num04 = Leer("3er Número");   
        
        double mayor = 0.00;
        //String condicion = "";
        
        // Operacion        
        if(num01 > num02)
            mayor = num01;
        else if (num02 > num01)
            mayor = num02;
        
        if(mayor > num03)
            mayor = mayor;
        else
            mayor = num03;
        
        if(mayor > num04)
            mayor = mayor;
        else
            mayor = num04;
            
        
        // Reporte
        System.out.println("1er Número = " + num01);
        System.out.println("2do Número = " + num02);
        System.out.println("3er Número = " + num03);
        System.out.println("3er Número = " + num03);
        System.out.println("Número Mayor = " + mayor);        
        
    }

    private static double Leer(String dato) {
        String texto = JOptionPane.showInputDialog(dato);
        return Double.parseDouble(texto);
    }
}
