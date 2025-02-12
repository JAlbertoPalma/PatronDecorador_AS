/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebida;

/**
 * Representa una bebida
 * @author Beto_
 */
public class Expresso implements Bebida{
    @Override
    public String getDescripcion() {
        return "Cafe Expresso";
    }

    @Override
    public double getCosto() {
        return 40.0;
    }
}
