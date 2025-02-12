/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bebida;

/**
 * Interfaz que deja la firma de los métodos
 * para que cada bebida los implemente
 * @author Beto_
 */
public interface Bebida {
    /**
     * Devuelve la descripción de la beibda
     * @return texto descriptivo
     */
    String getDescripcion();
    
    /**
     * Devuelve el costo de la bebida
     * @return costo en pesos $
     */
    double getCosto();
}
