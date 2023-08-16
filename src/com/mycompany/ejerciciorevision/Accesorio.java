/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;


/**
 *
 * @author ET36
 */
public class Accesorio extends Producto {
    
    private double peso;
    private Talles metal;
    
    public Accesorio(double peso, Talles metal, String desc, double precio) {
        super(desc, precio);
        this.peso = peso;
        this.metal = metal;
    }
    
    @Override
    public double CalcularPrecio() {
        double preciofinal = 0;
        if (Talles.oro==metal) {
            preciofinal = peso * 100;
        } else if (Talles.plata==metal) {
            preciofinal = peso * 50;
            
        } else if (Talles.acero==metal) {
            preciofinal = peso * 25;
            
        }
        return preciofinal;
        
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString() {
        return "Bijouterie";
    }
    
}
