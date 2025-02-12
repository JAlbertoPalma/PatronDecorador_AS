/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condimento;

import bebida.Bebida;

/**
 * Clase que representa el patrón decorador
 * dando forma a los condimentos mediante una clase abstracta
 * utilizando métodos abstractos para modificar ligeramente su funcionamiento
 * @author Beto_
 */
abstract class Condimento implements Bebida{
    
    protected Bebida bebida;

    public Condimento(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + ", " + getCondimentoDescripcion();
    }
    
    @Override
    public double getCosto(){
        return bebida.getCosto() + getCondimentoCosto();
    }
    
    protected abstract String getCondimentoDescripcion();
    
    protected abstract double getCondimentoCosto();
}
