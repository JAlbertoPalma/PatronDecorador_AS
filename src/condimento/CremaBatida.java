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
public class CremaBatida extends Condimento{

    public CremaBatida(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getCondimentoDescripcion() {
        return "Crema batida";
    }

    @Override
    public double getCondimentoCosto() {
        return 6.0;
    }
    
}
