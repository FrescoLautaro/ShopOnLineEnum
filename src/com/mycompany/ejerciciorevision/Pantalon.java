/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 * Pantalon realizado por Lorenzo
 * @author ET36
 */
public class Pantalon extends Producto {

    private Talles talle;
    private String modelo;

    public Pantalon(Talles talle, String modelo, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
        this.modelo = modelo;
    }

    @Override
    public double CalcularPrecio() {

        double precioFinal = 0;
        if ("Oxford".equalsIgnoreCase(modelo)) {
            precioFinal = precio + (precio * 15 / 100);

        } else if ("Skinny".equalsIgnoreCase(modelo)) {
            precioFinal = precio + (precio * 25 / 100);
        } else if ("Recto".equalsIgnoreCase(modelo)) {
            precioFinal = precio - (precio * 15 / 100);
        }

        return precioFinal;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "talle=" + talle;
    }

}
