package com.mycompany.proyecto2_polimorfismp;


public abstract class Animal { 
    protected String nombre;
    public Animal(String nombre){ 
        this.nombre = nombre;
    }
    public abstract void hacerSonido(); 
}

