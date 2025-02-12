/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condimento;

import bebida.Bebida;

/**
 * Representa un condimento
 * @author Beto_
 */
public class Soya extends Condimento{
    public Soya(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getCondimentoDescripcion() {
        return "Soya";
    }

    @Override
    public double getCondimentoCosto() {
        return 12.0;
    }
    
}
