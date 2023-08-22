/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 * Remera realizado por Lautaro
 * @author ET36
 */
public class Remera implements Producto {

    private Talles talle;
    private String desc;
    private double precio;

    public Remera(Talles talle, String desc, double precio) {
        this.desc=desc;
        this.talle = talle;
        this.precio=precio;
    }

    @Override
    public double CalcularPrecio() {
        double precioFinal = 0;
        if (Talles.S==talle) {
            double por = (precio / 100) * 5;
            precioFinal = por + precio;
        } else if (Talles.M==talle) {
            precioFinal = precio + (precio * 10 / 100);
        } else if (Talles.L==talle) {
            precioFinal = precio + (precio * 15 / 100);
        } else {
            precioFinal = precio + (precio * 20 / 100);
        }

        return precioFinal;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "talle:" + talle;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public void setDesc(String desc) {
        this.desc=desc;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio=precio;
    }

}
