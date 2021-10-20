package com.generation;

public class Persona {

    //Modificador de acceso privado nos permite acceder solo a los elementos desde la misma clase
    private String nombre;
    private int edad;

    private void saludar(){
        System.out.println("Hola, soy "+this.nombre);
    }
}
