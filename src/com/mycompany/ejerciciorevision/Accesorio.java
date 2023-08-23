/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 * Accesorio realizado por Mel
 *
 * @author ET36
 */
public class Accesorio extends Producto {

    private double peso;
    private Talles metal;
    private String desc;
    private double precio;

    public Accesorio(double peso, Talles metal, String desc, double precio) {
        super(desc, precio);
        this.desc = desc;
        this.precio = precio;
        this.peso = peso;
        this.metal = metal;
    }

    @Override
    public double CalcularPrecio() {
        double preciofinal = 0;
        if (Talles.oro == metal) {
            preciofinal = peso * 100;
        } else if (Talles.plata == metal) {
            preciofinal = peso * 50;

        } else if (Talles.acero == metal) {
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

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
