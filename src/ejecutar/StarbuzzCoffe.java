/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutar;

import bebida.Bebida;
import bebida.Expresso;
import condimento.CremaBatida;
import condimento.Leche;

/**
 * Clase para probar la implementación del patrón decorador
 * @author Beto_
 */
public class StarbuzzCoffe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos una bebida, en este caso,
        // un expresso
        Bebida bebida = new Expresso();
        System.out.println("Bebida: " + bebida.getDescripcion() 
                               + " $" + bebida.getCosto());
        
        //Le añadimos algunos condimentos
        bebida = new Leche(bebida);
        System.out.println("Bebida: " + bebida.getDescripcion() 
                               + " $" + bebida.getCosto());
        
        //Otro condimento
        bebida = new CremaBatida(bebida);
        System.out.println("Bebida: " + bebida.getDescripcion() 
                               + " $" + bebida.getCosto());
        
    }
    
}
