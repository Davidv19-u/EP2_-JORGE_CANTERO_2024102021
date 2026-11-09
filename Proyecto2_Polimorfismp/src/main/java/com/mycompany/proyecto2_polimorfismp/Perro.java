package com.mycompany.proyecto2_polimorfismp;


public class Perro extends Animal{
    public Perro(String nombre){ 
        super(nombre); 
    }
    
    @Override 
    public void hacerSonido(){
        System.out.println(nombre + " dice: guau!"); 
}
}